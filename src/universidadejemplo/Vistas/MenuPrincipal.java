/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadejemplo.Vistas;

import javax.swing.JInternalFrame;

public class MenuPrincipal extends javax.swing.JFrame {
   

    public MenuPrincipal() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        btnFAlumno = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        btnFmateria = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        btnManejoInscrip = new javax.swing.JMenuItem();
        btnManipulacionNotas = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        btnAlumXMaterias = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 547, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 484, Short.MAX_VALUE)
        );

        jMenu1.setText("Alumno");

        btnFAlumno.setText("Formulario Alumno ");
        btnFAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFAlumnoActionPerformed(evt);
            }
        });
        jMenu1.add(btnFAlumno);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Materia");

        btnFmateria.setText("Formulario Materia");
        btnFmateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFmateriaActionPerformed(evt);
            }
        });
        jMenu2.add(btnFmateria);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Administración");

        btnManejoInscrip.setText("Manejo de Inscripciones");
        btnManejoInscrip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManejoInscripActionPerformed(evt);
            }
        });
        jMenu3.add(btnManejoInscrip);

        btnManipulacionNotas.setText("Manipulación de Notas");
        btnManipulacionNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManipulacionNotasActionPerformed(evt);
            }
        });
        jMenu3.add(btnManipulacionNotas);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Consultas");

        btnAlumXMaterias.setText("Alumnos por Materia");
        jMenu4.add(btnAlumXMaterias);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Salir");
        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnManejoInscripActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManejoInscripActionPerformed
   FormularioInscripciones fi = new FormularioInscripciones();
        crearVentanas(fi);
    }//GEN-LAST:event_btnManejoInscripActionPerformed

    private void btnFmateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFmateriaActionPerformed
       // AgregarMaterias fi=new AgregarMaterias();
       // crearVentanas(fi);
    }//GEN-LAST:event_btnFmateriaActionPerformed

    private void btnFAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFAlumnoActionPerformed
        AgregarAlumnos fi=new AgregarAlumnos();
        crearVentanas(fi);
    }//GEN-LAST:event_btnFAlumnoActionPerformed

    private void btnManipulacionNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManipulacionNotasActionPerformed
        CargaDeNotas fi=new CargaDeNotas();
        crearVentanas(fi);
    }//GEN-LAST:event_btnManipulacionNotasActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnAlumXMaterias;
    private javax.swing.JMenuItem btnFAlumno;
    private javax.swing.JMenuItem btnFmateria;
    private javax.swing.JMenuItem btnManejoInscrip;
    private javax.swing.JMenuItem btnManipulacionNotas;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables

    private void crearVentanas(JInternalFrame fi){         
        escritorio.removeAll();
        escritorio.repaint();
        fi.setVisible(true);
        fi.setSize(escritorio.getWidth(), escritorio.getHeight());
        escritorio.add(fi);
        escritorio.moveToFront(fi);
}
}
