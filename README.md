# Venngage QA Technical Challenge

Implementation:
Framework : TestNG along with Page Object Model

TemplatesPage.java
  1) Using POM Page Factory design pattern, element are initiated
  2) JavaScriptExecutor is used to access the SignUp button
  3) Returns the SignUpPage

SignUpPage.java
  1) Using POM Page Factory design pattern, element are initiated
  2) Account object is sent as a parameter to newSignUp method
  
 Account.java
    1) Properties are created along with Constructor and getters
    
 TestSignUp.java
  1) DataProvider logic is used to pass the parameter to the test
  
Other Questions Answers:

5) If you were asked to implement all the tests of sign up page, list out the tests:
 
 Answer: 
 
  InScope :
  
     > Input Field validations for FirstName, LastName, Email & Password
     
      eg. invalid email or password, scenario matrix validation by leaving each field empty, etc.
      
    > SignUp with Google & SignUp with Facebook options. Though this is a third party authentication service, we should validate as a part of the Sign Up Page and check whether       the user is able to sign up without any error
    
    > Sign up using already registered user details
 
  Out Of Scope:
  
     >  Validating the other tabs like Home, Feature, etc in the Sign Up page.
  
6) If the Google Recaptcha exists, what will you do to unblock the sign up automation tests and further tests after successful registration
 
    Answer : CAPTCHA cannot be automated using Selenium. The best way to approach the scenario is to disable the Captcha in the test environment and validate. If the CAPTCHA is      text based we can try to decode it using OCR api's.
 
7) If you had to run the Sign Up test flow 100 times, each using a different email, what would you do to run the test efficiently?

    Answer : @DataProvider annotation is used for data driven testing. By passing this method in the @Test, we would be able to achieve this flow efficiently. We can have the        different data in the properties file or excel. Dataprovider can be used to create objects for each testdata and pass it to the Test.
 
8) What else would you verify to make sure that the account has signed up successfully?
  
    Answer : 
       1) If our application is storing the account details in the Database, we need to validate whether the table is inserted with the new user details
       2) We can also validate by signing into the account 
 
 
