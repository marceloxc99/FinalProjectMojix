echo "Running Container: Automation"
gradle -version
java -version
echo "Executing Automation Test"
cd /tmp/selenium
echo "gradle clean test --tests CRUDListTest"
gradle clean test --tests CRUDListTest
echo "test completed"