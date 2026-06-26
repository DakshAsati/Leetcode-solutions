select name
from Employee
where id IN(
    select managerId
    from employee
    GROUP BY managerId
    having COUNT(*) >= 5
)