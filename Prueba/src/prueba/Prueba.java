/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
/**
 *
 * @author galif
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String filePath = "Computadora.txt";
        String fileac="IdAcceso.txt";
        int[] array={0,0,0};
        
        File file = new File(filePath);
        File facc=new File(fileac);
        if(facc.exists()){
             String url = "http://148.204.37.66/serverRegistroLabs/logout.php";
        String charset = "UTF-8";

        try {
            // Leer el contenido del archivo "idAcceso.txt"
            FileReader fileReader = new FileReader("idAcceso.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String idAcceso = bufferedReader.readLine();
            bufferedReader.close();

            // Construir los parámetros de la solicitud POST
            String parametros = "idAcceso=" + idAcceso;

            // Crear la conexión HTTP POST
            URL urlObj = new URL(url);
            HttpURLConnection conn = (HttpURLConnection) urlObj.openConnection();
            conn.setRequestMethod("POST");
            conn.setDoOutput(true);

            // Enviar los parámetros en el cuerpo de la solicitud
            try (DataOutputStream wr = new DataOutputStream(conn.getOutputStream())) {
                wr.writeBytes(parametros);
                wr.flush();
            }

            // Obtener la respuesta del servidor
            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String linea;
            StringBuilder respuesta = new StringBuilder();
            while ((linea = in.readLine()) != null) {
                respuesta.append(linea);
            }
            in.close();

            // Procesar la respuesta
            String jsonRespuesta = respuesta.toString();
            //System.out.println(jsonRespuesta);
           
            if(jsonRespuesta.contains("[{\"res\":-1}]")){
                 System.out.println(jsonRespuesta);
            }else{
                //Borra el archivo idAcceso
                // Crear un objeto File con la ruta del archivo
                File filea = new File("idAcceso.txt");
                // Verificar si el archivo existe antes de borrarlo
                    // Intentar borrar el archivo
                    boolean deleted = filea.delete();
                    if (deleted) {;
                      //  System.out.println("El archivo ha sido borrado exitosamente.");
                    } else {;
                       // System.out.println("No se pudo borrar el archivo.");
                    }
                
                    }


                } catch (Exception e) {
            e.printStackTrace();
                }
            
            
            
            
        }
        else{
            //System.out.println("El archivo no existe");
        }
        
        
        if (!file.exists()) {
            try {
                if (file.createNewFile()) {
                    // Archivo creado exitosamente
                    //System.out.println("Se ha creado el archivo.");
                    
                    // Escribir el número 0 en el archivo
                    try {
                        FileWriter fileWriter = new FileWriter(file);
                        StringBuilder sb=new StringBuilder();
                        for(int i=0; i<array.length; i++){
                            sb.append(array[i]);
                            if (i < array.length - 1) {
                                sb.append(",");
                }
                        }
                        String aa=sb.toString();
                        
                        try (BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
                            bufferedWriter.write(aa);
                            //   System.out.println("Se ha escrito el número 0 en el archivo.");
                        }
        } catch (IOException e) {
            e.printStackTrace();
        }
                } else {
                    //System.out.println("No se pudo crear el archivo.");
                    ;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            //System.out.println("El archivo ya existe.");
            ;
        }  
        
        
        
        
        Principal prin = new Principal();
          

        
    }
    
}
