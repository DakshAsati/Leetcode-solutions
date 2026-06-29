-- select category 
-- use from 
-- inside it again write
-- category, 
-- use case and inside it use 'low salary', 'average salary', High salary' conditions
-- count the income on basis of low salary,avergae salary and high salary as accounts_count
-- give table name
-- use alias outside it
-- group by account_counts



select
    'Low Salary' as category,
    COUNT(*) as accounts_count
    from Accounts
    where income  < 20000

UNION ALL

SELECT 
    'Average Salary' as category,
    COUNT(*) as accounts_count
    from Accounts
    where income between 20000 and 50000

    UNION ALL

SELECT 
        'High Salary' as category,
        COUNT(*) AS accounts_count
        from Accounts
        where income > 50000;