// 입양 시각 구하기(1)
SELECT TO_CHAR(datetime, 'FMHH24') as "hour", count(*)
from ANIMAL_OUTS 
where to_char(datetime,'HH24')>=09 and to_char(datetime,'HH24') <20
group by to_char(datetime,'FMHH24') order by TO_NUMBER(to_char(datetime,'FMHH24'));