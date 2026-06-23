select name 
from Employee
WHERE id IN(
    SELECT managerId
    from Employee
    group by managerId
    HAVING COUNT(*) >= 5

)
