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
            .addGap(0, 404, Short.MAX_VALUE)
        );

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/alumno28.png"))); // NOI18N
        jMenu1.setText("Alumno");
        jMenu1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu1.setPreferredSize(new java.awt.Dimension(80, 80));
        jMenu1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnFAlumno.setText("Formulario Alumno ");
        btnFAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFAlumnoActionPerformed(evt);
            }
        });
        jMenu1.add(btnFAlumno);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/materia28.png"))); // NOI18N
        jMenu2.setText("Materia");
        jMenu2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu2.setPreferredSize(new java.awt.Dimension(49, 80));
        jMenu2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnFmateria.setText("Formulario Materia");
        btnFmateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFmateriaActionPerformed(evt);
            }
        });
        jMenu2.add(btnFmateria);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/administracion28.png"))); // NOI18N
        jMenu3.setText("Administración");
        jMenu3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

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

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/consulta28.png"))); // NOI18N
        jMenu4.setText("Consultas");
        jMenu4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu4.setPreferredSize(new java.awt.Dimension(66, 99));
        jMenu4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/consulta28.png"))); // NOI18N
        jMenu4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/consulta48.png"))); // NOI18N
        jMenu4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnAlumXMaterias.setText("Alumnos por Materia");
        btnAlumXMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlumXMateriasActionPerformed(evt);
            }
        });
        jMenu4.add(btnAlumXMaterias);

        jMenuBar1.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salida 28.png"))); // NOI18N
        jMenu5.setText("Salir");
        jMenu5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenu5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu5.setPreferredSize(new java.awt.Dimension(66, 99));
        jMenu5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salida 28.png"))); // NOI18N
        jMenu5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salida48.png"))); // NOI18N
        jMenu5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu5);
        jMenu5.getAccessibleContext().setAccessibleDescription("");

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
       AgregarMateria fi=new AgregarMateria();
            crearVentanas(fi);
    }//GEN-LAST:event_btnFmateriaActionPerformed

    private void btnFAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFAlumnoActionPerformed
        AgregarAlumnos fi=new AgregarAlumnos();
        crearVentanas(fi);
    }//GEN-LAST:event_btnFAlumnoActionPerformed

    private void btnManipulacionNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManipulacionNotasActionPerformed
        CargaDeNotas fi=new CargaDeNotas();
        crearVentanas(fi);
    }//GEN-LAST:event_btnManipulacionNotasActionPerformed
    private void btnAlumXMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlumXMateriasActionPerformed
        ConsultasPorAlumno fi=new ConsultasPorAlumno();
        crearVentanas(fi);
    }//GEN-LAST:event_btnAlumXMateriasActionPerformed

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
     System.exit(0);
    }//GEN-LAST:event_jMenu5MouseClicked

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
        escritorio.setSize(fi.getWidth(), fi.getHeight());
        escritorio.add(fi);
        escritorio.moveToFront(fi);
}
}
