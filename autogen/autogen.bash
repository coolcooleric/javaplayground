#!/bin/bash

# $1 - the location of the xml
# $2 - the location of the xsl files
# $3 - the location of the saxon jar file
# $4 - the location where the output is written
# $5 - the package for the beans

#echo "xml files in $1"
#echo "xsl files in $2"
#echo "jar file in $3"
#echo "output to $4"
#echo "package is $5"

# Create the network beans.
java -jar saxon7.jar dal.xml step1.xsl>output.xml
java -jar saxon7.jar output.xml step2.xsl>output.java
#sudo rm -f output.xml
