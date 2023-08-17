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