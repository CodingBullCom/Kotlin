#!/bin/sh
#Author: Pawan
#Organization: http://www.codingbull.com
#Purpose: To automate the process of compilation and execution of sample kotlin source code on shell.
#Date: 23/08/2017

# 1. Compile the kotlin source code using command 'kotlinc'. The output would be a jar
# file named main.jar, if this command is executed successfully.
kotlinc main.kt math.kt -include-runtime -d main.jar

# 2. Execute the jar file created in last step.
java -jar main.jar 10 50
