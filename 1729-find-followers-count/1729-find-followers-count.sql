-- make table user_id
-- for follower count use count distinct for follower_id


select user_id,
COUNT(DISTINCT follower_id) as followers_count
from Followers
group by user_id
order by user_id asc;