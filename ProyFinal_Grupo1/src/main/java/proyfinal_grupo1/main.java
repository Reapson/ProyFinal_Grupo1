/*
UNIVERSIDAD FIDELITAS
INGENIERIA EN SISTEMAS DE COMPUTACION
PROGRAMACION CLIENTE-SERVIDOR

PROYECTO FINAL
"Sistema para la administración de una tienda de reparaciones de equipos de cómputo"

Integrantes:
Reapson Anticona Corrales
Rossemary Carballo Anticona
Jeremias Carballo Chavarria
*/


package proyfinal_grupo1;

import proyfinal_grupo1.JFrame_Forms.*;

public class main {
    //Variable que almacenara si el usuario es administrador o no
    public static boolean Administrador;
    
    //Main
    public static void main(String[] args) {
        //Conexion a la BD
        Conexion con = new Conexion();
        con.conectarBD();
        
        //Se inicia la interfaz con el inicio de sesion
        Inicio_Sesion inicio = new Inicio_Sesion();
        inicio.setVisible(true);
    }
}
