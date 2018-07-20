--1. Write a query which will display the customer id, account type they hold, their account number and bank name.
SELECT 
	customer_id , 
	account_type, 
	account_no , 
	bank_info.bank_name 
FROM 
	account_info 
	INNER JOIN bank_info ON account_info.ifsc_code= bank_info.ifsc_code; 


--2. Write a query which will display the customer id, account type and the account number of HDFC customers who registered after 12-JAN-2012 and before 04-APR-2012.
SELECT 
	CUSTOMER_ID, 
	ACCOUNT_TYPE, 
	ACCOUNT_NO 
FROM 
	ACCOUNT_INFO 
	INNER JOIN BANK_INFO ON ACCOUNT_INFO.IFSC_CODE = BANK_INFO.IFSC_CODE
WHERE 
	BANK_NAME = 'HDFC' AND account_info.registration_date BETWEEN '12-01-2012' AND '04-04-2012';


--3. Write a query which will display the customer id, customer name, account no, account type and bank name where the customers hold the account.
SELECT
     customer_personal_info.customer_id,
     customer_personal_info.customer_name,
     account_info.account_no,
     bank_info.bank_name,
     account_info.customer_id ,
     account_info.account_type
 FROM
     customer_personal_info
     INNER JOIN account_info ON customer_personal_info.customer_id = account_info.customer_id
     INNER JOIN bank_info 
     ON account_info.ifsc_code = bank_info.ifsc_code
 WHERE
     account_info.account_no IS NOT NULL

--4. Write a query which will display the customer id, customer name, gender, marital status along with the unique reference string and
 sort the records based on customer id in descending order. <br/>
<br/><b>Hint:  </b>Generate unique reference string as mentioned below
:
<br/> CustomerName_Gender_MaritalStatus
<br/><b> Example, </b>
<br/> C-005           KUMAR              M                 SINGLE            KUMAR_M_SINGLE
<BR/> 
Use ""UNIQUE_REF_STRING"" as alias name for displaying the unique reference string."

