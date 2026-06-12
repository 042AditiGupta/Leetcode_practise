# Write your MySQL query statement below
select Customer.customer_id 
from Customer
group by customer_id
having count(distinct Customer.product_key)=(select count(Product.product_key)from Product);