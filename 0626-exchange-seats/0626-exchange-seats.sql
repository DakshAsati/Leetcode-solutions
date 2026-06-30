-- if number is odd then don't swap last one
-- if number is even then swap all with there respective


-- give id table name
-- first count number of names
-- if even then swap till last
-- if odd then don't swap last
-- use swap to swap the names
-- like use condtion when that id % 2 == 0 then it is even else odd


SELECT
CASE
   when id = (select max(id) from seat)
   and id % 2 = 1
   then id
   
when id % 2 = 1
then id + 1

else id - 1

end as id,
student
from Seat
order by id;