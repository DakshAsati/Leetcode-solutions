SELECT e.name as EMPLOYEE
FROM EMPLOYEE e
JOIN EMPLOYEE m
ON e.managerid = m.id
WHERE e.salary > m.salary