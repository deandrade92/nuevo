/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * SplashScream.java
 *
 * Created on 08/07/2012, 02:29:17 AM
 */

package Ventanas;

import Clases.Hilo;
import Clases.Trasparencia;
import Formularios.Acceso;
import Formularios.Maestro;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author robert
 */
public class SplashScream extends javax.swing.JFrame implements Runnable {

    private Thread Hilo;
    /** Creates new form SplashScream */
    public SplashScream() {
        setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        new Trasparencia().TransCompFrame(this);
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        lblMensajes = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Formularios/Logo.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 170, 190));
        getContentPane().add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 610, 20));

        lblMensajes.setText("Mensajes");
        getContentPane().add(lblMensajes, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 190, 370, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/SplashScreen.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
     new Hilo(jProgressBar1,lblMensajes).start();
    }//GEN-LAST:event_formWindowOpened

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SplashScream().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel lblMensajes;
    // End of variables declaration//GEN-END:variables
public void run(){

    try {
        this.setLocationRelativeTo(null);
        this.setLocation(400, 200);
        this.setVisible(true);
        Hilo.sleep(6000);
        this.dispose();
         
        Acceso inicioSesion=new Acceso();
        inicioSesion.setLocationRelativeTo(null);
        //VentanaPrincipa.setLocation(400, 200);
        inicioSesion.setVisible(true);
                
    } catch (Exception e) {
    }
}
private void setLookAndFeel(String laf)
    {

            if (laf==null) {
                    laf=UIManager.getSystemLookAndFeelClassName();
            }
            else
            {
                try {
                        UIManager.setLookAndFeel(laf);
                } catch (InstantiationException ex) {
 
                } catch (ClassNotFoundException ex) {
 
                } catch (UnsupportedLookAndFeelException ex) {
 
                } catch (IllegalAccessException ex) {
 
                }
            }
            SwingUtilities.updateComponentTreeUI(this);
    }
}
