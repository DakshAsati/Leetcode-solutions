# Write your MySQL query statement below
SELECT ROUND(SUM(tiv_2016), 2) as tiv_2016
from Insurance
WHERE tiv_2015 in(
    select tiv_2015
    from Insurance
    group by tiv_2015
    having count(*) > 1
)

AND (lat, lon) in(
    SELECT lat, lon
    from Insurance
    GROUP BY lat, lon
    HAVING COUNT(*) = 1
)