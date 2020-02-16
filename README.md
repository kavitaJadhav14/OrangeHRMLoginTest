# OrangeHRMLoginTest
   My project  going to check login test for this website-  https://s2.demo.opensourcecms.com/orangehrm/symfony/web/index.php/auth/login 

I have created Cucumber BDD Framework from scratch.

Step 1:  
   Start Intellji integrated development environment

   Create Cucumber application.
Step 2:
    I have create Maven project and required dependencies.
 This is a Webdriver project which is interacting with selenium webdriver. So, I have added following Cucumber as well as Selenium Webdriver Dependencies in Pom.xml file....
 
junit junit 4.11 test org.seleniumhq.selenium selenium-java 3.141.59

<!-- To support browser binary files-->
<dependency>
  <groupId>io.github.bonigarcia</groupId>
  <artifactId>webdrivermanager</artifactId>
  <version>3.7.1</version>
</dependency>

<!-- Asserts -->
<dependency>
  <groupId>org.hamcrest</groupId>
  <artifactId>hamcrest-all</artifactId>
  <version>1.3</version>
  <scope>test</scope>
</dependency>
<!-- Cucumber -->
<dependency>
  <groupId>info.cukes</groupId>
  <artifactId>cucumber-junit</artifactId>
  <version>1.2.5</version>
  <scope>test</scope>
</dependency>
<dependency>
  <groupId>info.cukes</groupId>
  <artifactId>cucumber-java</artifactId>
  <version>1.2.5</version>
  <scope>test</scope>
</dependency>

Step 3:

  Once I configure Cucumber,the next step is to create feature file.
Create new directory by clicking on test folder, in that directory Created new file specify the name loginTest.feature 

Once  I create the feature file, I have writen the scenarios for this feature file .

Step 4:
 After that , I have implement the scenarios with the help of step definitions. Right click on feature file and generate the code for step defination.

Step 5:
   I have Create step definition file − Right click on java folder- create new package named stepDefination. 
In stepDefination i have created java class specify the name asLoginValidTest and LoginInvalidTest. 
Then  I have implemented the methods by copying the generated code from featuse file concole window and pasted accordingly.

I have created one packge called driver, In driver package crated java class named Baseclass, using this I can call the driver.
Define a base  class to define our test case scenario.

    
  Step 6:   I have created page object package to increase readability  and  reuse the code. In page object create HomePage and ResultPage to mantain the code.


I have also created Hooks class to  call Base class where i instantiate the driver. and In that @Before cucumber annotation method.

Step 7:
      Next to create RunTest class in stepdifination package. Here we run  the test and also to generate the output using annotations.

Step 8:
       As expexted I observe the following things upon execution −

    An instance of in Chrome web browser OrangeHRMlogin webpage will open.

    It will open the OrangeHRM login page on the browser.

    It will enter the login details both Valid and invalid credentials.
    
    It will open nextpage with valid username and password.
     
    It will show error message  with invalid username and password.

    The browser will close.

    In the JUnit window, you will see a scenario with green tick mark, which indicates success of the test execution.
  

