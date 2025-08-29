# Write your MySQL query statement below
SELECT MAX(salary) as secondhighestsalary
FROM Employee
WHERE salary < (SELECT MAX(salary) FROM EMPLOYEE)
