package modelo;

import java.sql.*;
import java.util.Observable;

public class EstudianteDAO extends Observable {
//declara atributos que nos van a servir eb esta clase

    public Conection conexion;
    public String rptaregistro;

    public EstudianteDAO() {
        conexion = new Conection();
        rptaregistro = "Registro Exitoso";
    }
//Metodo de insertar el estudiante, en este caso
//estamos declarando una sentencia de BD para el cual
//le van a llegar los parametros de sus datos personales
//los cuales se van insertar en la BD

    public String registrarEstudiante(String nombre, String apellido, String cedula, String user, String pass) {

        try {
            Connection accesoDB = conexion.GetConection();
            PreparedStatement pps = accesoDB.prepareStatement("INSERT INTO estudiante (nombre, apellido, cedula, usuario, pass) VALUES (?,?,?,?,?)");
            pps.setString(1, nombre);
            pps.setString(2, apellido);
            pps.setString(3, cedula);
            pps.setString(4, user);
            pps.setString(5, pass);

            int num = pps.executeUpdate();
            if (num > 0) {
                setChanged();
                notifyObservers(rptaregistro);
            }

        } catch (Exception e) {

        }
        return rptaregistro;

    }
}
