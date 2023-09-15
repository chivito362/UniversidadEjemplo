
package universidadejemplo.AccesoADatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Conexion {
    private  static final String url = "jdbc:mariadb://localhost:3306/";
    private static final String db = "universidadulp";
    private static final String usuario = "root";
    private static final String contrasenia= "";
    private static Connection conexion;

    private Conexion() {
    } 

        
        public static Connection getConexion () {
            
            if (conexion == null) {
                
                try {
                    Class.forName("org.mariadb.jdbc.Driver");
                    
                    //establecer la conexion
                    
                    conexion = DriverManager.getConnection(url+db, usuario, contrasenia);
                            
                            } catch (ClassNotFoundException ex) {
                    JOptionPane.showMessageDialog(null, "Error de driver");
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Error de conexion");
                }
                
            }
        return conexion;
            
    }
}
    

    
    
    

