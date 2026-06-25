-- make project_id column normally and for avergae years
-- use ROUND(IFNULL(AVG(EXPERIENCE_years) / COUNT(experince_years), 0), 2) as average_years
-- name project table as p
-- employee table as e
-- match employee_id of project and employee
-- group by project_id
-- order by project_id as asc


select project_id, 
ROUND(IFNULL(AVG(experience_years), 0), 2) as average_years
from Project as p
left join Employee as e
on p.employee_id = e.employee_id
group by project_id
order by project_id asc;