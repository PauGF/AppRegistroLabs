/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package prueba;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author galif
 */
public class Encuestaok_1 extends javax.swing.JFrame {
private String numeroLab, idAcceso, usu;
private int valor;
    /**
     * Creates new form Encuestaok
     */
    public Encuestaok_1(int valor) {
        Dimension screenSize= Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(screenSize);
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setUndecorated(true);
        this.setVisible(true);
        this.valor=valor;
        initComponents();
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
             numeroLab=valores[2];
         try{
              // Leer el contenido del archivo "idAcceso.txt"
             fileReader = new FileReader("idAcceso.txt");
             bufferedReader = new BufferedReader(fileReader);
             idAcceso = bufferedReader.readLine();
            bufferedReader.close();
         } catch(Exception e)
         {
              e.printStackTrace();
         }
        new bloquear( this ).block();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jc4 = new javax.swing.JComboBox<>();
        jc5 = new javax.swing.JComboBox<>();
        jc1 = new javax.swing.JComboBox<>();
        jc2 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLerror = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTsuggestions = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTprogramms = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jc6 = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 255, 255));
        setSize(Toolkit.getDefaultToolkit().getScreenSize());

        jPanel1.setAutoscrolls(true);
        jPanel1.setPreferredSize(Toolkit.getDefaultToolkit().getScreenSize());

        jLabel9.setBackground(new java.awt.Color(255, 255, 255,2));
        jLabel9.setFont(new java.awt.Font("Rockwell", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1.png"))); // NOI18N
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel9.setOpaque(true);

        jc4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "1", "2", "3", "4", "5" }));

        jc5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "1", "2", "3", "4", "5" }));

        jc1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "1", "2", "3", "4", "5" }));

        jc2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "1", "2", "3", "4", "5" }));

        jLabel1.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel1.setText("1. ¿Cómo consideras el control de acceso a la sala de cómputo?");

        jLabel2.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel2.setText("2. ¿El encargado del aula de cómputo brinda atención cuando la requieres?");

        jLabel3.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel3.setText("3. ¿Cómo es la efectividad de los técnicos para resolver los problemas de soporte técnico?");

        jLabel4.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel4.setText("4. ¿Cómo calificas el servicio a Internet en los equipos de las aulas de cómputo?");

        jLabel5.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel5.setText("5. ¿Los equipos tienen los programas necesarios para llevar a cabo tus actividades acedémicas y escolares?");

        jLabel6.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel6.setText("6. ¿Consideras que el equipo de computo es adecuado para el uso de la comunidad?");

        jLabel7.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel7.setText("De la pregunta 5. ¿Consideras algún programa en específico para realizar tus actividades acedémicas y escolares?");

        jLabel8.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel8.setText("Comentarios: felicitaciones, sugerencias, opiniones y/o quejas:");

        jLerror.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jLerror.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jTsuggestions.setColumns(20);
        jTsuggestions.setRows(5);
        jScrollPane1.setViewportView(jTsuggestions);

        jTprogramms.setColumns(20);
        jTprogramms.setRows(5);
        jScrollPane2.setViewportView(jTprogramms);

        jButton1.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jButton1.setText("Enviar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable3.setAutoCreateRowSorter(true);
        jTable3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTable3.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "2", "3", "4", "5"}
            },
            new String [] {
                "Insatisfactorio", "Malo", "Regular", "Bueno", "Satisfactorio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(jTable3);

        jLabel11.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("ENCUESTA DE SATISFACCIÓN DEL CLIENTE DE SERVICIOS DE APOYO EDUCATIVO");

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/2.png"))); // NOI18N

        jc6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "1", "2", "3", "4", "5" }));

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("No Aplica");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jLabel11))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1271, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel1)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(218, 218, 218)
                                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel3))
                                    .addGap(266, 266, 266)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jc2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jc1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jc5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jc4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jc6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(111, 111, 111)))
                            .addComponent(jLabel7)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1059, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1059, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLerror, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jc2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jc4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jc5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jc6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLerror, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(189, Short.MAX_VALUE))
        );

        jScrollPane3.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1272, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 938, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // boton enviar 
        //tiene que agradecer por contestr y luego tiene que mandr al inicio de sesión
        String url = "http://148.204.37.66/serverRegistroLabs/survey.php";
        String charset = "UTF-8";
        // Datos a enviar en la solicitud POST
        String programms=jTprogramms.getText();
        String suggestions=jTsuggestions.getText();
        String p1=  jc1.getSelectedIndex()-1+"";//
        String p2=  jc2.getSelectedIndex()-1+"";//
        String p3=  5+"";//
        String p4=  jc4.getSelectedIndex()-1+"";//
        String p5=  jc5.getSelectedIndex()-1+"";//
        String p6=  jc6.getSelectedIndex()-1+"";//
        
        String answers=p1+p2+p3+p4+p5+p6;
        if(jc1.getSelectedItem().equals("-")||jc2.getSelectedItem().equals("-")||jc4.getSelectedItem().equals("-")||jc5.getSelectedItem().equals("-")||jc6.getSelectedItem().equals("-")){
            jLerror.setBackground(Color.red);
            jLerror.setText("Selecciona una opción valida");
        }else{
        
       // System.out.println(answers);
        try {
            // Codificar los parámetros
           String parametros = "numLab=" + URLEncoder.encode(numeroLab, charset)
                    + "&answers=" + URLEncoder.encode(answers, charset)
                    + "&programms=" + URLEncoder.encode(programms, charset)
                    + "&suggestions=" + URLEncoder.encode( suggestions, charset)
                    + "&idTipo=" + URLEncoder.encode( (valor+1)+ "", charset)
                    + "&idAcceso=" + URLEncoder.encode(idAcceso, charset);
           
            
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
            conn.disconnect();
            
            // Procesar la respuesta
            String jsonRespuesta = respuesta.toString();
            if (jsonRespuesta.contains("\"res\":true")) {
                 new Sesionok(usu).setVisible(true);
                 this.dispose();
            }else{
                //Borra el archivo idAcceso
                // Crear un objeto File con la ruta del archivo
                File file = new File("idAcceso.txt");
                // Verificar si el archivo existe antes de borrarlo
                if (file.exists()) {
                    // Intentar borrar el archivo
                    boolean deleted = file.delete();
                    if (deleted) {;
                       // System.out.println("El archivo ha sido borrado exitosamente.");
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
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLerror;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextArea jTprogramms;
    private javax.swing.JTextArea jTsuggestions;
    private javax.swing.JComboBox<String> jc1;
    private javax.swing.JComboBox<String> jc2;
    private javax.swing.JComboBox<String> jc4;
    private javax.swing.JComboBox<String> jc5;
    private javax.swing.JComboBox<String> jc6;
    // End of variables declaration//GEN-END:variables
}
