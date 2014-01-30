
package Formularios;

import BaseDeDatos.ConexionMySQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Citas extends javax.swing.JFrame {

    String[] titulo={"Cedula","Nombres","Apellidos","Id","Nivel"};
    DefaultTableModel modelo;
    
    public Citas() {
        initComponents();
        modelo=new DefaultTableModel(null,titulo);
        tblcitas.setModel(modelo);
        setLocationRelativeTo(null);
    }

     void limpiar(){
         txtcedula.setText("");
         txtnombres.setText("");
         txtapellidos.setText("");
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnguardar = new javax.swing.JButton();
        btnlimpiar = new javax.swing.JButton();
        btnbuscar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btnactualizar = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cbocedula = new javax.swing.JComboBox();
        txtcedula = new javax.swing.JTextField();
        txtnombres = new javax.swing.JTextField();
        txtapellidos = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        clrfechacita = new org.gui.JCalendarCombo();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblcitas = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        clrfechabuscar = new org.gui.JCalendarCombo();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro de Citas");

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/aceptar2.png"))); // NOI18N
        btnguardar.setToolTipText("Guardar");
        btnguardar.setBorderPainted(false);
        btnguardar.setContentAreaFilled(false);
        btnguardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnguardar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/aceptar3.png"))); // NOI18N
        btnguardar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/aceptar1.png"))); // NOI18N
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        btnlimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/actualizar2.png"))); // NOI18N
        btnlimpiar.setToolTipText("Limpiar");
        btnlimpiar.setBorderPainted(false);
        btnlimpiar.setContentAreaFilled(false);
        btnlimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnlimpiar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/actualizar3.png"))); // NOI18N
        btnlimpiar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/actualizar1.png"))); // NOI18N
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });

        btnbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/buscar2.png"))); // NOI18N
        btnbuscar.setToolTipText("Buscar");
        btnbuscar.setBorderPainted(false);
        btnbuscar.setContentAreaFilled(false);
        btnbuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnbuscar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/buscar3.png"))); // NOI18N
        btnbuscar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/buscar1.png"))); // NOI18N
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/borrar2.png"))); // NOI18N
        jButton4.setToolTipText("Eliminar");
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/borrar3.png"))); // NOI18N
        jButton4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/borrar1.png"))); // NOI18N

        btnactualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/limpiar2.png"))); // NOI18N
        btnactualizar.setToolTipText("Actualizar");
        btnactualizar.setBorderPainted(false);
        btnactualizar.setContentAreaFilled(false);
        btnactualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnactualizar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/limpiar3.png"))); // NOI18N
        btnactualizar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/actualizar1_1.png"))); // NOI18N
        btnactualizar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/limpiar1.png"))); // NOI18N

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/cancelar2.png"))); // NOI18N
        jButton6.setToolTipText("Salir");
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/cancelar3.png"))); // NOI18N
        jButton6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/cancelar1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(btnguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnactualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnguardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnlimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnbuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnactualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Paciente");

        cbocedula.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbocedula.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "V-", "E-" }));
        cbocedula.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbocedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbocedulaActionPerformed(evt);
            }
        });

        txtcedula.setEditable(false);
        txtcedula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtcedulaMouseClicked(evt);
            }
        });

        txtnombres.setEditable(false);
        txtnombres.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtnombres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtnombresMouseClicked(evt);
            }
        });
        txtnombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnombresKeyPressed(evt);
            }
        });

        txtapellidos.setEditable(false);
        txtapellidos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtapellidos.setToolTipText("");
        txtapellidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtapellidosMouseClicked(evt);
            }
        });
        txtapellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtapellidosActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Fecha de cita");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tblcitas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblcitas);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Indique fecha a buscar");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clrfechabuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 13, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel4)
                    .addComponent(clrfechabuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbocedula, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtnombres, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtapellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(clrfechacita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtapellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbocedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(clrfechacita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );

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

    private void cbocedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbocedulaActionPerformed

    }//GEN-LAST:event_cbocedulaActionPerformed

    private void txtcedulaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcedulaMouseClicked
        new BusquedaPac2().setVisible(true);
    }//GEN-LAST:event_txtcedulaMouseClicked

    private void txtnombresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtnombresMouseClicked
        new BusquedaPac2().setVisible(true);
    }//GEN-LAST:event_txtnombresMouseClicked

    private void txtnombresKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombresKeyPressed
        new BusquedaPac2().setVisible(true);
    }//GEN-LAST:event_txtnombresKeyPressed

    private void txtapellidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtapellidosMouseClicked
        new BusquedaPac2().setVisible(true);
    }//GEN-LAST:event_txtapellidosMouseClicked

    private void txtapellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtapellidosActionPerformed
        new BusquedaPac2().setVisible(true);
    }//GEN-LAST:event_txtapellidosActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        String cedula="", ced1="", ced2="", nombre="", apellido="", dia="", mes="", ano="", fecha="", sSQL="";
        
        ced1=cbocedula.getSelectedItem().toString();
        ced2=txtcedula.getText();
        nombre=txtnombres.getText();
        apellido=txtapellidos.getText();
        dia=clrfechacita.getSelectedDay();
        mes=clrfechacita.getSelectedMonth();
        ano=clrfechacita.getSelectedYear();
        fecha=ano+"/"+mes+"/"+dia;
        
        ConexionMySQL mysql = new ConexionMySQL();
        Connection cn = mysql.Conectar();
        
        sSQL="INSERT INTO cita(cit_tipocedula, cit_cedula, cit_nombres, cit_apellidos, cit_fecha) VALUES (?,?,?,?,?)";
        
         try {
             PreparedStatement pst = cn.prepareStatement(sSQL);
             pst.setString(1, ced1);
             pst.setString(2, ced2);
             pst.setString(3, nombre);
             pst.setString(4, apellido);
             pst.setString(5, fecha);
            
             int n = pst.executeUpdate();
             if (n > 0) {
                 JOptionPane.showMessageDialog(null, "La cita fue registrada exitosamente");
                 limpiar();
                 NiveldeAcceso entrada= new NiveldeAcceso();
                 Statement stmt=cn.createStatement();
                 int result=stmt.executeUpdate("INSERT INTO bitacora VALUES (null,'"+entrada.nombre_usuario+"', 'Registro y Consulta de Pacientes', 'Guardo paciente CI: "+cedula+"', now())");
             }
         }
         catch(SQLException ex){
             JOptionPane.showMessageDialog(null,ex);
         }
    }//GEN-LAST:event_btnguardarActionPerformed

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnlimpiarActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        String fecha="", dia="", mes="", ano="", sSQL;
        String[] registro= new String[5];
        
        dia=clrfechabuscar.getSelectedDay();
        mes=clrfechabuscar.getSelectedMonth();
        ano=clrfechabuscar.getSelectedYear();
        fecha=ano+"/"+mes+"/"+dia;
        
        ConexionMySQL mysql =new ConexionMySQL();
        Connection cn=mysql.Conectar();
        
        sSQL="SELECT cit_tipocedula, cit_cedula, cit_nombres, cit_apellidos, cit_fecha FROM cita WHERE cit_fecha = '"+fecha+"'";
        
             try {
             Statement st=cn.createStatement();
             ResultSet rs = st.executeQuery(sSQL); 
             
             while(rs.next()){
                 registro[0]=rs.getString("cit_tipocedula")+rs.getString("cit_cedula");           
                 registro[1]=rs.getString("cit_nombres");
                 registro[2]=rs.getString("cit_apellidos");
                 registro[3]=rs.getString("cit_fecha");
                 modelo.addRow(registro);
             }
                 NiveldeAcceso entrada= new NiveldeAcceso();
                 Statement stmt=cn.createStatement();
                 int result=stmt.executeUpdate("INSERT INTO bitacora VALUES (null,'"+entrada.nombre_usuario+"', 'Registro y Consulta de Usuario', 'Consulto Usuario CI: "+registro[0]+" ', now())");
                  
             }
         catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, ex);
        }   
    }//GEN-LAST:event_btnbuscarActionPerformed

    
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
            java.util.logging.Logger.getLogger(Citas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Citas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Citas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Citas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Citas().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnactualizar;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnlimpiar;
    public static javax.swing.JComboBox cbocedula;
    private org.gui.JCalendarCombo clrfechabuscar;
    private org.gui.JCalendarCombo clrfechacita;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblcitas;
    public static javax.swing.JTextField txtapellidos;
    public static javax.swing.JTextField txtcedula;
    public static javax.swing.JTextField txtnombres;
    // End of variables declaration//GEN-END:variables
}
