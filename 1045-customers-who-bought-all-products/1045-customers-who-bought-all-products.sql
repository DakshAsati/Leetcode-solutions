-- make customer_id
-- use table name Customer and product table
-- and match product_key of both tables
-- group by customer id



select customer_id
from Customer as c
left join Product as p
on c.product_key = p.product_key
group by customer_id
having COUNT(DISTINCT c.product_key) = (SELECT COUNT(*) FROM Product);


-- select MAX(customer_id) as customer_id
-- from (
-- select customer_id
-- from Customer as c
-- join Product as p
-- on c.product_key = p.product_key
-- group by customer_id
-- ) as id;