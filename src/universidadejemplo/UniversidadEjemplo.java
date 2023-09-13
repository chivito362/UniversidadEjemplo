
package universidadejemplo;

import universidadejemplo.AccesoADatos.Conexion;
import universidadejemplo.Vistas.AgregarAlumnos;


public class UniversidadEjemplo {

 
    public static void main(String[] args) {
        AgregarAlumnos ventana=new AgregarAlumnos();
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
    }
    
}
