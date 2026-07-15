-- visit id match karwani hogi
-- 

select customer_id,
COUNT(*) as count_no_trans
from Visits as vs
left join Transactions as ts
on vs.visit_id = ts.visit_id
where transaction_id is null
group by customer_id
order by vs.visit_id desc