select contest_id, 
ROUND(COUNT(r.user_id) *100.0 / (select count(*) from Users),2) as percentage
from Register as r
group by contest_id
order by percentage desc, contest_id asc;