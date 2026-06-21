select id
FROM(
    SELECT id,
        recordDate,
        temperature,
        LAG(temperature) OVER(ORDER BY recordDate) as prev_temp,
        LAG(recordDate) OVER(ORDER BY recordDate) as prev_date
from Weather
)x
WHERE temperature > prev_temp and DATEDIFF(recordDate, prev_date) = 1

