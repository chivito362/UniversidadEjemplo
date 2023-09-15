package universidadejemplo.Vistas;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import universidadejemplo.AccesoADatos.AlumnoData;
import universidadejemplo.AccesoADatos.InscripcionData;
import universidadejemplo.Entidades.Alumno;
import universidadejemplo.Entidades.Materia;


public class CargaDeNotas extends javax.swing.JInternalFrame {
    
    DefaultTableModel model=new DefaultTableModel(){
        
        boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int row, int column) {
                return canEdit [column];
            }
        
    };

    public CargaDeNotas() {
        initComponents();
        cargarCombo();
        CargarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        btnGuardar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        cbAlumnos = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Carga de Notas");

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        jLabel1.setText("Carga de Notas");

        jLabel2.setText("Seleccione un Alumno");

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(Tabla);

        btnGuardar.setText("Guardar");

        btnSalir.setText("Salir");

        cbAlumnos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbAlumnosItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(cbAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(201, 201, 201)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(btnGuardar)
                                    .addGap(147, 147, 147)
                                    .addComponent(btnSalir))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGap(31, 31, 31)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 36, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnSalir))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbAlumnosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbAlumnosItemStateChanged
        limpiarTabla();
        Alumno alu=(Alumno) cbAlumnos.getSelectedItem();
        InscripcionData data=new InscripcionData();
        List<Materia> materias=data.obtenerMateriasCursadas(alu.getIdAlumno());
        
        for (Materia materia : materias) {
            Object[] obj={materia.getIdMateria(),materia.getNombre(),materia.getNota()};
            model.addRow(obj);
            Tabla.setModel(model);
       }
    }//GEN-LAST:event_cbAlumnosItemStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<Alumno> cbAlumnos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

    private void cargarCombo(){
        AlumnoData aludata=new AlumnoData();
        List<Alumno> alumnos=aludata.listarAlumnos();
        for (Alumno alumno : alumnos) {
            cbAlumnos.addItem(alumno);
        }
    }
    
    private void CargarTabla(){
        limpiarTabla();
        String[] titles={"Codigo","Materia","Nota"};
        model.setColumnIdentifiers(titles);
        
        Tabla.setModel(model);
    }
    private void limpiarTabla(){
        for (int i = model.getRowCount()-1; i >= 0; i--) {
            model.removeRow(i);
        }
    }
}
