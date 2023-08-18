// 루시와 엘라 찾기
SELECT ANIMAL_ID,NAME,SEX_UPON_INTAKE from ANIMAL_INS 
where name in ('Lucy','Ella','Pickle','Rogan','Sabrina','Mitty')
order by ANIMAL_ID;

// 이름에 el이 들어가는 동물 찾기
SELECT ANIMAL_ID, NAME from ANIMAL_INS where upper(name) like upper('%el%') and ANIMAL_TYPE='Dog'
order by name;

// 중성화 여부 파악하기
SELECT ANIMAL_ID,NAME, 
case when SEX_UPON_INTAKE like '%Neutered%' or SEX_UPON_INTAKE like '%Spayed%' then 'O' else 'X' end 
from ANIMAL_INS 
order by ANIMAL_ID;

// NULL 처리하기
SELECT ANIMAL_TYPE, case when NAME is null then 'No name' else name end as name, SEX_UPON_INTAKE
from ANIMAL_INS order by ANIMAL_ID;

// DATETIME에서 DATE로 형 변환
SELECT ANIMAL_ID, NAME, to_char(DATETIME,'YYYY-MM-DD') from ANIMAL_INS order by animal_id;

// 3월에 태어난 여성 회원 목록 출력하기
SELECT MEMBER_ID, MEMBER_NAME, GENDER, to_char(DATE_OF_BIRTH, 'YYYY-MM-DD') from MEMBER_PROFILE 
where TLNO is not null and to_char(DATE_OF_BIRTH,'MM')='03' and gender='W'
order by MEMBER_ID;

// 카테고리 별 상품 개수 구하기
SELECT substr(PRODUCT_CODE,1,2) as CATEGORY, count(*) as PRODUCTS
from PRODUCT 
group by substr(PRODUCT_CODE, 1, 2)
order by CATEGORY;





