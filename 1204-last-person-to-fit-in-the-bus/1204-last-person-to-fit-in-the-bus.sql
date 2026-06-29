-- sort the given turn
-- make tables in 
-- which first one is turn and in last sort it
--  use person_id and in table give name ID
-- use name table
-- again use weight from table
-- use total weight for sum and put condition that it cannaot be greater then 1000z


WITH temp AS (
    SELECT
        person_name,
        turn,
        SUM(weight) OVER (ORDER BY turn) AS total_weight
    FROM Queue
)
SELECT person_name
FROM temp
WHERE total_weight <= 1000
ORDER BY turn DESC
LIMIT 1;