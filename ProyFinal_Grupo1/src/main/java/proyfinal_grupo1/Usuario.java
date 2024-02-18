//Clase Usuario funciona para la administracion de usuarios la cual va a ser posible
//acceder unicamente si se tiene permisos de administrador
package proyfinal_grupo1;

public class Usuario extends Persona{
    //Atributos para usuarios
    private boolean administrador;
    private String password;

    //Constructor de usuario
    public Usuario(boolean administrador, String password, String correo) {
        super(correo);
        this.administrador = administrador;
        this.password = password;
    }

    //Getters y Setters
    public boolean isAdministrador() {
        return administrador;
    }

    public void setAdministrador(boolean administrador) {
        this.administrador = administrador;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    //Metodos de la clase Usuario
    @Override
    public void insertarPersona(){
        //METODO PARA INSERTAR UN USUARIO NUEVA A LA ESTRUCTURA DE DATOS
    }
    
    @Override
    public void leerPersonas(){
        //METODO PARA CONSULTAR LA ESTRUCTURA DE DATOS
    }
    
    @Override
    public void editarPersona(){
        //METODO PARA EDITAR UN REGISTRO DE LA ESTRUCTURA DE DATOS
    }
    
    @Override
    public void eliminarPersona(){
        //METODO PARA ELIMINAR UN REGISTRO DE LA ESTRUCTURA DE DATOS
    }
    
    @Override
    public void actualizarBD(){
        //METODO PARA ACTUALIZAR LA BASE DE DATOS CON LA ESTRUCTURA DE DATOS DEL PROGRAMA
    }
}
