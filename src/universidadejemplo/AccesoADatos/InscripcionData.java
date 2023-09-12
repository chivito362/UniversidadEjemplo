
package universidadejemplo.AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import universidadejemplo.Entidades.*;


public class InscripcionData {
    private Connection con=null;
    private MateriaData matData;
    private AlumnoData aluData;

    public InscripcionData() {
        con=Conexion.getConexion();
    }
    
    public void GuardarInscripcion(Inscripcion insc){
        String sql="INSERT INTO inscripcion (nota,idAlumno,idMateria) VALUES (?,?,?)";
        try{
            PreparedStatement stm=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            stm.setDouble(1, insc.getIdInscripcion());
            stm.setInt(2, insc.getAlumno().getIdAlumno());
            stm.setInt(3, insc.getMateria().getIdMateria());
            stm.executeUpdate();
            ResultSet rs=stm.getGeneratedKeys();
            if(rs.next()){
                insc.setIdInscripcion(rs.getInt("idInscripcion"));
                JOptionPane.showMessageDialog(null, "Guardado con exito");
            }
            stm.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripciones" + ex.getMessage());
        }
    }
    
    public List<Inscripcion> obtenerInscripciones(){
        List<Inscripcion> inscripciones=new ArrayList<>();
        String sql="Select * From inscripcion";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
                Inscripcion in=new Inscripcion();
                in.setIdInscripcion(rs.getInt("idInscripcion"));
                in.setNota(rs.getDouble("nota"));
                in.setAlumno(aluData.buscarAlumno(rs.getInt("idAlumno")));
                in.setMateria(matData.buscarMateria(rs.getInt("idMateria")));
                inscripciones.add(in);
            }
            ps.close();
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Inscripciones " + ex.getMessage());
        }
        return inscripciones;
    }
    
    public List<Inscripcion> obtenerInscripcionesPorAlumno(int id){
        List<Inscripcion> inscripciones=new ArrayList<>();
        String sql="Select * From inscripcion where idAlumno=?";
        
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
                Inscripcion in=new Inscripcion();
                in.setIdInscripcion(rs.getInt("idInscripcion"));
                in.setNota(rs.getDouble("nota"));
                in.setAlumno(aluData.buscarAlumno(rs.getInt("idAlumno")));
                in.setMateria(matData.buscarMateria(rs.getInt("idMateria")));
                inscripciones.add(in);
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Inscripciones " + ex.getMessage());
        }
        return inscripciones;
    }
    
    public List<Materia> obtenerMateriasCursadas(int id){
        String sql="SELECT inscripcion.idMateria,nombre,año FROM inscripcion,materia WHERE inscripcion.idMateria=materia.idMateria AND inscripcion.idAlumno=?";
    }
    
    public List<Materia> obtenerMateriasNOCursadas(int id){
        
    }
    
    public void borrarInscripcionMateriaAlumno(int idAlumno,int idMateria){
        
    }
    
    public void actualizarNota(int idAlumno,int idMateria,double nota){
        
    }
    
    public List<Alumno> obtenerAlumnosxMateria(int idMateria){
        
    }
    
}
