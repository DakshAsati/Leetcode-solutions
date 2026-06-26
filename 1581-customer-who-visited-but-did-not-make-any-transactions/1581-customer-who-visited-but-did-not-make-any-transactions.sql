select customer_id,
COUNT(*)  as count_no_trans
from Visits as v
left join Transactions as ts
on v.visit_id = ts.visit_id
where transaction_id is NULL
group by v.customer_id;
