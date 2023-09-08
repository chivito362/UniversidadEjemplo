/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadejemplo.Entidades;

import java.time.LocalDate;

/**
 *
 * @author Sebastian
 */
public class Alumno {
    private int idAlumno;
    private String apellido;
    private String nombre;
    private LocalDate gechaNac;
    private boolean estado;

    public Alumno() {
    }

    public Alumno(int idAlumno, String apellido, String nombre, LocalDate gechaNac, boolean estado) {
        this.idAlumno = idAlumno;
        this.apellido = apellido;
        this.nombre = nombre;
        this.gechaNac = gechaNac;
        this.estado = estado;
    }

    public Alumno(String apellido, String nombre, LocalDate gechaNac, boolean estado) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.gechaNac = gechaNac;
        this.estado = estado;
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

    public LocalDate getGechaNac() {
        return gechaNac;
    }

    public void setGechaNac(LocalDate gechaNac) {
        this.gechaNac = gechaNac;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
}
