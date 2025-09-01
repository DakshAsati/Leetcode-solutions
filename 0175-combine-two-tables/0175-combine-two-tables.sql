# Write your MySQL query statement below

-- SELECT P.lastName, P.firstName, A.city, A.state
-- FROM PERSON P LEFT JOIN ADDRESS A on P.personId = A.personId


SELECT P.Lastname, P.firstName, A.city, A.state
FROM Person P LEFT JOIN Address A on P.personId = A.personId