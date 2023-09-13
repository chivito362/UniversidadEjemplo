
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
        List<Materia> materias=new ArrayList<>();
        String sql="SELECT inscripcion.idMateria,nombre,año FROM inscripcion,materia WHERE inscripcion.idMateria=materia.idMateria AND inscripcion.idAlumno=?";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
                Materia materia=new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("año"));
                materia.setEstado(true);
                materias.add(materia);
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Inscripciones y/o Materia " + ex.getMessage());
        }
        return materias;
    }
    
    public List<Materia> obtenerMateriasNOCursadas(int id){
        List<Materia> materias=new ArrayList<>();
        String sql="SELECT inscripcion.idMateria,nombre,año FROM inscripcion,materia WHERE NOT inscripcion.idMateria=materia.idMateria AND inscripcion.idAlumno=?";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
                Materia materia=new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("año"));
                materia.setEstado(true);
                materias.add(materia);
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Inscripciones y/o Materia " + ex.getMessage());
        }
        return materias;
    }//revisar sql
    
    public void borrarInscripcionMateriaAlumno(int idAlumno,int idMateria){
        String sql="DELETE FROM `inscripcion` WHERE idAlumno=? AND idMateria=?";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);
            int exito=ps.executeUpdate();
            if(exito==1){
                JOptionPane.showMessageDialog(null, " Se eliminó la Inscripcion.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Inscripcion");
        }
    }
    
    public void actualizarNota(int idAlumno,int idMateria,double nota){
        String sql="UPDATE incripcion SET nota=? WHERE idAlumno=? AND idMateria=?";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setDouble(1, nota);
            ps.setInt(2, idAlumno);
            ps.setInt(3, idMateria);
            int exito=ps.executeUpdate();
            
            if(exito==1){
                JOptionPane.showMessageDialog(null, "La nota se actualizo correctamente");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Inscripcion");
        }
        
    }
    
    public List<Alumno> obtenerAlumnosxMateria(int idMateria) {
        List<Alumno> alumnos = new ArrayList<>();
        String sql = "SELECT alumno.* FROM inscripcion,materia,alumno WHERE alumno.idAlumno=inscripcion.idAlumno AND inscripcion.idMateria=materia.idMateria AND idMateria=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMateria);
            ResultSet rs=ps.executeQuery();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Inscripcion");
        }
        return alumnos;
    }
}
