# RaiffeisenTask
This task for the Software quality engineer opportunity 
# Automation FrameWork

## Introduction
Selenium is a free (open-source) automated testing framework used to validate web applications across different browsers and platforms..


### Tech stach:

- Java
- Maven
- Cucumber
- BDD

### This project uses the following tools:

- Cucumber
- Selenium
- BDD
- IntelliJ as IDE
- Google Chrome as browser

## Structure
The structure of the project follows the rules of BDD and Cucumber, taking into consideration the Page Object Models

- driver

- src

    - main

        - java
             - base
             - pages

    - test
        - java
            - cucumber
               - runner
               - stepDefinitions

        - resources
            - features



**driver**-> Folder to locate browser driver to be tested.

**src\main\java\base\PageBase.java** -> Add your common actions for the locators

**src\main\java\base\TestBase.java** -> Add browser configuration and setup 

**src\main\java\\pages** -> Add all your locators for every webbrowser

**src\test\java\cucumber** -> Cucumber test runners and step definitions

**src\test\resources\features** -> Add all the feature files including scenarios using Gherkin.
