--create table
create table persons(lastname varchar2(20), firstname varchar2(20), address varchar2(20), city varchar2(20) , gender char(1) contstraint chk1 check(gender in ('M','F')));

--describe table
desc persons;

--alter table 
ALTER TABLE persons ADD Address varchar2(20);

--data insertion
insert into persons values('Tiwari', 'Vishal', 'Banglore', 'Whitefield');
insert into persons values('Sharma', 'Aman', 'Delhi', 'South Delhi');

insert into persons values('Sharma', 'Ankur', 'Delhi', 'South Delhi');
insert into persons values('Stark', 'Tony', 'New York', 'Manhatten');

insert into persons values('Pandey', 'Gaurav', 'Delhi', 'Ashok Nagar');

--selecting a col from table
select lastname from persons;
select firstname, lastname from persons;

--select unique rows
select distinct lastname from persons;

--where clause
select * from persons where city = 'Banglore';
select Firstname, LastName from persons where city = 'Banglore';
select Firstname, LastName from persons where city <> 'Banglore';
select firstname from persons where firstname != 'Vishal';

--pattern matching 
select firstname from persons where firstname like 'Vi%';
select firstname from persons where firstname not like 'Vi%';
select firstname from persons where firstname like '%sh%';
select firstname from persons where firstname not like '%sh%';

--inserting into specific cols
insert into persons vaulues(Firstname, address, city) values('Ankesh', 'Hitech City', 'Hyderabad');

--update
update persons set city='Banglore' where firstname = 'Aman';

--delete 
delete from persons where firstname like 'Ank%';

--single rows  math functions
select abs(-50) from dual;
select ceil(-5.3) from dual;
select floor(5.3) from dual;
select trunc(123.66, 1);
select round(5.363, 2) from dual;

--text functions
select concat('Vishal ', 'Tiwari') from dual;
select lower('DELOITTE') FROM dual;
select lower(firstname) from persons;
select upper(firstname) from persons;
select ltrim(' Vishal', ' ') from dual;
select ltrim('Vishal ', ' ') from dual;
select substr(firstname, 2,4) from persons;
select length('Vishal') from dual;

--date functions
select SYSDATE from dual;
SELECT CURRENT_DATE FROM DUAL;
SELECT CURRENT_TIME FROM DUAL;

--group by
SELECT COUNT(*), CITY, FIRSTNAME FROM PERSONS
GROUP BY CITY, FIRSTNAME;
SELECT SUM(salary), Dept from Employee group by Dept;


--employee table
create table Employee(Dept varchar2(20), salary number(5, 2), name varchar(20));
insert into employee values('IT', 200.00, 'Vishal');
insert into employee values('Sales', 300.00, 'Aman');
insert into employee values('HR', 500.00, 'Ankur');
insert into employee values('Manager', 900.00, 'Kaushal');
insert into employee values('Marketing', 400.00, 'Ankesh');

--select sum of sal for sales dept
select sum(salary), dept from Employee group by dept having dept='Sales';

--avg sal
select avg(salary), dept from Employee group by dept having dept='Sales';


--subquery (combine queries)
SELECT Dept FROM Employee where salary > (select avg(salary) from Employee);
select name from employee where salary = (select salary from employee where name = 'Sam');
select name from employee where salary = (select max(salary) from employee where dept = 'Sales') AND Dept='Sales';

select * from persons where city not in ('Banglore');

--order by
select * from persons order by asc;

--sailors table
create table sailors(sid number(10) , sname varchar2(20));
create table reserves(sid number(10));

--insert into sailors
insert into sailors values(10 , 'Vishal');
insert into sailors values(11 , 'Aman');
insert into sailors values(13 , 'Ankur');

--insert into reserves
insert into reserves values(10);
insert into reserves values(11);
insert into reserves values(13);

--query for sailors table
select s.sname from sailors s where s.sid in (select R.sid from reserves R where R.sid=13);

SELECT RESERVES.SID , SAILORS.SNAME FROM SAILORS, RESERVES 
WHERE SAILORS.SID = RESERVES.SID;


--PERSONAL AND OFFICIAL TABLE QUERY
SELECT P.NAME_EMP , P.BLOODGROUP, O.DEPT, O.SALARY FROM official O, personal P WHERE P.EMPID = O.EMPID;

--CORELATED TABLES
SELECT S.SNAME FROM SAILORS S WHERE EXISTS(
SELECT R.SID  FROM RESERVES R WHERE R.SID = 13 AND r.sid = S.SID
);


--CONSTRAINTS
--1. PRIMARY KEY
CREATE TABLE PRODUCT(IDEN INT CONSTRAINT PK1 PRIMARY KEY, NAME VARCHAR2(20)); 
ALTER TABLE PRODUCT ADD CONSTRAINT PK1 PRIMARY KEY (IDEN);

--2. FOREIGN KEY
CREATE TABLE CUSTDATA (CUST_IDEN INT CONSTRAINT PK2 PRIMARY KEY , IDEN INT CONSTRAINT FK1 FOREIGN KEY, CUST_NAME VARCHAR2(20)); 
CREATE TABLE ORDERSTABLE (ORDER_IDEN INT CONSTRAINT PK3 PRIMARY KEY , CUST_ID INTEGER REFERENCES CUSTDATA(CUST_IDEN) , PROD_NAME VARCHAR2(20));


--Author and Books tables
CREATE TABLE AUTHORS (AUTH_ID INT PRIMARY KEY , AUTH_NAME VARCHAR2(10));
CREATE TABLE BOOKS (BOOK_ID INT PRIMARY KEY , AUTH_ID INT REFERENCES AUTHORS(AUTH_ID), BOOK_NAME VARCHAR2(20));

INSERT INTO authors VALUES (101, 'Ankur');
INSERT INTO authors VALUES (102, 'Aman');


INSERT INTO books VALUES (501 ,101, 'Philosophy');
INSERT INTO books VALUES (502 ,101, 'Damn Philosophy');
INSERT INTO books VALUES (503 ,102, 'Science');
INSERT INTO books VALUES (504 ,102, 'Physics');

SELECT * FROM authors;
SELECT * FROM BOOKS;

--3. UNIQUE CONSTRAINT
ALTER TABLE EMP ADD CONSTRAINT UK1 UNIQUE KEY (PHONE_NUMBER);

--4. CHECK CONSTRAINTS (DOMAIN INTEGRITY)
ALTER TABLE PERSONS ADD CONSTRANIT CHCK CHECK (GENDER IN ('M', 'F'));

--DROPPING CONSTRAINT
ALTER TABLE PERSONS DROP CONSTRAINT CHCK;
