package universidadejemplo.Vistas;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import universidadejemplo.AccesoADatos.MateriaData;
import universidadejemplo.Entidades.Materia;


public class BuscadorMateria extends javax.swing.JFrame {
    List<Materia> materias;
    DefaultTableModel model=new DefaultTableModel(){
        @Override
        public boolean isCellEditable(int row, int column) {
             return false;
        }
        
    };
    AgregarMateria ven;
    MateriaData mat;
    public BuscadorMateria(AgregarMateria ven) {
        mat=new MateriaData();
        materias=mat.listarMaterias();
        initComponents();
        this.ven=ven;
        iniciarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtMateria = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaM = new javax.swing.JTable();
        btnSeleccionar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Materia");

        txtMateria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMateriaKeyReleased(evt);
            }
        });

        TablaM.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TablaM);

        btnSeleccionar.setText("Seleccionar");
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSeleccionar)
                .addGap(35, 35, 35))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeleccionar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void txtMateriaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMateriaKeyReleased
        limpiarTabla();
        for (Materia materia : materias) {
            if(materia.getNombre().startsWith(txtMateria.getText())){
                  model.addRow(new Object[] {materia.getIdMateria(), materia.getNombre(), materia.getAnioMateria()});
            }
        }
        
    }//GEN-LAST:event_txtMateriaKeyReleased

    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed
        if(TablaM.getSelectedRow()>-1){
        int idmateria=Integer.parseInt(TablaM.getValueAt(TablaM.getSelectedRow(), 0).toString());
        Materia materia=mat.buscarMateria(idmateria);
       ven.txtMateria.setText(materia.getNombre());
       ven.txtAño.setText(String.valueOf(materia.getAnioMateria()));
       ven.jRadio.setSelected(true);
        this.dispose();
       }
    }//GEN-LAST:event_btnSeleccionarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaM;
    private javax.swing.JButton btnSeleccionar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtMateria;
    // End of variables declaration//GEN-END:variables

    private void iniciarTabla(){
        String[] titles={"id","nombre","año"};
        model.setColumnIdentifiers(titles);
        TablaM.setModel(model);
        
        for (Materia materia : materias) {
                  model.addRow(new Object[] {materia.getIdMateria(), materia.getNombre(), materia.getAnioMateria()});   
        }
    }
    
    private void limpiarTabla(){
        for (int i = model.getRowCount()-1; i >= 0; i--) {
            model.removeRow(i);
        }
    }
    
}
