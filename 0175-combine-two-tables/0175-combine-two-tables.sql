# Write your MySQL query statement below

SELECT P.lastName, P.firstName, A.city, A.state
FROM PERSON P LEFT JOIN Address A on p.PersonId = A.personId