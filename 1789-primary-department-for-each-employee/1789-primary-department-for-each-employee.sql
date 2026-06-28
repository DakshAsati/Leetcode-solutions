-- if employee_id is having two department 'Y' and "N" then give 
-- department id with Y
-- and with only one departmernt report that only


-- check that if any employee is having two primary flag with different department id
-- then take 'Y' primary flag
-- then return department_id of particualr primary flag



SELECT employee_id,department_id
from Employee
where primary_flag = 'Y'
OR employee_id in(
    select employee_id
    from Employee
    group by employee_id
    having count(*) = 1
);


