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






