-- Question - 1581
-- concept - join + group + is null for transaction + 
-- pattern -> make customer_id table + count_no_trans with count of visit_id + join the table + declae transaction_id is null + group by customer_id
-- 


select customer_id,
COUNT(*) as count_no_trans
from Visits as v
left join Transactions as t
on v.visit_id = t.visit_id
where transaction_id is null
group by v.customer_id;

