-- output is in multiple row
-- product_id table is involved and we have to make new cols name price
-- relationship - for product_id it is GROUP BY 
-- s - 3 =  for product_id I am grouping


-- for each product
-- just check on given date
-- among remaining changes
-- take the latest one
-- if nothing remains
-- take 10

WITH cte AS (
    SELECT
        product_id,
        new_price,
        change_date,
        ROW_NUMBER() OVER (
            PARTITION BY product_id
            ORDER BY change_date DESC
        ) AS rn
    FROM Products
    WHERE change_date <= '2019-08-16'
)

SELECT product_id, new_price AS price
FROM cte
WHERE rn = 1

UNION

SELECT DISTINCT product_id, 10 AS price
FROM Products
WHERE product_id NOT IN (
    SELECT product_id
    FROM Products
    WHERE change_date <= '2019-08-16'
);