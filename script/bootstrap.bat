echo "== FOUNDATION BOOTSTRAP ==";
echo "This bootstrap script will setup the neccesary project files";
echo "for your IDE";
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
