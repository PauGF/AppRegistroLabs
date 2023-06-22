/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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
        File file = new File(filePath);

        if (!file.exists()) {
            try {
                if (file.createNewFile()) {
                    // Archivo creado exitosamente
                    System.out.println("Se ha creado el archivo.");
                    
                    // Escribir el número 0 en el archivo
                    try {
                        FileWriter fileWriter = new FileWriter(file);
                        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                        bufferedWriter.write("000");
                        bufferedWriter.close();
                        System.out.println("Se ha escrito el número 0 en el archivo.");
        } catch (IOException e) {
            e.printStackTrace();
        }
                } else {
                    System.out.println("No se pudo crear el archivo.");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("El archivo ya existe.");
        }  
        Principal prin = new Principal();
          

        
    }
    
}
