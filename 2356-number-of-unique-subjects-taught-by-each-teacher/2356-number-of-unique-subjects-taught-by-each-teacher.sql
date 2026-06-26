-- select COUNT(DISTINCT teacher_id) as teacher_id
-- COUNT(DISTINCT DEPT_ID) AS cnt
-- from particualr table
-- group by sub_id
-- 


select  teacher_id,
COUNT(DISTINCT subject_id) as cnt
from Teacher as t
group by teacher_id;

