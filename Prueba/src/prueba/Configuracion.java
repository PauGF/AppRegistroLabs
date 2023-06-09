/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package prueba;

import java.awt.event.WindowListener;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.json.JSONArray;
import org.json.JSONObject;
/**
 *
 * @author galif
 */
public class Configuracion extends javax.swing.JFrame {
private String idComputadora, numero, numeroLab;
    /**
     * Creates new form Configuracion
     */

    public Configuracion() {
        initComponents();
        this.addWindowListener(new java.awt.event.WindowAdapter(){
            @Override
    public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                new Principal().setVisible(true);
        }});
        FileReader fileReader=null;
        try {
            fileReader = new FileReader("Computadora.txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Configuracion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String archivo="";
        try {
            archivo = bufferedReader.readLine();
        } catch (IOException ex) {
            Logger.getLogger(Configuracion.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            bufferedReader.close();
        } catch (IOException ex) {
            Logger.getLogger(Configuracion.class.getName()).log(Level.SEVERE, null, ex);
        }
        String[] valores =archivo.split(",");
        idComputadora =valores[0];
        numero = valores[1];
        numeroLab=valores[2];
        jLidcompu.setText(idComputadora);
        jtnumpc.setText(numero);
        jclab.setSelectedIndex(Integer.valueOf(numeroLab) == 0 ? 0 : Integer.valueOf(numeroLab)-1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
  //  @SuppressWarnings("unchecked");
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtnumpc = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jclab = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLidcompu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("ID PC");

        jLabel2.setText("Número PC");

        jLabel3.setText("Laboratorio");

        jclab.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laboratorio de diseño", "Laboratorio Pabellón" }));

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtnumpc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jclab, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(126, 126, 126))
                    .addComponent(jLidcompu, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(120, 120, 120))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLidcompu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtnumpc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jclab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(jButton1)
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Este es el boton guardar
    
   /*
        new Principal().setVisible(true);
        this.dispose();*/
       String url = "http://148.204.37.66/serverRegistroLabs/signinPC.php";
        String charset = "UTF-8";
        String parametros;
        // Datos a enviar en la solicitud POST
        int num=jclab.getSelectedIndex()+1;
        
        try {
            String filePath = "Computadora.txt";
        StringBuilder contenidoArchivo = new StringBuilder();
        try {
           
        if(idComputadora.equals("0")){
        
            // Construir los parámetros POST
             parametros = "num=" + URLEncoder.encode(jtnumpc.getText(), charset)
                    + "&numLab=" + URLEncoder.encode(num+"", charset);
             
            //mostrar msg 
            
        }else{
             parametros = "num=" + URLEncoder.encode(jtnumpc.getText(), charset)
                    + "&numLab=" + URLEncoder.encode(num+"", charset)
                    + "&idComputadora=" + URLEncoder.encode(idComputadora, charset);
            
        }
        
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
            String linea="";
            StringBuilder respuesta = new StringBuilder();
            while ((linea = in.readLine()) != null) {
                respuesta.append(linea);
            }
            in.close();
            // Procesar la respuesta
            String jsonRespuesta = respuesta.toString();
            //System.out.println(jsonRespuesta);
            //aquí tengo que cambiar el 0 del documento por lo que me manda el servidor
            // Leer el contenido de la respuesta
            JSONArray jsonArray = new JSONArray(jsonRespuesta);
            JSONObject jsonObject = jsonArray.getJSONObject(0);
            // Obtener el valor de "res"
            int resValue = jsonObject.getInt("res");
            //System.out.println("Computadora es: " + resValue);
            // Crear el archivo "Computadora" y escribir la respuesta
            FileWriter fileWriter = new FileWriter("Computadora.txt");
            fileWriter.write((String.valueOf(resValue).equals("0")? idComputadora : String.valueOf(resValue) ) +","+ jtnumpc.getText()+"," + num);
            fileWriter.close();
            JFrame jFrame = new JFrame();
            JOptionPane.showMessageDialog(jFrame, "Registro Exitoso, cierra la ventana para continuar");
        
        } catch (IOException e) {
            e.printStackTrace();
        }
        
          

        } catch (Exception e) {
            e.printStackTrace();
        }
       
       
    }//GEN-LAST:event_jButton1ActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLidcompu;
    private javax.swing.JComboBox<String> jclab;
    private javax.swing.JTextField jtnumpc;
    // End of variables declaration//GEN-END:variables
}
