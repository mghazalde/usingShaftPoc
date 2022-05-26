@echo off
set path=C:\Users\m.ghazal\.m2\repository\allure\allure-2.18.0\bin;C:\Program Files\Java\jdk-17.0.2\bin;%path%
allure serve allure-results
pause
exit