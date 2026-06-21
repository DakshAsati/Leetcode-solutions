select product_name, year, price
from Sales as sa
left join Product as pd
on sa.product_id = pd.product_id;