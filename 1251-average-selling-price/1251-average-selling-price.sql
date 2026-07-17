select p.product_id,
ROUND(IFNULL(SUM(p.price * us.units) / SUM(us.units), 0),2) as average_price
from Prices as p
left join UnitsSold as us
on p.product_id = us.product_id
and us.purchase_date between  p.start_date and p.end_date
group by p.product_id;