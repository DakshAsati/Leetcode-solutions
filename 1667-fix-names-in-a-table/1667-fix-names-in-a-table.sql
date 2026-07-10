-- ok so take table names
-- write table names
-- use concat and upper(left())

select user_id,
    concat(upper(left(name, 1)), lower(substring(name, 2))) as name
from Users
order by user_id;