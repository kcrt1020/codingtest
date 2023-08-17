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