#!/bin/sh

# This compiles and then runs the java package. Super basic but I got tired of doing it soooo
# Only runs on compilation success 

cd ..

javac getopt_java/*.java

if [ $? -eq 0 ]
then 
	java getopt_java/ExampleClass.java
fi

cd getopt_java
