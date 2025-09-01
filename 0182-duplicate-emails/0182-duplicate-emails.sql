# Write your MySQL query statement below

SELECT EMAIL
from PERSON
GROUP BY email
HAVING count(email) >= 2;
