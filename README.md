# Cucumber K-fast 

selenium-cucumber-kfast : Automation Testing Using Java + Selenium + Cucumber

selenium-cucumber is a behavior driven development (BDD) approach to write automation test script to test Web. It enables you to write and execute automated acceptance/unit tests. Automate your test cases with minimal coding.

- [Installation]
- [Documentation]

# Pre-requisites
- [Java](https://java.com/en/download/manual.jsp)
- [Maven](https://maven.apache.org/download.cgi)
- [Eclipse](https://eclipse.org/downloads)

# Eclipse Plugins
 - [Maven](http://download.eclipse.org/technology/m2e/releases/1.4)
 - [Cucumber](http://cucumber.github.io/cucumber-eclipse/update-site/)

# Setting up selenium-cucumber-java
- Install Java and set path.
- Install Maven and set path.
- Clone respective repository or download zip.
 - Maven Repo : https://github.com/patilnileshkiwiqa/kfast-cucumber.git


------------


# Running features

#### Method 1: Using Command Prompt

- Goto project directory.
- Use **`mvn verify`** command to run features.
- Use **`mvn verify -Dbrowser=browser_name`**  to run features on specific browser.
- Use **`mvn verify -DthreadCount=2`**  to run parallel features on specific browser.
- **browser_name** can be one of following but make sure that browsers driver file are present and specified in system variable.

First time run use `mvn verify -Dbrowser=chrome -DthreadCount=2`

> - Chrome
> - Edge
> - Firefox


------------




#### Method 2: Using Eclipse IDE
- Goto project directory.
- Set parameters in config.properties ( Location: \src\test\resources\config )
> executionFrom=Local
> browser=chrome
> url=https://www.saucedemo.com/

- Select any feature file and right click and run it from there.


------------




   [Installation]: <https://cucumber.io/docs/installation/java/>
   [Documentation]: <https://cucumber.io/docs/cucumber/>