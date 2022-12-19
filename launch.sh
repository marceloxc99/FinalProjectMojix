echo "Running Container: Automation"
gradle -version
java -version
echo "Executing Automation Test"
cd /tmp/selenium
echo "gradle cucumber"
chmod 777 gradlew
./gradle cucumber
echo "test completed"