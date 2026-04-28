# Write your MySQL query statement below
select w.id 
from Weather as w
join Weather as we
on datediff(w.recordDate,we.recordDate)=1
where w.temperature>we.temperature;