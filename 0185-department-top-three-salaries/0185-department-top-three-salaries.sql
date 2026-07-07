SELECT d.name AS Department,
       e.name AS Employee,
       e.salary AS Salary
FROM (
    SELECT e.*,
           DENSE_RANK() OVER (PARTITION BY departmentId ORDER BY salary DESC) AS rank_num
    FROM Employee e
) e
JOIN Department d
on e.departmentId = d.id
where e.rank_num <= 3;