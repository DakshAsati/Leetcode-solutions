-- output cols - x,y,z(given)
-- (make) output cols - traingle condition x + y > z
--  Triangle table
-- if x + y > z is true then 'Yes' else 'No'
-- group with x,y,z


select x,y,z,
IF(x + y > z and y + z > x and x+ z > y, 'Yes', 'No') as triangle
from Triangle;


