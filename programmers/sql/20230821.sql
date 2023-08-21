// 상품 별 오프라인 매출 구하기
SELECT p.PRODUCT_CODE, sum(p.PRICE*o.SALES_AMOUNT) as SALES from PRODUCT p, OFFLINE_SALE o
where p.PRODUCT_ID=o.PRODUCT_ID
group by p.PRODUCT_CODE
order by sum(p.PRICE*o.SALES_AMOUNT) desc, p.PRODUCT_CODE;

// 재구매가 일어난 상품과 회원 리스트 구하기
select user_id, PRODUCT_ID from ONLINE_SALE group by user_id,PRODUCT_ID having count(*)>1
ORDER BY user_id, PRODUCT_ID DESC;

// 조건에 맞는 도서와 저자 리스트 출력하기
SELECT b.BOOK_ID, a.AUTHOR_NAME, to_char(b.PUBLISHED_DATE,'YYYY-MM-DD') as PUBLISHED_DATE
from BOOK b, AUTHOR a 
where b.AUTHOR_ID=a.AUTHOR_ID and b.CATEGORY='경제' 
order by b.PUBLISHED_DATE;

// 진료과별 총 예약 횟수 출력하기
SELECT MCDP_CD as "진료과 코드", count(*) as "5월예약건수" from APPOINTMENT 
where to_char(APNT_YMD, 'YYYY-MM') = '2022-05'
group by MCDP_CD
order by count(*), MCDP_CD;

// 자동차 종류 별 특정 옵션이 포함된 자동차 수 구하기
SELECT CAR_TYPE, count(*) as CARS from CAR_RENTAL_COMPANY_CAR 
where OPTIONS like '%통풍시트%'
or OPTIONS like '%열선시트%'
or OPTIONS like '%가죽시트%'
group by CAR_TYPE
order by CAR_TYPE;

// 자동차 평균 대여 기간 구하기
SELECT CAR_ID, round(avg((END_DATE)-(START_DATE)+1),1) as AVERAGE_DURATION 
from CAR_RENTAL_COMPANY_RENTAL_HISTORY 
group by CAR_ID
having round(avg((END_DATE)-(START_DATE)+1),1) >= 7
order by round(avg((END_DATE)-(START_DATE)+1),1) desc, CAR_ID desc;

// 조건에 부합하는 중고거래 상태 조회하기
SELECT BOARD_ID, WRITER_ID, TITLE, PRICE,
case when STATUS = 'SALE' then '판매중' when STATUS = 'RESERVED' then '예약중' else '거래완료' end as STATUS
from USED_GOODS_BOARD where to_char(CREATED_DATE,'YYYY-MM-DD')='2022-10-05'
order by BOARD_ID desc;