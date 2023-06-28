import ctypes
import os

# Ruta completa del archivo que deseas cambiar el propietario
archivo = 'Prueba.jar'

# Nuevo propietario (nombre de usuario)
nuevo_propietario = 'UDI'

# Contraseña del nuevo propietario
contraseña = '1sl@2023'

# Autenticar al nuevo propietario y obtener el identificador de seguridad (SID)
sid = ctypes.pointer(ctypes.c_void_p())

if ctypes.windll.advapi32.LogonUserW(nuevo_propietario, None, contraseña, 2, 0, sid) != 0:
    # Cambiar el propietario del archivo
    if ctypes.windll.advapi32.SetFileSecurityW(archivo, ctypes.OWNER_SECURITY_INFORMATION, sid) != 0:
        print('El propietario del archivo se ha cambiado con éxito.')
    else:
        print('No se pudo cambiar el propietario del archivo.')
else:
    print('La autenticación del nuevo propietario falló.')

# Liberar el identificador de seguridad
ctypes.windll.advapi32.LocalFree(sid)
