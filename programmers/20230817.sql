// 역순 정렬하기
SELECT name, datetime from animal_ins order by animal_id desc;

// 아픈 동물 찾기
SELECT animal_id, name from animal_ins where intake_condition='Sick' order by animal_id;

// 어린 동물 찾기
SELECT animal_id, name from animal_ins where intake_condition != 'Aged' order by animal_id;

// 동물의 아이디와 이름
SELECT animal_id, name from animal_ins order by animal_id;

// 여러 기준으로 정렬하기
SELECT animal_id, name, datetime from animal_ins order by name asc, datetime desc;

// 상위 n개 레코드
select name from (SELECT name from animal_ins order by datetime) where rownum=1;

// 조건에 맞는 회원수 구하기
SELECT count(*) as "user" from user_info 
where joined >= to_date('2021-01-01','YYYY-MM-DD') and joined < to_date('2022-01-01','YYYY-MM-DD')
and age>=20 and age<=29;