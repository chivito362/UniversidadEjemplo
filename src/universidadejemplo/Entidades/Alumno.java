/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadejemplo.Entidades;

import java.time.LocalDate;
import javax.swing.JInternalFrame;


/**
 *
 * @author Sebastian
 */
public class Alumno {
    private int idAlumno;
    private int dni;
    private String apellido;
    private String nombre;
    private LocalDate FechaNac;
    private boolean estado;

    public Alumno() {
    }

    public Alumno(int idAlumno, int dni, String apellido, String nombre, LocalDate FechaNac, boolean estado) {
        this.idAlumno = idAlumno;
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.FechaNac = FechaNac;
        this.estado = estado;
    }

    public Alumno(int dni, String apellido, String nombre, LocalDate FechaNac, boolean estado) {
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.FechaNac = FechaNac;
        this.estado = estado;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
    

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return FechaNac;
    }

    public void setFechaNacimiento(LocalDate gechaNac) {
        this.FechaNac = gechaNac;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return dni+", "+apellido+", "+nombre;
    }
    
    
//    private void crearVentanas(JInternalFrame fi){         
//        escritorio.removeAll();
//        escritorio.repaint();
//        fi.setVisible(true);
//        fi.setSize(escritorio.getWidth(), escritorio.getHeight());
//        escritorio.add(fi);
//        escritorio.moveToFront(fi);
//}

    
}
