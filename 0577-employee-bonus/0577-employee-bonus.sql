-- make two columns name and bonus using select
-- give me small names for employee as emp
-- left join with bonus as bs
-- use where (here match empID of two tables)
-- apply condition that bonus is less then 100
-- or didnot get bonus


select name,bonus
from Employee as emp
left join Bonus as bs
on emp.empId = bs.empId 
where bonus < 1000 or bonus is null;