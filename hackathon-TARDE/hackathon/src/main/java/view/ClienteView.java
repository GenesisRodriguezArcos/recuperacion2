package view;

import db.conexion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Juan Condori
 */
public class ClienteView extends javax.swing.JFrame {

    conexion conexion = new conexion();
    
    Connection cn;
    DefaultTableModel modelo;
    Statement st;
    ResultSet rs;
    int id;
    public String sexo = "";

    public ClienteView() {
        initComponents();
        setLocationRelativeTo(null);
        listar();
        btnGroupSexo.add(jRadioMasculino);
        btnGroupSexo.add(jRadioFemenino);   /*botones de los sexos*/
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupSexo = new javax.swing.ButtonGroup();
        jLabelRegistro = new javax.swing.JLabel();
        jLabelLista = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabeId = new javax.swing.JLabel();
        jTxtId = new javax.swing.JTextField();
        jLabelDni = new javax.swing.JLabel();
        txtDNI = new javax.swing.JTextField();
        jLabelNombres = new javax.swing.JLabel();
        txtNOMBRES = new javax.swing.JTextField();
        jLabelApellidos = new javax.swing.JLabel();
        txtAPELLIDOS = new javax.swing.JTextField();
        jLabelDireccion = new javax.swing.JLabel();
        jScrollPaneDireccion = new javax.swing.JScrollPane();
        txtAreaDireccion = new javax.swing.JTextArea();
        jLabelCelular = new javax.swing.JLabel();
        txtCELULAR = new javax.swing.JTextField();
        jLabelSexo = new javax.swing.JLabel();
        jRadioMasculino = new javax.swing.JRadioButton();
        jRadioFemenino = new javax.swing.JRadioButton();
        jdcFecha = new com.toedter.calendar.JDateChooser();
        button1 = new java.awt.Button();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDatos = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btnRegistrar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 153, 255));
        setMinimumSize(new java.awt.Dimension(615, 550));

        jLabelRegistro.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelRegistro.setText("REGISTRO DE CLIENTE");

        jLabelLista.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelLista.setText("LISTA DE CLIENTES");

        jPanel1.setBackground(new java.awt.Color(204, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));

        jLabeId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabeId.setText("ID:");

        jTxtId.setEditable(false);
        jTxtId.setEnabled(false);

        jLabelDni.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelDni.setText("DNI:");

        txtDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDNIActionPerformed(evt);
            }
        });

        jLabelNombres.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelNombres.setText("NOMBRES:");

        jLabelApellidos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelApellidos.setText("APELLIDOS:");

        txtAPELLIDOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAPELLIDOSActionPerformed(evt);
            }
        });

        jLabelDireccion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelDireccion.setText("DIRECCIÓN:");

        txtAreaDireccion.setColumns(20);
        txtAreaDireccion.setRows(5);
        jScrollPaneDireccion.setViewportView(txtAreaDireccion);

        jLabelCelular.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelCelular.setText("CELULAR:");

        txtCELULAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCELULARActionPerformed(evt);
            }
        });

        jLabelSexo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelSexo.setText("SEXO:");

        jRadioMasculino.setText("Masculino");

        jRadioFemenino.setText("Femenino");

        button1.setActionCommand("Mostrar fecha");
        button1.setLabel("button1");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelNombres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelDni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabeId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTxtId, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDNI, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addComponent(txtNOMBRES)
                    .addComponent(txtAPELLIDOS))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelSexo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelCelular, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelDireccion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jRadioMasculino)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioFemenino))
                    .addComponent(jScrollPaneDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(txtCELULAR))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jdcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTxtId)
                            .addComponent(jLabeId))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelDni)
                            .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNOMBRES, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelNombres))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAPELLIDOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelApellidos)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabelDireccion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelCelular)
                                    .addComponent(txtCELULAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jdcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPaneDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelSexo)
                            .addComponent(jRadioMasculino)
                            .addComponent(jRadioFemenino))))
                .addGap(14, 14, 14))
        );

        jPanel2.setBackground(new java.awt.Color(204, 153, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista"));

        TablaDatos.setBackground(new java.awt.Color(204, 153, 255));
        TablaDatos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        TablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "DNI", "NOMBRES", "APELLIDOS", "DIRECCIÓN", "CELULAR", "SEXO"
            }
        ));
        TablaDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaDatosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaDatos);
        if (TablaDatos.getColumnModel().getColumnCount() > 0) {
            TablaDatos.getColumnModel().getColumn(0).setMinWidth(50);
            TablaDatos.getColumnModel().getColumn(0).setPreferredWidth(50);
            TablaDatos.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 757, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(204, 153, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Operaciones"));

        btnRegistrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRegistrar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ángeles\\Downloads\\hackathon-TARDE\\hackathon\\src\\main\\java\\images\\registrar.png")); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnEditar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEditar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ángeles\\Downloads\\hackathon-TARDE\\hackathon\\src\\main\\java\\images\\editar.png")); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ángeles\\Downloads\\hackathon-TARDE\\hackathon\\src\\main\\java\\images\\eliminar.png")); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLimpiar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ángeles\\Downloads\\hackathon-TARDE\\hackathon\\src\\main\\java\\images\\limpiar.png")); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegistrar)
                .addGap(18, 18, 18)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEliminar)
                .addGap(18, 18, 18)
                .addComponent(btnLimpiar)
                .addGap(109, 109, 109))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar)
                    .addComponent(btnEditar)
                    .addComponent(btnEliminar)
                    .addComponent(btnLimpiar))
                .addGap(0, 23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelRegistro)
                .addGap(224, 224, 224))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelLista)
                .addGap(244, 244, 244))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jLabelRegistro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabelLista)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        registrar();
        listar();
        nuevo();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        editar();
        listar();
        nuevo();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminar();
        listar();
        nuevo();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        nuevo();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void TablaDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaDatosMouseClicked
        int row = TablaDatos.getSelectedRow();
        if (row == -1) {
            System.out.println("No se Selecciono");
        } else {
            id = Integer.parseInt((String) TablaDatos.getValueAt(row, 0).toString());
            String dni = (String) TablaDatos.getValueAt(row, 1);
            String nom = (String) TablaDatos.getValueAt(row, 2);
            String apell = (String) TablaDatos.getValueAt(row, 3);
            String direccion = (String) TablaDatos.getValueAt(row, 4);
            String celular = (String) TablaDatos.getValueAt(row, 5);
            String sexo = (String) TablaDatos.getValueAt(row, 6).toString();
            jTxtId.setText("" + id);
            txtDNI.setText(dni);
            txtNOMBRES.setText(nom);
            txtAPELLIDOS.setText(apell);
            txtAreaDireccion.setText(direccion);
            txtCELULAR.setText(celular);
            if (sexo.equals("M")) {
                jRadioMasculino.setSelected(true);
            } else {
                jRadioFemenino.setSelected(true);
            }
        }
    }//GEN-LAST:event_TablaDatosMouseClicked

    private void txtDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDNIActionPerformed

    private void txtCELULARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCELULARActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCELULARActionPerformed

    private void txtAPELLIDOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAPELLIDOSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAPELLIDOSActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
       Date mFecha = (Date) jdcFecha.getDate();  /*obtencion de la fecha seleccionada mfecha no debe de ser null*/
       long fecha = mFecha.getTime(); /*Devuelve l fecha a milisegundos*/
       java.sql.Date fecha_sql = new java.sql.Date(fecha);
       
       JOptionPane.showMessageDialog(null, fecha); /*Mostrar cuadro de dialogo*/
    }//GEN-LAST:event_button1ActionPerformed

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
            java.util.logging.Logger.getLogger(ClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
      try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClienteView().setVisible(true);
            }
        });
    }

    void listar() {
        String sql = "SELECT * FROM cliente";
        try {
            cn = conexion.conectar();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            Object[] cliente = new Object[7];  /*se crea un arreglo de objetos*/
            modelo = (DefaultTableModel) TablaDatos.getModel();
            while (rs.next()) {
                cliente[0] = rs.getInt("ID");
                cliente[1] = rs.getString("DNI");
                cliente[2] = rs.getString("NOMBRES");
                cliente[3] = rs.getString("APELLIDOS");
                cliente[4] = rs.getString("DIRECCION");
                cliente[5] = rs.getString("CELULAR");
                cliente[6] = rs.getString("SEXO");
                modelo.addRow(cliente);
            }
            TablaDatos.setModel(modelo);
        } catch (Exception e) {
            System.out.println("Error Listar " + e);
        }
    }


    void registrar() {
    String dni = txtDNI.getText();    /*recopilacion de datos de la interfaz*/
    String nombres = txtNOMBRES.getText();
    String apellidos = txtAPELLIDOS.getText();
    String direccion = txtAreaDireccion.getText();
    String celular = txtCELULAR.getText();
    if (jRadioMasculino.isSelected() == true) {   /*determinacion del sexo*/
    sexo = "M";
    }else{
    sexo = "F";
    }
    try {
        String sql = "INSERT INTO cliente (DNI, NOMBRES, APELLIDOS, DIRECCION, CELULAR, SEXO) values('" + dni + "','" + nombres + "','" + apellidos + "','" + direccion + "','" + celular + "','" + sexo + "')";
        cn = conexion.conectar();
        st = cn.createStatement();
        st.executeUpdate(sql);
         System.out.println("Cliente Registrado con Exito");
            JOptionPane.showMessageDialog(null, "Cliente registrado");
            limpiarTabla(modelo);
        } catch (Exception e) {
            System.out.println("Error Registrar " + e);
        }
    }

    void editar() {
        
        String dni = txtDNI.getText();
        String nombres = txtNOMBRES.getText();
        String apellidos = txtAPELLIDOS.getText();
        String direccion = txtAreaDireccion.getText();
        String celular = txtCELULAR.getText();
        if (jRadioMasculino.isSelected() == true) {
            sexo = "M";
        } else {
            sexo = "F";
        }
        try {
            String sql = "UPDATE cliente SET dni='" + dni + "', NOMBRES='" + nombres + "', APELLIDOS='" + apellidos + "', DIRECCION='" + direccion + "', CELULAR='" + celular + "', SEXO='" + sexo + "' WHERE id=" + id;
            cn = conexion.conectar();
            st = cn.createStatement();
            st.executeUpdate(sql);
            System.out.println("Cliente Actualizado con Exito");
            JOptionPane.showMessageDialog(null,"Cliente actualizado");
            limpiarTabla(modelo);
        } catch (Exception e) {
            System.out.println("Error Editar " + e);
        }
    }

   void eliminar() {
     String sql = "DELETE FROM cliente WHERE id=" + id;
        int fila = TablaDatos.getSelectedRow();
        if (fila < 0) {   /*si la fila es menor que 0 significa que no se selecciono nada*/
            System.out.println("Cliente no Seleccionado");
            limpiarTabla(modelo);
        } else {
            try {
                cn = conexion.conectar();
                st = cn.createStatement();
                st.executeUpdate(sql);
                System.out.println("Cliente Eliminado con éxito");
                JOptionPane.showMessageDialog(null, "Cliente eliminado");
                limpiarTabla(modelo);
            } catch (Exception e) {
                System.out.println("Error Eliminar " + e);
            }
        }
    }

    
    void limpiarTabla(DefaultTableModel model) {  /*declaracion de metodos*/
        int rowCount = TablaDatos.getRowCount(); /*numero total de filas*/
        for (int i = rowCount - 1; i >= 0; i--) {   /*ultima a primera,  borrar*/
            model.removeRow(i);
        }
    }
    
    void nuevo() {
        jTxtId.setText("");
        txtDNI.setText("");
        txtNOMBRES.setText("");
        txtAPELLIDOS.setText("");
        txtAreaDireccion.setText("");
        txtCELULAR.setText("");    /*se borran los valores actuales de los campos, permitiendo al usuario ingresar nuevos datos.*/
        jTxtId.requestFocus();

    }
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTable TablaDatos;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    public static javax.swing.ButtonGroup btnGroupSexo;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRegistrar;
    private java.awt.Button button1;
    private javax.swing.JLabel jLabeId;
    private javax.swing.JLabel jLabelApellidos;
    private javax.swing.JLabel jLabelCelular;
    private javax.swing.JLabel jLabelDireccion;
    private javax.swing.JLabel jLabelDni;
    private javax.swing.JLabel jLabelLista;
    private javax.swing.JLabel jLabelNombres;
    private javax.swing.JLabel jLabelRegistro;
    private javax.swing.JLabel jLabelSexo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public static javax.swing.JRadioButton jRadioFemenino;
    public static javax.swing.JRadioButton jRadioMasculino;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPaneDireccion;
    public static javax.swing.JTextField jTxtId;
    private com.toedter.calendar.JDateChooser jdcFecha;
    public static javax.swing.JTextField txtAPELLIDOS;
    public static javax.swing.JTextArea txtAreaDireccion;
    public static javax.swing.JTextField txtCELULAR;
    public static javax.swing.JTextField txtDNI;
    public static javax.swing.JTextField txtNOMBRES;
    // End of variables declaration//GEN-END:variables
}
