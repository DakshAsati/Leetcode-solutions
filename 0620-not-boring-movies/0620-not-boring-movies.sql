select id, movie, description, rating
from Cinema as c
HAVING id % 2 = 1 and description != 'boring'
order by rating desc;