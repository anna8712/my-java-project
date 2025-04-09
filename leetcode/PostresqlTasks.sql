--Managers with at Least 5 Direct Reports
-- +-------------+---------+
-- | Column Name | Type    |
-- +-------------+---------+
-- | id          | int     |
-- | name        | varchar |
-- | department  | varchar |
-- | managerId   | int     |
-- +-------------+---------+
-- Write a solution to find managers with at least five direct reports.

select m.name
from Employee e 
join Employee m on e.managerId = m.id
group by m.id, m.name
having count(*) >= 5