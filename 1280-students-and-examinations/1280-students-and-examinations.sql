-- means we have to ensure that every student is linked with every exam
-- and student_id and subject_name will used as cols in output table


select st.student_id,
st.student_name,
sb.subject_name,
COUNT(ex.subject_name) as attended_exams

from Students as st
CROSS JOIN Subjects as sb
LEFT JOIN Examinations as ex

on st.student_id = ex.student_id
and sb.subject_name = ex.subject_name

group by st.student_id, st.student_name,sb.subject_name

order by st.student_id, sb.subject_name;