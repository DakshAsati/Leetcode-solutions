CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
        SET N = N - 1;
  RETURN (
    SELECT DISTINCT salary
    FROM EMPLOYEE
    Order by salary desc
    LIMIT  1 OFFSET N
   
  );
END