select id
from (
    select id,
    recordDate,
    temperature,
    LAG(recordDate) OVER(ORDER BY recordDate) as prev_date,
    LAG(temperature) OVER(ORDER BY recordDate) as prev_temp
    from Weather
)x
where prev_temp <  temperature   and DATEDIFF(recordDate, prev_date) = 1;


-- find high  temp with compare to previous temp
-- previous temp sirf ek din pehle ka