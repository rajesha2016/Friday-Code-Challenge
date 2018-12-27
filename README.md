# Friday-Code-Challenge

Tools Used: Eclipse Oxygen IDE, Maven

Programming Language: JAVA

BDD framework: Cucumber

Reporting: Cucumber-Extent report


### Project Understanding

#### Input to Project
I have used Cucumber feature file to take input for the given task. These inputs passed to logic class to perform operation. The feature file will look like this.

![image](https://user-images.githubusercontent.com/23300234/50469683-85db4500-09d3-11e9-9845-1e4ef62e386f.png)

Please ignore the warning on feature file as Cucumber with JAVA 8 still evolving.This warning will not there if we use lower version of JAVA(accordingly the gluecode will change).

#### Output of the Program
I have used Cucumber-Extent report library to display the output. This is a HTML file. You can find this HTML report file inside com.friday.address.test>target>cucumber-reports>report.html 

![image](https://user-images.githubusercontent.com/23300234/50470596-241cda00-09d7-11e9-9cdb-56fe380a180f.png)

If user pass only House Number then the script will throw assertion validation and the report generated with Failed steps. E.g: I have pass the last input in Feature file only "123B" since we do not have Street name so it will throw assertion error like below:

![image](https://user-images.githubusercontent.com/23300234/50470804-19af1000-09d8-11e9-93b7-2469d43f203a.png)

#### How to Execute
##### Option:1
Steps:

1> Clone the repository https://github.com/rajesha2016/Friday-Code-Challenge.git from GitHub to IDE or download to system and import to IDE

2> Right click on the project and do maven update

3> If you want give inputs according to you, please go to the \com.friday.address.test\CucumberFeatureFile\FridayAddressTask.feature and edit the inputs under Examples, Save it.

3> Right click on the \src\test\java\Runner\TestRunner.java and run as Junit

4> After execution finish, report generated inside com.friday.address.test>target>cucumber-reports folder

##### Option:2
Steps:

1> Download the project from GitHub https://github.com/rajesha2016/Friday-Code-Challenge.git to system

2> Go to "com.friday.address.test" project folder in command prompt or terminal

3> Type command "mvn install"

4> Then type "mvn clean test"

5> After execution finish, report generated inside com.friday.address.test>target>cucumber-reports folder
