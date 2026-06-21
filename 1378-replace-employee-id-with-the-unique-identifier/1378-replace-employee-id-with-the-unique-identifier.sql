select unique_id, name
from Employees as emp
left join EmployeeUNI as emp_uni
on emp.id = emp_uni.id
