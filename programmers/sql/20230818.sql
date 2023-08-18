// 입양 시각 구하기(1)
SELECT TO_CHAR(datetime, 'FMHH24') as "hour", count(*)
from ANIMAL_OUTS 
where to_char(datetime,'HH24')>=09 and to_char(datetime,'HH24') <20
group by to_char(datetime,'FMHH24') order by TO_NUMBER(to_char(datetime,'FMHH24'));

// 입양 시각 구하기(2)
SELECT b.hour, count(a.hour)
from (select to_char(DATETIME, 'FMHH24') as "HOUR" from ANIMAL_OUTS) a,
(select level-1 as "HOUR" from dual connect by level<=24) b
where a.hour(+)=b.hour
group by b.hour order by b.hour;

// 가격대 별 상품 개수 구하기
SELECT trunc(PRICE,-4) as "PRICE_GROUP", count(PRICE) as "PRODUCTS"
from PRODUCT 
group by trunc(PRICE,-4) order by trunc(PRICE,-4);

// 이름이 없는 동물의 아이디
SELECT ANIMAL_ID from ANIMAL_INS where NAME is null order by animal_id;

// 이름이 있는 동물의 아이디
SELECT ANIMAL_ID from ANIMAL_INS where NAME is not null order by animal_id;

// 강원도에 위치한 생산공장 목록 출력하기
SELECT FACTORY_ID, FACTORY_NAME, ADDRESS from FOOD_FACTORY 
where ADDRESS like '강원도%' order by FACTORY_ID;

// 경기도에 위치한 식품창고 목록 출력하기
SELECT WAREHOUSE_ID, WAREHOUSE_NAME, ADDRESS, 
case when FREEZER_YN is null then 'N' else FREEZER_YN end as FREEZER_YN from FOOD_WAREHOUSE  
where ADDRESS like '경기도%' order by WAREHOUSE_ID;

// 나이 정보가 없는 회원 수 구하기
SELECT count(*) as users from USER_INFO where age is null;

// 가장 비싼 상품 구하기
SELECT max(PRICE) as MAX_PRICE from PRODUCT;

// 12세 이하인 여자 환자 목록 출력하기
SELECT PT_NAME, PT_NO, GEND_CD, AGE, case when TLNO is null then 'NONE' else tlno end as TLNO 
from PATIENT 
where age <= 12 and GEND_CD='W' order by age desc, pt_name asc;

// 흉부외과 또는 일반외과 의사 목록 출력하기
SELECT DR_NAME, DR_ID, MCDP_CD, to_char(HIRE_YMD,'YYYY-MM-DD') as HIRE_YMD
from DOCTOR where MCDP_CD = 'CS' or MCDP_CD = 'GS'
order by HIRE_YMD desc, DR_NAME;

// 인기있는 아이스크림
SELECT flavor from FIRST_HALF order by TOTAL_ORDER desc, SHIPMENT_ID;

// 과일로 만든 아이스크림 고르기
SELECT fh.FLAVOR from FIRST_HALF fh, ICECREAM_INFO ii
where fh.FLAVOR=ii.FLAVOR and ii.INGREDIENT_TYPE='fruit_based' and fh.TOTAL_ORDER>=3000;

// 조건에 맞는 도서 리스트 출력하기
SELECT BOOK_ID, to_char(PUBLISHED_DATE,'YYYY-MM-DD') as PUBLISHED_DATE from BOOK
where CATEGORY='인문' and to_char(PUBLISHED_DATE,'YYYY')='2021' 
order by PUBLISHED_DATE;

// 평균 일일 대여 요금 구하기
SELECT round(avg(DAILY_FEE)) as AVERAGE_FEE from CAR_RENTAL_COMPANY_CAR where CAR_TYPE='SUV';

// 자동차 대여 기록에서 장기/단기 대여 구분하기
SELECT HISTORY_ID, CAR_ID, TO_CHAR(START_DATE, 'YYYY-MM-DD') AS START_DATE, TO_CHAR(END_DATE, 'YYYY-MM-DD') AS END_DATE,
CASE WHEN END_DATE - START_DATE+1 >= 30 THEN '장기 대여' ELSE '단기 대여' END AS RENT_TYPE
from CAR_RENTAL_COMPANY_RENTAL_HISTORY 
where to_char(start_date,'YYYY-MM')='2022-09' 
order by HISTORY_ID desc;

// 특정 옵션이 포함된 자동차 리스트 구하기
SELECT * from CAR_RENTAL_COMPANY_CAR where OPTIONS like '%네비게이션%' order by CAR_ID desc;

// 조건에 부합하는 중고거래 댓글 조회하기
SELECT b.TITLE, b.BOARD_ID, r.REPLY_ID, r.WRITER_ID, r.CONTENTS, to_char(r.CREATED_DATE,'YYYY-MM-DD')
from USED_GOODS_BOARD b, USED_GOODS_REPLY r 
where b.BOARD_ID=r.BOARD_ID and to_char(b.CREATED_DATE,'YYYY-MM') = '2022-10'
order by r.CREATED_DATE, b.TITLE;