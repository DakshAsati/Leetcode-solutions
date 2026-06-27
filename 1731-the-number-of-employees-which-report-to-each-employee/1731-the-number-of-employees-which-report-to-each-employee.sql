-- give employee_id,name as it is in select
-- ctach report_to of particular name in one table
-- then match those repport_to to employee_id in other table(make second table)
-- use self join
-- count matching values and give in report count
-- with those matching values find avergae of age and 
-- list in avergae_age


select e2.employee_id,e2.name,
COUNT(*) as reports_count,
ROUND(AVG(e1.age)) as average_age
from Employees e1 
join Employees e2
on e1.reports_to = e2.employee_id
group by e2.employee_id,e2.name
order by e2.employee_id;