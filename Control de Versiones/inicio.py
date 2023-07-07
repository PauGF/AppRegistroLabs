
import subprocess

# Ejecutar el primer script
resultado =subprocess.run(['python', 'script.py'], capture_output=True, text=True)

# Obtener la salida del proceso
salida = resultado.stdout

# Verificar la salida del primer script
if 'Descarga completada.' in salida:
	# Ejecutar el segundo script
	subprocess.run(['permisos.bat'])
	# Ejecutar el archivo JAR
	subprocess.run(['java', '-jar', 'Prueba.jar'])

else:
	#print("No se descargó nada")
	subprocess.run(['java', '-jar', 'Prueba.jar'])



