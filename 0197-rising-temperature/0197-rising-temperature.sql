-- first take the record of previois date and temp
-- then compare it 
-- use date diff for finding exact one day before date

select id
from(
    select id,
    recordDate,
    temperature ,
    LAG(recordDate) OVER(ORDER BY recordDate) as prev_date,
    LAG(temperature) OVER(ORDER BY recordDate) as prev_temp
    from Weather

)x

where temperature  > prev_temp and DATEDIFF(recordDate, prev_date) = 1;