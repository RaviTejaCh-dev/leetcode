# Write your MySQL query statement below
SELECT name FROM Customer where id not in (select id from Customer where referee_id = 2) ;
