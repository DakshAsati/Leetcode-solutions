select customer_id,
COUNT(*) as count_no_trans
from Visits as vis
left join Transactions as ts
on vis.visit_id = ts.visit_id
where transaction_id is null
group by vis.customer_id