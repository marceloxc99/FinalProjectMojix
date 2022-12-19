echo "Running Container: Automation"
gradle -version
java -version
echo "Executing Automation Test"
cd /tmp/selenium
ls
echo "gradle cucumber"
chmod 777 gradlew
gradle cucumber
echo "test completed"