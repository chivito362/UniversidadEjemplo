package universidadejemplo.Vistas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import universidadejemplo.AccesoADatos.Conexion;
import universidadejemplo.AccesoADatos.MateriaData;
import universidadejemplo.Entidades.Materia;


public class AgregarMateria extends javax.swing.JInternalFrame {

    
    public AgregarMateria() {
        initComponents();
    }
 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbEstado = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMateria = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtAño = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jRadio = new javax.swing.JRadioButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setText("Materia");

        jLabel2.setText("Materia");

        jLabel3.setText("Año");

        jLabel4.setText("Estado");

        btnAgregar.setText("Agregar");
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAgregarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAgregarMouseExited(evt);
            }
        });
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnActualizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnActualizarMouseExited(evt);
            }
        });
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSalirMouseExited(evt);
            }
        });
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/xmag_search_find_export_locate_5984.png"))); // NOI18N
        btnBuscar.setText("buscar");
        btnBuscar.setBorderPainted(false);
        btnBuscar.setContentAreaFilled(false);
        btnBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBuscar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/xmag_search_find_export_locate_5984.png"))); // NOI18N
        btnBuscar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/xmag_search_find_export_locate_5984 (2).png"))); // NOI18N
        btnBuscar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cbEstadoLayout = new javax.swing.GroupLayout(cbEstado);
        cbEstado.setLayout(cbEstadoLayout);
        cbEstadoLayout.setHorizontalGroup(
            cbEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cbEstadoLayout.createSequentialGroup()
                .addContainerGap(92, Short.MAX_VALUE)
                .addComponent(btnAgregar)
                .addGap(72, 72, 72)
                .addComponent(btnActualizar)
                .addGap(82, 82, 82))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cbEstadoLayout.createSequentialGroup()
                .addGroup(cbEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(cbEstadoLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, cbEstadoLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(cbEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(cbEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadio)
                            .addGroup(cbEstadoLayout.createSequentialGroup()
                                .addGroup(cbEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1)
                                    .addComponent(txtMateria)
                                    .addComponent(txtAño, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBuscar)))))
                .addGap(19, 19, 19))
        );
        cbEstadoLayout.setVerticalGroup(
            cbEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cbEstadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(cbEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(cbEstadoLayout.createSequentialGroup()
                        .addGroup(cbEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(cbEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnBuscar))
                .addGap(33, 33, 33)
                .addGroup(cbEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jRadio))
                .addGap(49, 49, 49)
                .addGroup(cbEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizar)
                    .addComponent(btnAgregar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cbEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cbEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if(!txtAño.getText().equals("") && !txtMateria.getText().equals("")) {
              try{
        String nombre,año;
        boolean estado=jRadio.isSelected();
        nombre=txtMateria.getText();
        año=txtAño.getText();
        int año1=Integer.parseInt(año);
        Materia materia=new Materia(nombre,año1,estado);
        MateriaData mat=new MateriaData();
        mat.guardarMateria(materia);
        txtMateria.setText("");
        txtAño.setText("");
        jRadio.setSelected(false);
         }catch(NumberFormatException e){
                  JOptionPane.showMessageDialog(null, "El campo año solo debe tener Numeros");
              }
        } else {
            JOptionPane.showMessageDialog(null, "Los campos deben estar cargados");
        }
  
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
          if (!txtAño.getText().equals("") && !txtMateria.getText().equals("")) {
              try{
            String nombre, año;
            boolean estado = jRadio.isSelected();
            nombre = txtMateria.getText();
            año = txtAño.getText();
            int año1 = Integer.parseInt(año);
            Materia materia = new Materia(nombre, año1, estado);
            MateriaData mat = new MateriaData();
            mat.modificarMateria(materia);
            txtMateria.setText("");
            txtAño.setText("");
            jRadio.setSelected(false);
              }catch(NumberFormatException e){
                  JOptionPane.showMessageDialog(null, "El campo año solo debe tener Numeros");
              }
        } else {
            JOptionPane.showMessageDialog(null, "Los campos deben estar cargados");
        }
        
       
        
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
       this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        BuscadorMateria view=new BuscadorMateria(this);
        view.setVisible(true);
        view.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnAgregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseEntered
    btnAgregar.setSize(83, 31);       
    }//GEN-LAST:event_btnAgregarMouseEntered

    private void btnAgregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseExited
        btnAgregar.setSize(80, 28);
    }//GEN-LAST:event_btnAgregarMouseExited

    private void btnActualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMouseEntered
        btnActualizar.setSize(83, 31);
    }//GEN-LAST:event_btnActualizarMouseEntered

    private void btnActualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMouseExited
        btnActualizar.setSize(80, 28);
    }//GEN-LAST:event_btnActualizarMouseExited

    private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseEntered
       btnSalir.setSize(84, 32);
    }//GEN-LAST:event_btnSalirMouseEntered

    private void btnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseExited
        btnSalir.setSize(80, 28);
    }//GEN-LAST:event_btnSalirMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel cbEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public javax.swing.JRadioButton jRadio;
    public javax.swing.JTextField txtAño;
    public javax.swing.JTextField txtMateria;
    // End of variables declaration//GEN-END:variables
}
