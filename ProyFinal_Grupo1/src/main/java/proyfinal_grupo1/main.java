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


import java.util.*;
import proyfinal_grupo1.JFrame_Forms.*;

public class main {

    //Creacion de la lista que va a almacenar los usuarios del sistema
    public static List<Usuario> usuarios = new ArrayList<>();
    
    //Main
    public static void main(String[] args) {
        //Creacion del usuario inicial
        Usuario usuarioInicialAdmin = new Usuario(true, "123", "josueanticona@gmail.com");
        Usuario usuarioInicialEmple = new Usuario(false, "abc", "rossemarycarballo@gmail.com");
        
        //Agregar usuario inicial a lista de usuarios
        usuarios.add(usuarioInicialAdmin);
        usuarios.add(usuarioInicialEmple);
        
        //Se inicia la interfaz con el inicio de sesion
        Inicio_Sesion inicio = new Inicio_Sesion();
        inicio.setVisible(true);
    }
}
