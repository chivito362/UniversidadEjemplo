/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadejemplo.Vistas;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;

public class MenuPrincipal extends javax.swing.JFrame {
    public boolean logged;
    Fondos fondo=new Fondos();
    public MenuPrincipal() {
        initComponents();
        fondo.setBounds(0, 0, 800, 600);
        Escritorio.add(fondo);
        logged=false;
        jMenu1.setEnabled(false);
        jMenu2.setEnabled(false);
        jMenu3.setEnabled(false);
        jMenu4.setEnabled(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Escritorio = new javax.swing.JDesktopPane();
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
        jMenu6 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 51, 255));

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 569, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 456, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(0, 153, 204));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/alumno28.png"))); // NOI18N
        jMenu1.setText("    Alumno");
        jMenu1.setAlignmentY(0.8F);
        jMenu1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu1.setPreferredSize(new java.awt.Dimension(91, 10));
        jMenu1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/alumno48.png"))); // NOI18N
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
        jMenu2.setText("    Materia");
        jMenu2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu2.setPreferredSize(new java.awt.Dimension(91, 80));
        jMenu2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnFmateria.setText("Formulario Materia");
        btnFmateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFmateriaActionPerformed(evt);
            }
        });
        jMenu2.add(btnFmateria);

        jMenuBar1.add(jMenu2);
        jMenu2.getAccessibleContext().setAccessibleName("    \n\n\nMateria");

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/administracion28.png"))); // NOI18N
        jMenu3.setText("Administración");
        jMenu3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu3.setInheritsPopupMenu(true);
        jMenu3.setPreferredSize(new java.awt.Dimension(91, 80));
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
        jMenu4.setText("   Consultas");
        jMenu4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu4.setPreferredSize(new java.awt.Dimension(91, 80));
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
        jMenu5.setPreferredSize(new java.awt.Dimension(91, 80));
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

        jMenu6.setBackground(new java.awt.Color(0, 204, 204));
        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/login_gov_icon_146024.png"))); // NOI18N
        jMenu6.setText("Login");
        jMenu6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu6.setPreferredSize(new java.awt.Dimension(91, 80));
        jMenu6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/login_gov_icon_146024 (1).png"))); // NOI18N
        jMenu6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jMenu6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu6MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
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

    private void jMenu6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu6MouseClicked
        if(jMenu6.getText().equalsIgnoreCase("Login")){
        View login =new View(this);
        crearVentanas(login);
        }else{
            logged=false;
            jMenu1.setEnabled(false);
            jMenu2.setEnabled(false);
            jMenu3.setEnabled(false);
            jMenu4.setEnabled(false);
            jMenu6.setText("Login");
            JInternalFrame[] ventanas=Escritorio.getAllFrames();
            for (JInternalFrame ventana : ventanas) {
                ventana.dispose();
            }
        }
    }//GEN-LAST:event_jMenu6MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JMenuItem btnAlumXMaterias;
    private javax.swing.JMenuItem btnFAlumno;
    private javax.swing.JMenuItem btnFmateria;
    private javax.swing.JMenuItem btnManejoInscrip;
    public javax.swing.JMenuItem btnManipulacionNotas;
    public javax.swing.JMenu jMenu1;
    public javax.swing.JMenu jMenu2;
    public javax.swing.JMenu jMenu3;
    public javax.swing.JMenu jMenu4;
    public javax.swing.JMenu jMenu5;
    public javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables

    private void crearVentanas(JInternalFrame fi){      
        Escritorio.removeAll();
        Escritorio.repaint();
        fi.setVisible(true);
        Escritorio.setSize(fi.getWidth(), fi.getHeight());
        Escritorio.add(fi);
        Escritorio.add(fondo);
        Escritorio.moveToFront(fi);
}
}
