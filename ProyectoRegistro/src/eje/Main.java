package eje;

import controlador.*;
import modelo.*;
import vista.*;
//tenemos una clase main en donde desde aqui
//vamos a ejecutar la aplicacion

public class Main {

    public static void main(String[] args) {
        //objeto de la clase estudiante DAO
        EstudianteDAO obj1 = new EstudianteDAO();
        //objeto de la interfaz de registro
        Interfaz obj2 = new Interfaz();
        //objeto de la clase logica
        RegistroE obj3 = new RegistroE(obj2, obj1);
        //agregamos en el obj1 el obj3 la cual va a corresponder a la
        //logica
        obj1.addObserver(obj3);
        //Decimos que sea visible la interfaz para poder
        //ingresar los datos

        obj2.setVisible(true);

        obj2.setLocationRelativeTo(null);

    }
}
