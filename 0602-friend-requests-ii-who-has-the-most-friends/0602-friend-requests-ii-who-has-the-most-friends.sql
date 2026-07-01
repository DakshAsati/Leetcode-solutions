select id , COUNT(*) AS num
FROM(
    SELECT requester_id as id
     from RequestAccepted


     UNION all

     SELECT accepter_id as id
     from RequestAccepted
)t

group by id
order by num desc
limit 1;