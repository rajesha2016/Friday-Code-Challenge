# Friday-Code-Challenge

Tools Used: Eclipse Oxygen IDE, Maven

Programming Language: JAVA(Junit framework)

BDD framework: Cucumber

Reporting: Cucumber-Extent report


### Project Understanding

#### Input to Project
I have used Cucumber feature file to take input for the given task. You can find this feature file "\com.friday.address.test\CucumberFeatureFile\FridayAddressTask.feature" here.These inputs passed to logic class "AddressLogic.java" to perform operation. The feature file will look like this.

Feature file is used in BDD for scenarios writing in Gherkin format which is generate gluecode in stepdifinition file, in this project it is "\com.friday.address.test\src\test\java\StepDefinitions\FridayAddressTaskSteps.java"

![image](https://user-images.githubusercontent.com/23300234/50474590-8aa9f400-09e7-11e9-9c36-78d973f0115c.png)

Please ignore the warning on feature file as Cucumber with JAVA 8 still evolving.This warning will not there if we use lower version of JAVA(accordingly the gluecode will change).

Project Structure looks like below:

![image](https://user-images.githubusercontent.com/23300234/50472218-e7a0ac80-09dd-11e9-90b8-a704e6b242ed.png)

#### Output of the Program
I have used Cucumber-Extent report library to display the output. This is a HTML file. You can find this HTML report file inside "com.friday.address.test>target>cucumber-reports>report.html" 

![image](https://user-images.githubusercontent.com/23300234/50470596-241cda00-09d7-11e9-9cdb-56fe380a180f.png)

If user pass only House Number then the script will throw assertion validation and the report generated with Failed steps. E.g: I have pass the last input in Feature file only "123B" since we do not have Street name so it will throw assertion error like below:

![image](https://user-images.githubusercontent.com/23300234/50470804-19af1000-09d8-11e9-93b7-2469d43f203a.png)

#### How to Execute
##### Option:1 From IDE
Steps:

1> Clone the repository from GitHub https://github.com/rajesha2016/Friday-Code-Challenge.git to IDE or download to system and import to IDE

2> Right click on the project and do maven update

3> If you want give inputs according to you, please go to the "\com.friday.address.test\CucumberFeatureFile\FridayAddressTask.feature" and edit the inputs under Examples, Save it.

3> Right click on the "\src\test\java\Runner\TestRunner.java" file and run as Junit

4> After execution finish, report generated inside com.friday.address.test>target>cucumber-reports folder

##### Option:2 From Command Line or Terminal
Steps:

1> Download the project from GitHub https://github.com/rajesha2016/Friday-Code-Challenge.git to system

2> Go to "com.friday.address.test" project folder in command prompt or terminal

3> Type command "mvn install"

4> Then type "mvn clean test"

5> After execution finish, report generated inside "com.friday.address.test>target>cucumber-reports" folder

P.S: I have desgined the regular expression based on the pattern and it will work for simillar inputs. I have tried to cover all possible scenarios within my program.
