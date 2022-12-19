echo "Running Container: Automation"
gradle -version
java -version
echo "Executing Automation Test"
cd /tmp/selenium
ls
echo "./gradlew cucumber"
./gradlew cucumber
echo "Test Completed"