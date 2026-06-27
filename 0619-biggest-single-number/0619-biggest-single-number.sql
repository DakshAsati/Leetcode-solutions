-- use num cols
-- for apperaing once use HAVING count = 1(for ex)
-- use case that if there is no single number report null
-- for largest single number use MAX

-- select num col
-- find number that appears once - 1,4,5,6
-- if there is no single number give null - use CASE
-- from all once numbers find max number using MAX
-- and give in table


select MAX(num) as num
from(
    select num
    from MyNumbers
    group by num
    having count(num) = 1

) as unique_number;





