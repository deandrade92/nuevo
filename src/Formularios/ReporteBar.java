package Formularios;


import BaseDeDatos.ConexionMySQL;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

public class ReporteBar extends javax.swing.JFrame {

    public ReporteBar(String archivo,String mensaje,String mensaje2) {
        initComponents();
         setArchivo(archivo,mensaje2);
         lblReporte.setText("Generando "+mensaje+", por favor espere...");
         btnAceptar.setEnabled(false);
         jpbReporte.setIndeterminate(true);
         hilobar();
          }
    
    public ReporteBar(String archivo,String mensaje,String mensaje2,String parametroReport) {
        initComponents();
         setArchivo(archivo,mensaje2,parametroReport);
         lblReporte.setText("Generando "+mensaje+", por favor espere...");
         btnAceptar.setEnabled(false);
         jpbReporte.setIndeterminate(true);
         hilobar2();
          }
    
    String archivoReporte,mensajer;
    String parametroR;
    
          public void setArchivo(String report,String mensajeFinal) {
           archivoReporte=report;
           mensajer=mensajeFinal;
}        
          public void setArchivo(String report,String mensajeFinal,String parametro) {
           archivoReporte=report;
           mensajer=mensajeFinal;
           parametroR=parametro;
}        
        void hilobar(){
        Thread generarR=new generarReporte();
         generarR.start();   
        }  
        void hilobar2(){
        Thread generarR=new generarReporteParametro();
         generarR.start();   
        }  
        
          
class generarReporte extends Thread {

    @Override
    public void run(){
 ConexionMySQL mysql = new ConexionMySQL();
    try{
    JasperReport reportes=JasperCompileManager.compileReport(archivoReporte);
    JasperPrint print=JasperFillManager.fillReport(reportes,null,mysql.Conectar());
    JasperViewer.viewReport(print,false);
    
    jpbReporte.setIndeterminate(false);jpbReporte.setValue(100);
    lblReporte.setText(mensajer);
    btnAceptar.setEnabled(true);
    } catch (Exception ex)
    {System.out.println(ex);}
    
}
    }

          
class generarReporteParametro extends Thread {

    @Override
    public void run(){
ConexionMySQL mysql = new ConexionMySQL();
    try{
    Map parametro=new HashMap();
    JasperReport reportes=JasperCompileManager.compileReport(archivoReporte);
    parametro.put("P",parametroR);
    JasperPrint print=JasperFillManager.fillReport(reportes,parametro,mysql.Conectar());
 
    JasperViewer.viewReport(print,false);
    
    jpbReporte.setIndeterminate(false);jpbReporte.setValue(100);
    lblReporte.setText(mensajer);
    btnAceptar.setEnabled(true);
    } catch (Exception ex)
    {System.out.println(ex);}
    
}
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAceptar = new javax.swing.JButton();
        jpbReporte = new javax.swing.JProgressBar();
        lblReporte = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        lblReporte.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblReporte.setText("Por favor espere, su reporte se está generando");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jpbReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addComponent(btnAceptar))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblReporte)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblReporte)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpbReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAceptar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
this.dispose();
    }//GEN-LAST:event_btnAceptarActionPerformed
public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JProgressBar jpbReporte;
    private javax.swing.JLabel lblReporte;
    // End of variables declaration//GEN-END:variables
}
