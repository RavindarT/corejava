select 
ID, firstName, lastName
from customer
where length(concat( firstName, lastName)) < 12
order by  length(concat( firstName, lastName)) , concat( firstName, lastName), id;


select 
name
from superhero
where length(name) <= 6
order by id asc;


select
count(*)
from Orders
where status not in ('DELIVERED');

select id, name
from student
where scrore > ( select avg(scrore) from student) ;
