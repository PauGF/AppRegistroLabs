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
        int[] array={0,0,0};
        
        File file = new File(filePath);

        if (!file.exists()) {
            try {
                if (file.createNewFile()) {
                    // Archivo creado exitosamente
                    System.out.println("Se ha creado el archivo.");
                    
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
