package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JOptionPane;
import modelo.*;
import vista.*;
//clase controlador donde se realiza toda la logica
//especificada

public class RegistroE implements ActionListener, Observer {
//declaramos objetos de la interfaz y del modelo de datos

    Interfaz obj1 = new Interfaz();
    EstudianteDAO obj2 = new EstudianteDAO();

    public RegistroE(Interfaz obj1, EstudianteDAO obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
        this.obj1.btnguardar.addActionListener(this);
    }

    public void LimpiarCampos() {
        obj1.txtnombre.setText(null);
        obj1.txtapellido.setText(null);
        obj1.txtcedula.setText(null);
        obj1.txtuser.setText(null);
        obj1.jpass.setText(null);

    }

//metodo accionar el cual me va decir que al momento
// de pulsar el boton guardar me va a conseguir todas las cajas
    //de texto es decir todo lo que el estudiante ingreso
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == obj1.btnguardar) {

            String nombre = obj1.txtnombre.getText();
            String apellido = obj1.txtapellido.getText();
            String cedula = obj1.txtcedula.getText();
            String user = obj1.txtuser.getText();
            String pass = obj1.jpass.getText();
//declaro una variable rtaregistro esta variable va a obtener los campos 
//de los datos personale del estudiante y dentro
//de esta variable con el metodo que tiene el modelo solo llamamos el metodo
//e incorporamos los datos ingresado por el estudiante
            if ((obj1.txtnombre.getText().equals(""))
                    || (obj1.txtapellido.getText().equals(""))
                    || (obj1.txtcedula.getText().equals(""))
                    || (obj1.txtuser.getText().equals(""))
                    || (obj1.jpass.getText().equals(""))) {
                javax.swing.JOptionPane.showMessageDialog(null, "Debe llenar los campos \n",
                        "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);

            } else {
                String rptaregistro = obj2.registrarEstudiante(nombre,
                        apellido, cedula, user, pass);
                LimpiarCampos();
                if (rptaregistro != null) {
                    JOptionPane.showMessageDialog(null, rptaregistro);

                } else {
                    JOptionPane.showMessageDialog(null, "Registro Erroneo");

                }
            }
        }

    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Actualizado" + o + arg);
    }

}
