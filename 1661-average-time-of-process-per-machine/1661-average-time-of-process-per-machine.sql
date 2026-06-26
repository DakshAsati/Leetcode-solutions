-- select machine_id,
-- ROUND((a1.timestamp - a2.timestamp) / COUNT(*) FROM activity_type) as activity_type
-- from Activity a1
-- join Activity a2
-- group by  machine_id


select a2.machine_id,
ROUND(AVG(a2.timestamp - a1.timestamp), 3) as processing_time
from Activity a1
join Activity a2
on a1.machine_id = a2.machine_id
and a1.process_id = a2.process_id
where a1.activity_type = 'start'
and a2.activity_type = 'end'
group by machine_id;