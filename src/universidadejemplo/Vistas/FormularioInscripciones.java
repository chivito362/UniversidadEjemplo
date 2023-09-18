package universidadejemplo.Vistas;

import java.awt.PopupMenu;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import universidadejemplo.AccesoADatos.AlumnoData;
import universidadejemplo.AccesoADatos.InscripcionData;
import universidadejemplo.Entidades.Alumno;
import universidadejemplo.Entidades.Inscripcion;
import universidadejemplo.Entidades.Materia;

public class FormularioInscripciones extends javax.swing.JInternalFrame {
    
    ButtonGroup grupoBotones=new ButtonGroup();
   
    private DefaultTableModel modelo = new DefaultTableModel ();
        
        public boolean isCellEditable(int f, int c) {
        return false;  
    }

 
    public FormularioInscripciones() {
        initComponents();
        armarCabeceraTabla();
        cargarComboBox ();
        grupoBotones.add(rbtn);
        grupoBotones.add(rbno);
    }


   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbAlumnos = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        rbtn = new javax.swing.JRadioButton();
        rbno = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablaMaterias = new javax.swing.JTable();
        btnInscribirse = new javax.swing.JButton();
        btnAnularInscripcion = new javax.swing.JButton();
        btnSalirFInscripciones = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Formulario de Inscripciones");

        jLabel2.setText("Seleccione un Alumno:");

        cbAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAlumnosActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Listado de Materias");

        rbtn.setText("Materias Inscriptas");
        rbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnActionPerformed(evt);
            }
        });

        rbno.setText("Materias no Inscriptas");
        rbno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnoActionPerformed(evt);
            }
        });

        jTablaMaterias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTablaMaterias);

        btnInscribirse.setText("Inscribirse");
        btnInscribirse.setEnabled(false);
        btnInscribirse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInscribirseActionPerformed(evt);
            }
        });

        btnAnularInscripcion.setText("Anular Inscripción");
        btnAnularInscripcion.setEnabled(false);
        btnAnularInscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnularInscripcionActionPerformed(evt);
            }
        });

        btnSalirFInscripciones.setText("Salir");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(134, 134, 134))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(159, 159, 159))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(rbtn)
                        .addGap(47, 47, 47)
                        .addComponent(rbno)
                        .addGap(82, 82, 82))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel2)
                        .addGap(48, 48, 48)
                        .addComponent(cbAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 27, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(btnInscribirse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAnularInscripcion)
                .addGap(70, 70, 70)
                .addComponent(btnSalirFInscripciones)
                .addGap(49, 49, 49))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtn)
                    .addComponent(rbno))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInscribirse)
                    .addComponent(btnAnularInscripcion)
                    .addComponent(btnSalirFInscripciones))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAlumnosActionPerformed
      
    }//GEN-LAST:event_cbAlumnosActionPerformed

    private void btnInscribirseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInscribirseActionPerformed
        if(jTablaMaterias.getSelectedRow()>-1){
            Alumno alu=(Alumno)cbAlumnos.getSelectedItem();
        
        Materia materia=new Materia(Integer.parseInt(jTablaMaterias.getValueAt(jTablaMaterias.getSelectedRow(), 0).toString()));
        
        Inscripcion ins=new Inscripcion(alu, materia);
        
        InscripcionData insdata=new InscripcionData();
        
        insdata.GuardarInscripcion(ins);
         cargarNoCursadas();
        }else{
            JOptionPane.showMessageDialog(null, "Debe seleccionar una materia para inscribirse");
        }
        
    }//GEN-LAST:event_btnInscribirseActionPerformed

    private void btnAnularInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnularInscripcionActionPerformed
       if(jTablaMaterias.getSelectedRow()>-1){
        
        Alumno alu=(Alumno)cbAlumnos.getSelectedItem();
        
        InscripcionData insdata=new InscripcionData();
        
        insdata.borrarInscripcionMateriaAlumno(alu.getIdAlumno(), Integer.parseInt(jTablaMaterias.getValueAt(jTablaMaterias.getSelectedRow(), 0).toString()));
        cargarCursadas();
        }else{
            JOptionPane.showMessageDialog(null, "Debe seleccionar una materia para anular la inscripcion");
        }
    }//GEN-LAST:event_btnAnularInscripcionActionPerformed
          
                                             

    private void rbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnActionPerformed
       btnAnularInscripcion.setEnabled(true);
       btnInscribirse.setEnabled(false);
        cargarCursadas();
    }//GEN-LAST:event_rbtnActionPerformed

    private void rbnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnoActionPerformed
       btnAnularInscripcion.setEnabled(false);
       btnInscribirse.setEnabled(true);
       cargarNoCursadas();
    }//GEN-LAST:event_rbnoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnularInscripcion;
    private javax.swing.JButton btnInscribirse;
    private javax.swing.JButton btnSalirFInscripciones;
    private javax.swing.JComboBox<Alumno> cbAlumnos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTablaMaterias;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton rbno;
    private javax.swing.JRadioButton rbtn;
    // End of variables declaration//GEN-END:variables

    
    public void armarCabeceraTabla () { 
        
        modelo.addColumn("ID");
        modelo.addColumn("Materia");
        modelo.addColumn("Año");
        jTablaMaterias.setModel(modelo);
    }
    
    private void cargarComboBox() {
        AlumnoData aluData = new AlumnoData();
        List<Alumno> alumnos = aluData.listarAlumnos();
        for (Alumno alumno : alumnos) {
            cbAlumnos.addItem(alumno);
        }
    }
    
    private void limpiarTabla(){
        for (int i = modelo.getRowCount()-1; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }
    
    private void cargarCursadas(){
    limpiarTabla();
        
        InscripcionData data=new InscripcionData();
        Alumno alu=new Alumno();
        alu=(Alumno) cbAlumnos.getSelectedItem();
        
        List<Materia> materias=new ArrayList<>();
        materias=data.obtenerMateriasCursadas(alu.getIdAlumno());
        for (Materia materia : materias) {
            modelo.addRow(new Object[] {materia.getIdMateria(), materia.getNombre(), materia.getAnioMateria()});
        }
}
    private void cargarNoCursadas(){
        limpiarTabla();

        InscripcionData data = new InscripcionData();
        Alumno alu = new Alumno();
        alu = (Alumno) cbAlumnos.getSelectedItem();

        List<Materia> materias = new ArrayList<>();
        materias = data.obtenerMateriasNOCursadas(alu.getIdAlumno());
        for (Materia materia : materias) {
            modelo.addRow(new Object[]{materia.getIdMateria(), materia.getNombre(), materia.getAnioMateria()});
        }
    }
}


