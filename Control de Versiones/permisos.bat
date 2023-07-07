@echo off

ICACLS Prueba.jar /grant %COMPUTERNAME%:F /q > nul 2>&1
exit