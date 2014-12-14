#!/bin/sh

echo "== FOUNDATION BOOTSTRAP ==";
echo "This bootstrap script will setup the neccesary project files";
echo "for your IDE"
echo "Eclipse or IDEA? (e or i)";
read IDE
case $IDE in
e)
	echo "Setting up project files for Eclipse";
	./gradlew eclipse
	;;
i)
	echo "Setting up project files for IntelliJ IDEA";
	./gradlew idea
esac
