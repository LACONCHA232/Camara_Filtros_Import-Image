/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Camara;

import Menu.Visual;
import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;
import com.github.sarxos.webcam.WebcamResolution;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author diego
 */
public final class CamaraFrm extends javax.swing.JFrame {

    int largoCamara = 460;
    int anchoCamara = 400;
    BufferedImage ruta;
    int contador = 0;
    
    Dimension dimension = new Dimension(largoCamara, anchoCamara);
    Dimension dimension1 = WebcamResolution.VGA.getSize();
    Webcam webcam = Webcam.getDefault();
    WebcamPanel webcamPanel = new WebcamPanel(webcam, dimension, false);
    
    
    public CamaraFrm() {
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        setLocationRelativeTo(null);
        
        webcam.setViewSize(dimension1);
        webcamPanel.setFillArea(true);
        pnlCamara.setLayout(new FlowLayout());
        pnlCamara.add(webcamPanel);
        lblNombreCamara.setText(webcam.toString());
        
        apagarBotones();
    }

    public void apagarBotones(){
    
        btnApagar.setEnabled(false);
        btnCapturar.setEnabled(false);
        btnGuardar.setEnabled(false);
    }
    
    public void prenderBotones(){
        btnApagar.setEnabled(true);
        btnCapturar.setEnabled(true);
    }
  
    public void textoBotonesCuandoCargaCamara(){
    
        btnApagar.setText("Inciiando Camara...");
        btnCapturar.setText("Inciiando Camara...");
        btnGuardar.setText("Inciiando Camara...");
        btnIniciar.setText("Inciiando Camara...");

    }
    
    public void textoBotonesCuandoCargoCamara(){
    
        btnApagar.setText("APAGAR");
        btnCapturar.setText("CAPTURAR FOTO");
        btnGuardar.setText("GUARDAR FOTO");
        btnIniciar.setText("INICIAR");
    
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        jPanel1 = new javax.swing.JPanel();
        pnlCamara = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblNombreCamara = new javax.swing.JLabel();
        btnApagar = new javax.swing.JButton();
        btnIniciar = new javax.swing.JButton();
        lblFotoTomada = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnCapturar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Camara");
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlCamara.setBackground(new java.awt.Color(0, 0, 0));
        pnlCamara.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlCamara.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout pnlCamaraLayout = new javax.swing.GroupLayout(pnlCamara);
        pnlCamara.setLayout(pnlCamaraLayout);
        pnlCamaraLayout.setHorizontalGroup(
            pnlCamaraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 458, Short.MAX_VALUE)
        );
        pnlCamaraLayout.setVerticalGroup(
            pnlCamaraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 398, Short.MAX_VALUE)
        );

        jPanel1.add(pnlCamara, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 460, 400));

        jLabel6.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("CAPTURAR");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 620, 120, 40));

        jLabel5.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("GUARDAR");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 620, 90, 30));

        jLabel4.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("APAGAR");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 130, 80, 30));

        jLabel3.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("INICIAR");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 40, 90, 30));

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Camara en uso:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 190, 40));

        lblNombreCamara.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        lblNombreCamara.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreCamara.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblNombreCamara.setText("-");
        jPanel1.add(lblNombreCamara, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 440, -1));

        btnApagar.setBackground(new java.awt.Color(0, 0, 0));
        btnApagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Menu/Imagenes/apagar.png"))); // NOI18N
        btnApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApagarActionPerformed(evt);
            }
        });
        jPanel1.add(btnApagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 110, 70, 70));

        btnIniciar.setBackground(new java.awt.Color(0, 0, 0));
        btnIniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Menu/Imagenes/prender.png"))); // NOI18N
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });
        jPanel1.add(btnIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 20, 70, 70));

        lblFotoTomada.setForeground(new java.awt.Color(0, 0, 0));
        lblFotoTomada.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(lblFotoTomada, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 260, 310, 310));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 310, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 310, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 260, 310, 310));

        btnGuardar.setBackground(new java.awt.Color(0, 0, 0));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Menu/Imagenes/guardar.png"))); // NOI18N
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 600, 100, 70));

        btnCapturar.setBackground(new java.awt.Color(0, 0, 0));
        btnCapturar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Menu/Imagenes/capturar.png"))); // NOI18N
        btnCapturar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapturarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCapturar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 600, 100, 70));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, 20, 410));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Menu/Imagenes/fondo2.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, -5, 1040, 710));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        
        int pregunta = JOptionPane.showConfirmDialog(this, "Guardar fotografia?", "PREGUNTA", JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE);
        
        if(pregunta == 0){
            File SalidaImagen = new File("C:\\Users\\diego\\OneDrive\\Documentos\\FOTO"+contador+".png"); //// RUTA donde se guarde la imagen
        
            
            try{
                ImageIO.write(ruta, "png", SalidaImagen);
                JOptionPane.showMessageDialog(this, "Imagen Guardada en: "+ SalidaImagen.getAbsolutePath());
            }catch(Exception e){
                System.out.println("Error: "+e);
            }
            
            lblFotoTomada.setIcon(null);
            btnGuardar.setEnabled(false);
            btnCapturar.setText("CAPTURAR FOTO");
            
            
        }
        
        contador++;
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCapturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapturarActionPerformed
        
        btnCapturar.setText("Tomar otra foto");
        btnGuardar.setEnabled(true);
        
        ImageIcon foto;
        foto = new ImageIcon(webcam.getImage());
        Icon iconoFoto = new ImageIcon(foto.getImage().getScaledInstance(lblFotoTomada.getWidth(), lblFotoTomada.getHeight(), Image.SCALE_SMOOTH));
        lblFotoTomada.setIcon(iconoFoto);
        
        
        ruta = webcam.getImage();
        
    }//GEN-LAST:event_btnCapturarActionPerformed

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        
        textoBotonesCuandoCargaCamara();
        
        Thread hilo = new Thread(){
        
            @Override
            public void run(){
                webcamPanel.start();
                prenderBotones();
                textoBotonesCuandoCargoCamara();
            
            
            }
        };
        
        hilo.setDaemon(true);
        hilo.start();
        btnIniciar.setEnabled(false);
        
        
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void btnApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApagarActionPerformed
        webcamPanel.stop();
        apagarBotones();
        btnIniciar.setEnabled(true);
        
        lblFotoTomada.setIcon(null);
    }//GEN-LAST:event_btnApagarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CamaraFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CamaraFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CamaraFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CamaraFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CamaraFrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApagar;
    private javax.swing.JButton btnCapturar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnIniciar;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblFotoTomada;
    private javax.swing.JLabel lblNombreCamara;
    private javax.swing.JPanel pnlCamara;
    // End of variables declaration//GEN-END:variables
}
