echo "Running Container: Automation"
gradle -version
java -version
echo "Executing Automation Test"
cd /tmp/selenium
echo "./gradle cucumber"
./gradlew cucumber
echo "test completed"