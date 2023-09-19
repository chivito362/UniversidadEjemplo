
package universidadejemplo.AccesoADatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Conexion {
    private  static final String url = "jdbc:mariadb://localhost:3306/";
    private static final String usuario = "root";
    private static final String contrasenia= "";
    private static Connection conexion;

    private Conexion() {
    } 

        
        public static Connection getConexion (String db) {
            
           
                
                try {
                    Class.forName("org.mariadb.jdbc.Driver");
                    
                    //establecer la conexion
                    
                    return DriverManager.getConnection(url+db, usuario, contrasenia);
                            
                            } catch (ClassNotFoundException ex) {
                    JOptionPane.showMessageDialog(null, "Error de driver");
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Error de conexion");
                }
                
            
        return null;
            
    }
        
        public static int comprobar_acceso(String usuario){
        try {
            Connection conn=Conexion.getConexion("ulplogin");
            
            String sql="SELECT acceso FROM usuarios where usuario=?";
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setString(1, usuario);
            ResultSet resultado=ps.executeQuery();
            
            while(resultado.next()){
                return resultado.getInt("acceso");
            }
            } catch (SQLException ex) {
            ex.fillInStackTrace();
            return -1;
        }
    return -1;
}
    public static boolean comprobar_datos(String usuario,String pw){
        try {
            Connection conn=Conexion.getConexion("ulplogin");
            
            String sql="SELECT usuario,contrasenia,estado FROM usuarios";
            PreparedStatement ps=conn.prepareStatement(sql);
            ResultSet resultado=ps.executeQuery();
            
            while(resultado.next()){
                if(resultado.getString("usuario").equals(usuario)&& resultado.getInt("estado")==1){
                    if(resultado.getString("contrasenia").equals(pw)){
                        JOptionPane.showMessageDialog(null, "Ingreso Exitoso");
                        return true;
                    }else{
                        JOptionPane.showMessageDialog(null, "Contraseña incorrecta");
                        return false;
                    }
                }
            }
            
        } catch (SQLException ex) {
            ex.fillInStackTrace();
            return false;
        }
        JOptionPane.showMessageDialog(null, "El usuario no se encuentra Registrdo");
        return false;
    }
}
    

    
    
    

