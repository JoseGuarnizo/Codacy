package modelo;

/**
 *
 * @author renzo
 */
public class Estudiante {
 
    public String nombre;
    public String apellido;
    public String cedula;
    public String user;
    public String pass;

    public Estudiante() {
    }

    public Estudiante(String nombre, String apellido, String cedula, String user, String pass) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.user = user;
        this.pass = pass;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
    
}
