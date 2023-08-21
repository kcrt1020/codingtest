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