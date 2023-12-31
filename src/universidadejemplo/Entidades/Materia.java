/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadejemplo.Entidades;

/**
 *
 * @author Sebastian
 */
public class Materia {
    private int idMateria;
    private String nombre;
    private int anioMateria,nota;
    private boolean estado;

    public Materia() {
    }

    public Materia(int idMateria) {
        this.idMateria = idMateria;
    }
    
    
    
    public Materia(String nombre, int anioMateria, boolean estado) {
        this.nombre = nombre;
        this.anioMateria = anioMateria;
        this.estado = estado;
    }

    public Materia(int idMateria, String nombre, int anioMateria, int nota, boolean estado) {
        this.idMateria = idMateria;
        this.nombre = nombre;
        this.anioMateria = anioMateria;
        this.nota = nota;
        this.estado = estado;
    }

    public Materia(String nombre, int anioMateria, int nota, boolean estado) {
        this.nombre = nombre;
        this.anioMateria = anioMateria;
        this.nota = nota;
        this.estado = estado;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnioMateria() {
        return anioMateria;
    }

    public void setAnioMateria(int anioMateria) {
        this.anioMateria = anioMateria;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return idMateria + ", " + nombre;
    }
    
    
}
