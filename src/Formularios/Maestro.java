
package Formularios;

import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;


public class Maestro extends javax.swing.JFrame {

    
    static boolean[] estVentanas=new boolean[50];
    static String[] nomVentanas= new String[50];
    static int nroVentanas=0;
    
    public Maestro() {
        initComponents();
        setLocationRelativeTo(null);
        limpiar();
        addWindowListener(new java.awt.event.WindowAdapter() {//Se agrga para controlar el evento de cerral el sistema
            @Override
            public void windowClosing(java.awt.event.WindowEvent evt) {
                close();
            }
        });
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        desktopPane = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuregistroyconsulta = new javax.swing.JMenu();
        menupaciente = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        menucitas = new javax.swing.JMenuItem();
        menuservicios = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        menuusuarios = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Menu Principal Del Sistema");

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 753, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
        );

        menuregistroyconsulta.setText("Registro y Consulta");
        menuregistroyconsulta.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N

        menupaciente.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        menupaciente.setText("Paciente");
        menupaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menupacienteActionPerformed(evt);
            }
        });
        menuregistroyconsulta.add(menupaciente);

        jMenuItem2.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jMenuItem2.setText("Historial");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        menuregistroyconsulta.add(jMenuItem2);

        menucitas.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        menucitas.setText("Citas");
        menucitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menucitasActionPerformed(evt);
            }
        });
        menuregistroyconsulta.add(menucitas);

        menuservicios.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        menuservicios.setText("Servicios");
        menuservicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuserviciosActionPerformed(evt);
            }
        });
        menuregistroyconsulta.add(menuservicios);

        jMenuBar1.add(menuregistroyconsulta);

        jMenu4.setText("Movimientos");
        jMenu4.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });

        jMenuItem5.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jMenuItem5.setText("Faturacion");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem5);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Reportes");
        jMenu5.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N

        jMenuItem1.setText("Reporte");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem1);

        jMenuBar1.add(jMenu5);

        jMenu6.setText("Sistema");
        jMenu6.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N

        menuusuarios.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        menuusuarios.setText("Registro y Consulta de Usuario");
        menuusuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuusuariosActionPerformed(evt);
            }
        });
        jMenu6.add(menuusuarios);

        jMenuBar1.add(jMenu6);

        jMenu7.setText("Ayuda");
        jMenu7.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jMenuBar1.add(jMenu7);

        jMenu8.setText("Salir");
        jMenu8.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jMenu8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu8ActionPerformed(evt);
            }
        });

        jMenuItem3.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jMenuItem3.setText("Salir Del Sistema");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem3);

        jMenuBar1.add(jMenu8);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menupacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menupacienteActionPerformed
        //new Paciente().setVisible(true);
        mostarUnavez(desktopPane, new Paciente());
    }//GEN-LAST:event_menupacienteActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        Historial histo= new Historial();
        mostarUnavez(desktopPane, histo);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void menuserviciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuserviciosActionPerformed
        //new Servicios().setVisible(true);
        mostarUnavez(desktopPane, new Servicios());
    }//GEN-LAST:event_menuserviciosActionPerformed

    private void menuusuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuusuariosActionPerformed
      //  new Usuarios().setVisible(true);
        mostarUnavez(desktopPane, new Usuarios());
    }//GEN-LAST:event_menuusuariosActionPerformed

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed
        
    }//GEN-LAST:event_jMenu4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        //new factura().setVisible(true);
        mostarUnavez(desktopPane, new factura());
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void menucitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menucitasActionPerformed
        //new cita().setVisible(true);
        mostarUnavez(desktopPane, new cita());
    }//GEN-LAST:event_menucitasActionPerformed

    private void jMenu8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu8ActionPerformed
        
    }//GEN-LAST:event_jMenu8ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        int r= JOptionPane.showConfirmDialog(null, "Desea Salir Del Sistema");
        if(r==0){
            System.exit(0);
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        mostarUnavez(desktopPane, new ReporteDia());
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(Maestro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Maestro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Maestro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Maestro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Maestro().setVisible(true);
            }
        });
    }
    
       static public String nombreClass(Object ventana){
        return ventana.getClass().getName();
    }
    public static boolean estaAgregada(Object ventana){
        for (int i = 0; i < nroVentanas; i++) {
           // try{
            if(nomVentanas[i].equals(nombreClass(ventana))){

                return true; 
            }
          //  }catch(Exception ex){
                
           // }
              
        }
        
        
    return false;
    }
        public static boolean estaActiva(Object ventana){
        for (int i = 0; i < nroVentanas; i++) {
    //        try{
                if(nomVentanas[i].equals(nombreClass(ventana))&&estVentanas[i]==true)
                return true;  
            
            
         //   }catch(Exception ex){
                
          //  }
               
        }
        
        
        
    return false;
    }
    private static int obtenerNorVent(Object ventana){
        for (int i = 0; i < nroVentanas; i++) {
            if(nomVentanas[i].equals(nombreClass(ventana)))
                return i;     
        }
        return -1;
    }
    private static void añadirNomVent(Object ventana) {
        if (nroVentanas == 0) {
            nomVentanas[0] = nombreClass(ventana);
            estVentanas[0] = false;
            nroVentanas++;
        } else {
            for (int i = 0; i < nroVentanas; i++) {
                if (!estaAgregada(ventana)) {
                    nomVentanas[nroVentanas] = nombreClass(ventana);
                    estVentanas[nroVentanas] = false;
                    nroVentanas++;
                    return;

                }

            }
            return;

        }

    }
    public static void mostarUnavez( javax.swing.JDesktopPane escritorio, JInternalFrame ventana){
        JInternalFrame[] ventanas;
        //ventana= new JInternalFrame();
        escritorio.add(ventana);
        ventanas = escritorio.getAllFrames();
        añadirNomVent(ventana);
        //if (v==true) {
            if(estaActiva(ventana)){
            for (int i = 0; i < ventanas.length; i++) {
                if (nombreClass(ventanas[i]).equals(nombreClass(ventana))) {
                    if (ventana.isMaximum()) {
                        try {
                            ventanas[i].setMaximum(false);
                            ventanas[i].setMaximum(true);
                        } catch (PropertyVetoException ex) {

                            Logger.getLogger(nombreClass(ventana)).log(Level.SEVERE, null, ex);
                        }
                    } else {
                        try {
                            ventanas[i].setMaximum(true);
                            ventanas[i].setMaximum(false);
                        } catch (PropertyVetoException ex) {
                            Logger.getLogger(nombreClass(ventana)).log(Level.SEVERE, null, ex);
                        }
                    }
                }
            }
            escritorio.remove(ventana);
        } else {
            estVentanas[obtenerNorVent(ventana)]=true;
            ventana.show();
        }
    }
    public static void cerrarVentana(JInternalFrame ventana){
        estVentanas[obtenerNorVent(ventana)]=false;    
    }
    private void limpiar(){
        for(int i=0;i < 50;i++)
            nomVentanas[i]="";
        for(int i=0;i < 50;i++)
            estVentanas[i]=false;
    }
    private void close() {//pide comfirmacion al salir del sistema
        if (JOptionPane.showConfirmDialog(rootPane, "¿Desea realmente salir del sistema?",
                "Salir del sistema", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem menucitas;
    private javax.swing.JMenuItem menupaciente;
    private javax.swing.JMenu menuregistroyconsulta;
    private javax.swing.JMenuItem menuservicios;
    private javax.swing.JMenuItem menuusuarios;
    // End of variables declaration//GEN-END:variables
}
