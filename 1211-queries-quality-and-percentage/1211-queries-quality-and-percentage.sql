-- make table name cols
-- query_name 
-- table_name
-- use WHERE query_name = 'Dog' and 'Cat'
-- (ROUND(rating / percentage) / (SELECT count(*) from query_name), 2) as quality
-- and value  < 3
-- (ROUND(value / select COUNT(*) from rating)) as poor_query_percentage
-- group by query_name
-- order by quality desc;


select query_name,
ROUND(AVG(rating / position),2) as quality,
ROUND(
    SUM(CASE WHEN rating < 3 then 1 else 0 END) / COUNT(*) * 100
    ,2
) AS poor_query_percentage
from Queries
group by query_name;