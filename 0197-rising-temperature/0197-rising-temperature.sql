-- find previous dates with help of current date
-- same with tempreture
-- compare previous one with todays tempreature 
-- and make sure that difference between previous date and todays date is one only

select id
from (
    select id,
            recordDate,
            temperature,
            LAG(temperature) OVER(ORDER by recordDate) as prev_temp,
            LAG(recordDate) OVER(ORDER BY recordDate) as prev_date
from Weather

)x
where temperature > prev_temp and DATEDIFF(recordDate,  prev_date) = 1
