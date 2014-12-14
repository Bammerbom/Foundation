#!/bin/sh

echo 'BOOTSTRAPPING';
echo "Foundation by FoundationDriven";
echo 'Eclipse or IDEA? (e or i)';
read IDE
case $IDE in
e)
	echo "Setting up Eclipse";
	./gradlew eclipse
	;;
i)
	echo "Setting up IDEA";
	./gradlew idea
esac
