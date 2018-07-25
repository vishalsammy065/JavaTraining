1.*Write a query which will display the customer id, account type they hold, their account number and bank name.
SELECT CUSTOMER_ID,ACCOUNT_TYPE,ACCOUNT_NO,BANK_NAME 
FROM BANK_INFO,ACCOUNT_INFO WHERE BANK_INFO.IFSC_CODE=ACCOUNT_INFO.IFSC_CODE

2.*Write a query which will display the customer id, account type and the account number of HDFC customers who registered after 12-JAN-2012 and before 04-APR-2012.
SELECT CUSTOMER_ID,ACCOUNT_TYPE,ACCOUNT_NO
FROM BANK_INFO,ACCOUNT_INFO 
WHERE BANK_NAME = 'HDFC'
AND ACTIVATION_DATE BETWEEN '12-01-2012' AND '04-03-2012'
AND BANK_INFO.IFSC_CODE=ACCOUNT_INFO.IFSC_CODE;

3.*Write a query which will display the customer id, customer name, account no, account type and bank name where the customers hold the account.
SELECT ACCOUNT_INFO.CUSTOMER_ID,CUSTOMER_NAME,ACCOUNT_TYPE,ACCOUNT_NO,BANK_NAME 
FROM BANK_INFO,ACCOUNT_INFO,CUSTOMER_PERSONAL_INFO
WHERE BANK_INFO.IFSC_CODE=ACCOUNT_INFO.IFSC_CODE
AND CUSTOMER_PERSONAL_INFO.CUSTOMER_ID = ACCOUNT_INFO.CUSTOMER_ID

4.*Write a query which will display the customer id, customer name, gender, marital status along with the unique reference string and
 sort the records based on customer id in descending order. <br/>
<br/><b>Hint:  </b>Generate unique reference string as mentioned below
:
<br/> CustomerName_Gender_MaritalStatus
<br/><b> Example, </b>
<br/> C-005           KUMAR              M                 SINGLE            KUMAR_M_SINGLE
<BR/> 
Use ""UNIQUE_REF_STRING"" as alias name for displaying the unique reference string."

SELECT
    customer_id|| ' ' ||
    customer_name|| ' ' ||
    gender|| ' ' ||
    marital_status UNIQUE_REF_STRING
FROM
    customer_personal_info
ORDER BY customer_id DESC;

5.*Write a query which will display the account number, customer id, registration date, initial deposit amount of the customer
 whose initial deposit amount is within the range of Rs.15000 to Rs.25000.
SELECT
    account_no,
    customer_id,
    registration_date,
    initial_deposit
FROM
    account_info
WHERE
    initial_deposit BETWEEN 15000 AND 25000;
    
6.*Write a query which will display customer id, customer name, date of birth, guardian name of the customers whose name starts with 'J'.
  SELECT
    customer_id,
    customer_name,
    date_of_birth,
    guardian_name
FROM
    customer_personal_info
WHERE
    customer_name LIKE 'J%'; 
    
7.*Write a query which will display customer id, account number and passcode. 
<br/>
Hint:  To generate passcode, join the last three digits of customer id and last four digit of account number.
 
<br/>Example
<br/>C-001                   1234567898765432                0015432
<br/>Use ""PASSCODE"" as alias name for displaying the passcode."

SELECT
    customer_id,
    account_no,
    CONCAT(SUBSTR(customer_id,-3),SUBSTR(account_no,-4)) PASSCODE    
FROM
    account_info;
    
8.*Write a query which will display the customer id, customer name, date of birth, Marital Status, Gender, Guardian name, 
contact no and email id of the customers whose gender is male 'M' and marital status is MARRIED.
 SELECT
    customer_id,
    customer_name,
    date_of_birth,
    marital_status,
    gender,
    guardian_name,
    CONTACT_NO,
    MAIL_ID
FROM
    customer_personal_info
WHERE
    gender='M' AND marital_status='MARRIED';
    
9.*Write a query which will display the customer id, customer name, guardian name, reference account holders name of the customers 
who are referenced / referred by their 'FRIEND'.
 SELECT
    customer_personal_info.customer_id,
    customer_name,
    guardian_name,
    reference_acc_name
FROM
    customer_reference_info,
    customer_personal_info   
WHERE 
    customer_personal_info.customer_id=customer_reference_info.customer_id AND
    relation='FRIEND';
    
10.*Write a query to display the customer id, account number and interest amount in the below format with INTEREST_AMT as alias name
 Sort the result based on the INTEREST_AMT in ascending order.  <BR/>Example: 
$5<BR/>Hint: Need to prefix $ to interest amount and round the result without decimals.
SELECT
    customer_id,
    account_no,
    '$' || ((interest/100)*initial_deposit) INTEREST_AMT 
FROM
    account_info
ORDER BY TO_NUMBER(SUBSTR(INTEREST_AMT,2));
    
    
11.*Write a query which will display the customer id, customer name, account no, account type, activation date,
 bank name whose account will be activated on '10-APR-2012'
SELECT
    account_info.customer_id,
    CUSTOMER_NAME, 
    account_no,     
    account_type,
    activation_date,
    BANK_NAME
FROM
    account_info,
    BANK_INFO,
    CUSTOMER_PERSONAL_INFO
WHERE 
    activation_date='10-APR-2012' AND 
    BANK_INFO.ifsc_code = account_info.ifsc_code AND 
    CUSTOMER_PERSONAL_INFO.customer_id = account_info.customer_id
    
    
12.*Write a query which will display account number, customer id, customer name, bank name, branch name, ifsc code
, citizenship, interest and initial deposit amount of all the customers.
SELECT
    account_no, 
    ACCOUNT_INFO.customer_id,
    customer_name,
    bank_name,
    BRANCH_NAME,
    BANK_INFO.ifsc_code,
    citizenship,
    INTEREST,
    initial_deposit    
FROM
    customer_personal_info,
    ACCOUNT_INFO,
    BANK_INFO
WHERE     
    BANK_INFO.ifsc_code = account_info.ifsc_code AND 
    CUSTOMER_PERSONAL_INFO.customer_id = account_info.customer_id
    
    
13.*Write a query which will display customer id, customer name, date of birth, guardian name, contact number,
 mail id and reference account holder's name of the customers who has submitted the passport as an identification document.
SELECT
    customer_personal_info.customer_id,
    customer_name,
    date_of_birth,
    guardian_name,  
    contact_no,
    mail_id,
    gender,
    REFERENCE_ACC_NAME
FROM
    customer_personal_info,
    CUSTOMER_REFERENCE_INFO
WHERE 
    identification_doc_type= 'PASSPORT' AND
    customer_personal_info.customer_id = CUSTOMER_REFERENCE_INFO.customer_id
    
    
14.*Write a query to display the customer id, customer name, account number, account type, initial deposit, 
interest who have deposited maximum amount in the bank.
SELECT
    account_info.customer_id,   
    CUSTOMER_NAME ,
    account_no,
    account_type,
    initial_deposit,
    interest
FROM
    account_info,
    CUSTOMER_PERSONAL_INFO
WHERE 
    CUSTOMER_PERSONAL_INFO.customer_id=account_info.customer_id AND
    initial_deposit = (SELECT MAX(initial_deposit) FROM account_info);
    
    
15.*Write a query to display the customer id, customer name, account number, account type, interest, bank name 
and initial deposit amount of the customers who are getting maximum interest rate.
SELECT
    account_info.customer_id,   
    CUSTOMER_NAME ,
    account_no,
    account_type,
    interest,
    BANK_NAME,
    initial_deposit
FROM
    account_info,
    CUSTOMER_PERSONAL_INFO,
    BANK_INFO
WHERE 
    CUSTOMER_PERSONAL_INFO.customer_id=account_info.customer_id AND
    BANK_INFO.IFSC_CODE = account_info.IFSC_CODE AND 
    interest = (SELECT MAX(interest) FROM account_info);
    
    
16.Write a query to display the customer id, customer name, account no, bank name, contact no 
and mail id of the customers who are from BANGALORE.
SELECT
    account_info.customer_id,
    customer_name,
    BANK_NAME
    contact_no,
    mail_id
FROM
    customer_personal_info,
    account_info,
    BANK_INFO
WHERE 
    
    CUSTOMER_PERSONAL_INFO.customer_id=account_info.customer_id AND
    BANK_INFO.IFSC_CODE = account_info.IFSC_CODE AND 
    ADDRESS LIKE '%BANGALORE';
    
    
17.Write a query which will display customer id, bank name, branch name, ifsc code, registration date, 
activation date of the customers whose activation date is in the month of march (March 1'st to March 31'st).

SELECT
    customer_id,
    BANK_NAME,
    BRANCH_NAME,
    account_info.IFSC_CODE,
    registration_date,
    activation_date
FROM
    account_info,
    BANK_INFO
WHERE
     BANK_INFO.IFSC_CODE = account_info.IFSC_CODE AND 
      to_char(activation_date,'mm') = '03';
      
      
18.Write a query which will calculate the interest amount and display it along with customer id, customer name, 
account number, account type, interest, and initial deposit amount.<BR>Hint :Formula for interest amount, 
calculate: ((interest/100) * initial deposit amt) with column name 'interest_amt' (alias)
SELECT
    account_info.customer_id,
    CUSTOMER_NAME,
    account_no,
    account_type,
    interest,
    initial_deposit,
    ((interest/100)*initial_deposit) interest_amt
FROM
    account_info,
    CUSTOMER_PERSONAL_INFO
WHERE 
    account_info.customer_id = CUSTOMER_PERSONAL_INFO.customer_id;
    
    
19.Write a query to display the customer id, customer name, date of birth, guardian name, contact number, 
mail id, reference name who has been referenced by 'RAGHUL'.
SELECT
    customer_personal_info.customer_id,
    customer_name,
    date_of_birth,
    guardian_name,
    contact_no,
    mail_id,
    REFERENCE_ACC_NAME
FROM
    customer_personal_info,
    CUSTOMER_REFERENCE_INFO
WHERE 
    customer_personal_info.customer_id = CUSTOMER_REFERENCE_INFO.customer_id AND
    REFERENCE_ACC_NAME = 'RAGHUL';

20."Write a query which will display the customer id, customer name and contact number with ISD code of 
all customers in below mentioned format.  Sort the result based on the customer id in descending order. 
<BR>Format for contact number is :  
<br/> ""+91-3digits-3digits-4digits""
<br/> Example: +91-924-234-2312
<br/> Use ""CONTACT_ISD"" as alias name."
SELECT
    customer_id,
    customer_name,
    '+91' || '-' || SUBSTR(contact_no,1,3) ||'-' || SUBSTR(contact_no,4,3) ||'-' || SUBSTR(contact_no,7,4) CONTACT_ISD
FROM
    customer_personal_info;
    
    
21.Write a query which will display account number, account type, customer id, customer name, date of birth, guardian name, 
contact no, mail id , gender, reference account holders name, reference account holders account number, registration date, 
activation date, number of days between the registration date and activation date with alias name "NoofdaysforActivation", 
bank name, branch name and initial deposit for all the customers.
SELECT
    account_no,
    account_type,
    account_info.customer_id,
    CUSTOMER_NAME,
    date_of_birth,
    guardian_name,
    contact_no,
    mail_id,
    gender,
    reference_acc_no, 
    REFERENCE_ACC_NAME,
    registration_date, 
    ACTIVATION_DATE,
    ACTIVATION_DATE-registration_date NoofdaysforActivation,
    bank_name, 
    BRANCH_NAME,
    INITIAL_DEPOSIT
FROM
    account_info,
    BANK_INFO,
    CUSTOMER_PERSONAL_INFO,
    CUSTOMER_REFERENCE_INFO
WHERE 
    account_info.IFSC_CODE = BANK_INFO.IFSC_CODE AND
    account_info.customer_id = CUSTOMER_PERSONAL_INFO.customer_id AND
    account_info.customer_id = CUSTOMER_REFERENCE_INFO.customer_id;
    
    
22."Write a query which will display customer id, customer name,  guardian name, identification doc type,
 reference account holders name, account type, ifsc code, bank name and current balance for the customers 
who has only the savings account. 
<br/>Hint:  Formula for calculating current balance is add the intital deposit amount and interest
 and display without any decimals. Use ""CURRENT_BALANCE"" as alias name."
SELECT
    ACCOUNT_INFO.customer_id,
    customer_name,  
    guardian_name,
    identification_doc_type,
    REFERENCE_ACC_NAME,
    ACCOUNT_TYPE,
    ACCOUNT_INFO.ifsc_code, 
    BANK_NAME,
    INITIAL_DEPOSIT+((INTEREST/100)*INITIAL_DEPOSIT)  CURRENT_BALANCE
FROM
    CUSTOMER_REFERENCE_INFO,
    customer_personal_info,
    ACCOUNT_INFO,
    BANK_INFO
WHERE 
    account_info.IFSC_CODE = BANK_INFO.IFSC_CODE AND
    account_info.customer_id = CUSTOMER_PERSONAL_INFO.customer_id AND
    account_info.customer_id = CUSTOMER_REFERENCE_INFO.customer_id AND
    ACCOUNT_TYPE='SAVINGS';
    
    
23."Write a query which will display the customer id, customer name, account number, account type, interest, initial deposit;
 <br/>check the initial deposit,<br/> if initial deposit is 20000 then display ""high"",<br/> if initial deposit is 16000 display 'moderate'
,<br/> if initial deposit is 10000 display 'average', <br/>if initial deposit is 5000 display 'low', <br/>if initial deposit is 0 display
 'very low' otherwise display 'invalid' and sort by interest in descending order.<br/>
Hint: Name the column as ""Deposit_Status"" (alias). 
<br/>Strictly follow the lower case for strings in this query."
SELECT
    account_info.customer_id,
    CUSTOMER_NAME,
    account_no,
    account_type,
    interest,
    initial_deposit,
    CASE initial_deposit 
        WHEN 20000 THEN 'high'
        WHEN 16000 THEN 'moderate'
        WHEN 10000 THEN 'average'
        WHEN 5000 THEN 'low'   
        WHEN 0 THEN 'very low'   
         ELSE 'invalid' END
FROM
    account_info,
    CUSTOMER_PERSONAL_INFO
WHERE
    account_info.customer_id = CUSTOMER_PERSONAL_INFO.customer_id
ORDER BY interest DESC;


24."Write a query which will display customer id, customer name,  account number, account type, bank name, ifsc code, initial deposit amount
 and new interest amount for the customers whose name starts with ""J"". 
<br/> Hint:  Formula for calculating ""new interest amount"" is 
if customers account type is savings then add 10 % on current interest amount to interest amount else display the current interest amount.
 Round the new interest amount to 2 decimals.<br/> Use ""NEW_INTEREST"" as alias name for displaying the new interest amount.

<br/>Example, Assume Jack has savings account and his current interest amount is 10.00, then the new interest amount is 11.00 i.e (10 + (10 * 10/100)). 
"
SELECT
    account_info.customer_id,
    CUSTOMER_NAME,
    account_no,
    account_type,
    BANK_NAME,
    account_info.ifsc_code,
    initial_deposit,
    CASE
        WHEN account_type = 'SAVINGS'
           THEN ((INTEREST/100)*INITIAL_DEPOSIT)+((INTEREST/100)*INITIAL_DEPOSIT*10/100)
    ELSE
           ((INTEREST/100)*INITIAL_DEPOSIT)
    END  NEW_INTEREST
FROM
    account_info,
    CUSTOMER_PERSONAL_INFO,
    BANK_INFO
WHERE 
    account_info.IFSC_CODE = BANK_INFO.IFSC_CODE AND
    account_info.customer_id = CUSTOMER_PERSONAL_INFO.customer_id AND 
    CUSTOMER_NAME LIKE 'J%';
    
    
25.Write query to display the customer id, customer name, account no, initial deposit, tax percentage as calculated below.
<BR>Hint: <BR>If initial deposit = 0 then tax is '0%'<BR>If initial deposit &lt;= 10000 then tax is '3%' 
<BR>If initial deposit &gt; 10000 and initial deposit &lt; 20000 then tax is '5%' <BR>If initial deposit &gt;= 20000 and
 initial deposit&lt;=30000 then tax is '7%' <BR>If initial deposit &gt; 30000 then tax is '10%' <BR>Use the alias name 'taxPercentage'

SELECT
    account_info.customer_id,
    CUSTOMER_NAME,
    account_no,
    initial_deposit,
    CASE
        WHEN initial_deposit = 0
           THEN '0%'       
        WHEN initial_deposit <= 10000
           THEN '3%'     
        WHEN initial_deposit > 10000 AND initial_deposit<20000
           THEN '3%'     
        WHEN initial_deposit >=20000 AND initial_deposit<=30000
           THEN '7%'     
        WHEN initial_deposit > 30000
           THEN '10%'
    END taxPercentage
FROM
    account_info,
    CUSTOMER_PERSONAL_INFO
WHERE
    account_info.customer_id = CUSTOMER_PERSONAL_INFO.customer_id
