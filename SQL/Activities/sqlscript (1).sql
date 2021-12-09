REM   Script: SQL_ACT1
REM   SQL session for B15

select * from scott.emp;

CREATE TABLE salesman ( 
    salesman_id int, 
    salesman_name varchar2(32), 
    salesman_city varchar2(32), 
    commission int 
);

