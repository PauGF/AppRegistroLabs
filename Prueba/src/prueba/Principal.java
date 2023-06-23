package prueba;


import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author galifu
 */
public class Principal extends javax.swing.JFrame {
    
    /**
     * Creates new form Principal
     */
    public Principal() {
         
        Dimension screenSize= Toolkit.getDefaultToolkit().getScreenSize();//obtiene el tamaño de la pantalla
        this.setSize(screenSize);//asigna el tamao de la patalla o algo así
        this.setExtendedState(MAXIMIZED_BOTH);//maximiza la pantalla para que no se haga bb
        this.setUndecorated(true);//le quita los cosos de maximizar, minimizar y el tachecito 
        this.setVisible(true);//esto solo es para que se abra xd
        initComponents();//inicia todos los componentes 
        new bloquear( this ).block();//esto llama la clase de bloquear que la manda cada 50 milisegundos y no se pueda cerrar 
    } 
   public int valor(){
       
        int prin = jcprincipal.getSelectedIndex();
        return prin;
   }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jbentradaprin = new javax.swing.JButton();
        jcprincipal = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setAlwaysOnTop(true);
        setFocusableWindowState(false);
        setPreferredSize(Toolkit.getDefaultToolkit().getScreenSize());
        setSize(Toolkit.getDefaultToolkit().getScreenSize());
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setPreferredSize(Toolkit.getDefaultToolkit().getScreenSize());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbentradaprin.setBackground(new java.awt.Color(0, 0, 0));
        jbentradaprin.setFont(new java.awt.Font("Ubuntu Mono", 0, 15)); // NOI18N
        jbentradaprin.setForeground(new java.awt.Color(255, 255, 255));
        jbentradaprin.setText("OK");
        jbentradaprin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbentradaprinActionPerformed(evt);
            }
        });
        jPanel1.add(jbentradaprin, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 580, -1, 20));

        jcprincipal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alumno", "Docente", "Egresado", "PAAE", "UDI" }));
        jcprincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcprincipalActionPerformed(evt);
            }
        });
        jPanel1.add(jcprincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 540, 90, -1));

        jLabel4.setFont(new java.awt.Font("Ubuntu Mono", 0, 24)); // NOI18N
        jLabel4.setText("Seleccione una opción");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 490, -1, 30));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Guia Rápida");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 640, 360, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esime.png"))); // NOI18N
        jLabel2.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jLabel2PropertyChange(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 270, -1, -1));

        jLabel5.setBackground(new java.awt.Color(69, 174, 79,220));
        jLabel5.setOpaque(true);
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 250, 360, 370));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.jpg"))); // NOI18N
        jLabel6.setText("jLabel3");
        jLabel6.setPreferredSize(Toolkit.getDefaultToolkit().getScreenSize());
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1440, 1070));

        getAccessibleContext().setAccessibleName("Jfprin");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbentradaprinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbentradaprinActionPerformed
       
        
        
       // String prin = (String)jcprincipal.getSelectedItem();
       TextPrompt placeholder= null; 
       //extrae la informacion del combobox
      if(valor()==0) {//esto es para que cuando lea alumno haga lo de abajo
         Docente dc =new Docente(valor());
          dc.jlwel.setText("BIENVENIDO ALUMNO");//modifica el label para que diga bienvenido alumno
          placeholder = new TextPrompt("Numero de boleta",dc.jftnumero );
         placeholder.changeAlpha(0.75f);
         dc.jptpass.setVisible(false);
          dc.setVisible(true);
            this.dispose();//cierra la pantalla principal sin terminar el programa
    }
        if( valor()==1){//esto es para que cuando lea docente haga lo de abajo
            Docente dc =new Docente(valor());
          dc.jlwel.setText("BIENVENIDO DOCENTE");//modifica el label para que diga bienvenido docente
           placeholder = new TextPrompt("Numero de empleado",dc.jftnumero );
         placeholder.changeAlpha(0.75f);
         dc.jptpass.setVisible(false);
          dc.setVisible(true);
            this.dispose();//cierra la pantalla principal sin terminar el programa
        }
        if(valor()==3) {//esto es para que cuando lea paae haga lo de abajo
          Docente dc =new Docente(valor());
          dc.jlwel.setText("BIENVENIDO PAAE");//modifica el label para que diga bienvenido paae
          placeholder = new TextPrompt("Numero de empleado",dc.jftnumero );
         placeholder.changeAlpha(0.75f);
         dc.jptpass.setVisible(false);
          dc.setVisible(true);
            this.dispose();//cierra la pantalla principal sin terminar el programa
    }
        if(valor()==2){//esto es para que cuando lea egresado haga lo de abajo
          Docente dc =new Docente(valor());
          dc.jlwel.setText("BIENVENIDO EGRESADO");//modifica el label para que diga bienvenido egresado
          placeholder = new TextPrompt("Numero de boleta",dc.jftnumero );
         placeholder.changeAlpha(0.75f);
         dc.jptpass.setVisible(false);
          dc.setVisible(true);
            this.dispose();//cierra la pantalla principal sin terminar el programa
    }
        if(valor()==4){//esto es para que cuando lea udi haga lo de abajo
          Docente dc =new Docente(valor());
          dc.jlwel.setText("UDI");//modifica el label para que sepamos que estamos en la pantalla de udi
          placeholder = new TextPrompt("Contraseña",dc.jptpass );
         placeholder.changeAlpha(0.75f);
          dc.jbregistro.setVisible(false);//oculta el boton pra que se puedan registrar
          dc.jLabel2.setVisible(false);//oculta el label de la pregunta de registrar
          dc.jftnumero.setVisible(false);
         dc.setVisible(true);
            this.dispose();//cierra la pantalla principal sin terminar el programa
        }
    }//GEN-LAST:event_jbentradaprinActionPerformed
    
    
    private void jcprincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcprincipalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcprincipalActionPerformed

    private void jLabel2PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jLabel2PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2PropertyChange

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFrame jFrame = new JFrame();
        JOptionPane.showMessageDialog(jFrame, new javax.swing.ImageIcon(getClass().getResource("/imagenes/guia.jpeg")));
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    /*public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
               new Principal();
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbentradaprin;
    public javax.swing.JComboBox<String> jcprincipal;
    // End of variables declaration//GEN-END:variables
}
