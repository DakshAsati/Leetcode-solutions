SELECT P.firstName, P.lastName, A.state,A.city
FROM Person P
LEFT JOIN Address A on  P.personId = A.personId