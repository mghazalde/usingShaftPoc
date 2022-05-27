# usingShaftPoc
# Prerequisites
- JDK 1.8+
- MAVEN 3.8.4 +
- Chrome/Edge/IE/Firefox/Safari browsers
# How To Use
1. Clone/Download the repository.
2. Go to the cloned project folder location.
3. The test will run on Chrome browser by default. To change browser to FIREFOX, IE, Edge or Safari change the BrowserName in ExecutionPlatform.properties file located in src\main\resources\properties   (targetBrowserName=GoogleChrome, targetBrowserName=MicrosoftEdge, targetBrowserName=MicrosoftInternetExplorer, targetBrowserName=MozillaFirefox, , targetBrowserName=Safari).
4. Open cmd from the cloned project where the pom.xml exists.
5. Run (mvn test -Dtest="com.epay.tests.**") 
6. The tests will run, browser will start and testcases will be excuted
7. Allure report will lunch after execution on the default browser
![image](https://user-images.githubusercontent.com/102529622/170582852-fb54ce44-3b11-4317-80f0-b45729ed7d73.png)



