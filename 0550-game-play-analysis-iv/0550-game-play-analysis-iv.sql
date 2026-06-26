SELECT 
    ROUND(
        COUNT(DISTINCT a.player_id) / (SELECT COUNT(DISTINCT player_id) from Activity), 2
    )as fraction

from Activity a

JOIN(
    SELECT 
        player_id,
        MIN(event_date) as first_login
        from Activity
        group by player_id

        
)f

on a.player_id = f.player_id
where DATEDIFF(a.event_date, f.first_login) = 1;