
import ftplib

# Detalles de la conexión FTP
servidor_ftp = '148.204.37.66'
puerto_ftp = 21
usuario = 'pclab'
contraseña = 'pc1sl@2023'

# Detalles de los archivos a descargar
archivo_local_1 = 'Prueba.jar'
archivo_local_2 = 'Version.txt'
archivo_remoto_1 = 'Prueba.jar'
archivo_remoto_2 = 'Version.txt'

# Crear una instancia de la clase FTP
ftp = ftplib.FTP(servidor_ftp)

# Conectar al servidor FTP en el puerto
ftp.connect(servidor_ftp, puerto_ftp)

# Iniciar sesión en el servidor FTP
ftp.login(usuario, contraseña)

# Comparar los archivos locales con los archivos remotos
with open(archivo_local_2, 'r') as local_file:
    contenido_local_2 = local_file.read().strip()

contenido_remoto_2 = []

ftp.retrlines(f'RETR {archivo_remoto_2}', lambda line: contenido_remoto_2.append(line))

contenido_remoto_2 = '\n'.join(contenido_remoto_2).strip()

if contenido_local_2 == contenido_remoto_2:
    print("Los archivos locales y remotos son idénticos. No se realizará ninguna descarga.")
else:
    # Descargar los archivos remotos a la carpeta local
    with open(archivo_local_1, 'wb') as local_file:
        ftp.retrbinary('RETR ' + archivo_remoto_1, local_file.write)
    with open(archivo_local_2, 'wb') as local_file:
        ftp.retrbinary('RETR ' + archivo_remoto_2, local_file.write)
    print("Descarga completada.")

# Cerrar la conexión FTP
ftp.quit()
