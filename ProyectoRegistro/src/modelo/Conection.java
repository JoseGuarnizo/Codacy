package modelo;

import java.sql.*;
//Clase conexion donde se va a realizar la conexion con la base
//de datos MSYQL

public class Conection {

    public Conection() {

    }
    Connection con;

    public Connection GetConection() {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/matricula", "root", "");

        } catch (SQLException ex) {

        } catch (Exception e) {

        }
        return con;
    }

}
