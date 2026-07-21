select customer_id
from Customer as c
left join Product as p
on c.product_key = p.product_key
group by customer_id
having COUNT(DISTINCT c.product_key) = (select count(*) from Product)