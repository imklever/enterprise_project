@echo off
rem /**
rem  *
rem  * Author: jindong.lin@baozun.com
rem  */
echo.
echo [信息] 清理生成路径。
echo.
pause
echo.

cd %~dp0
cd..

call mvn clean

cd bin
pause