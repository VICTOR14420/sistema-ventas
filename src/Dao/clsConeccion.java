

package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class clsConeccion {
    //variable de coneccion
    
    Connection cn;
    public String driver="com.mysql.jdbc.Driver";
    public String url="jdbc:mysql://localhost:3306/ventas_jp";
    public String usuario = "root";
    public String clave = "";
    
    public Connection MyConectar(){
        try {
            Class.forName(driver);
            cn=DriverManager.getConnection(url,usuario,clave);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error en: " + e);
        }
        return cn;
    }
            
            
    
}
