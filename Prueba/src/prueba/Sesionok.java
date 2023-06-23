package prueba;


import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.io.File;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author galif
 */
public class Sesionok extends javax.swing.JFrame {
private String usu;
    /**
     * Creates new form NewJFrame
     */
    public Sesionok(String usu) {
       Dimension screenSize= Toolkit.getDefaultToolkit().getScreenSize();
        this.setUndecorated(true);
        this.setLocation(0, screenSize.height/3);
        this.usu=usu;
        initComponents();
        jLabel1.setText(usu);
        new bloquearsesion( this ).block();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setAlwaysOnTop(true);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 255, 255,200));
        setFocusableWindowState(false);
        setMinimumSize(new java.awt.Dimension(50, 240));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setText("<html>\n<center>\nC<br>\ne<br>\nr<br>\nr<br>\na<br>\nr <br>\n<br>\nS<br>\ne<br>\ns<br>\ni<br>\nó<br>\nn<br>\n</center>\n</html>");
        jButton1.setToolTipText("");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton1.setPreferredSize(new java.awt.Dimension(14, 212));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel1.setText("<html>\n<center>\nU<br>\nD<br>\nI<br>\n<br>\nE<br>\nS<br>\nI<br>\nM<br>\nE<br>\n</center>\n<html>\n");
        jLabel1.setPreferredSize(new java.awt.Dimension(16, 88));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //esto tiene que cerrar sesion, mandar a la pantalla de inicio y borrar las 
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
                File file = new File("idAcceso.txt");
                // Verificar si el archivo existe antes de borrarlo
                if (file.exists()) {
                    // Intentar borrar el archivo
                    boolean deleted = file.delete();
                    if (deleted) {;
                      //  System.out.println("El archivo ha sido borrado exitosamente.");
                    } else {;
                       // System.out.println("No se pudo borrar el archivo.");
                    }
                } else {;
                   // System.out.println("El archivo no existe en la ruta especificada.");
                }
                new Principal().setVisible(true);
                this.dispose();
                    }


                } catch (Exception e) {
            e.printStackTrace();
                }
       
        
       
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    /*public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sesionok().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
