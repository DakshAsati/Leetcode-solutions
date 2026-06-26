-- make class columns
-- count number of each subject
-- make a condition that any subject greater then or equal to 5 
-- group by class

select class
from Courses
group by class
having count(student) >= 5