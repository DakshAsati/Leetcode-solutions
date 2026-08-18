-- select query_name,
-- ROUND(AVG(rating / position),2) as quality,
-- ROUND(SUM(CASE WHEN rating < 3 then 1 or else 0 end) /COUNT(*) * 100, 2) as poor_query_percentage
-- from Queries as q
-- group by query_name
-- order by quality desc, poor_query_percentage asc;

select query_name,
ROUND(AVG(rating / position), 2) as quality,
ROUND(SUM(CASE WHEN rating < 3  then 1 else 0 end) / COUNT(*) * 100, 2) as poor_query_percentage
from Queries as q
group by query_name 
order by quality desc, poor_query_percentage asc;
