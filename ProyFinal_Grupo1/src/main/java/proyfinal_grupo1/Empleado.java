//Clase Empleado, va a ser la clase padre de Tecnico y la clase hija de Persona
package proyfinal_grupo1;


public class Empleado extends Persona{
    //Variables
    private double salarioMensual;
    private double vacacionesPendientes;

    //Constructor
    public Empleado(double salarioMensual, double vacacionesPendientes, int numeroCedula, String nombre, String primerApellido, String provincia, String canton, String correo, double numTelefono) {
        super(numeroCedula, nombre, primerApellido, provincia, canton, correo, numTelefono);
        this.salarioMensual = salarioMensual;
        this.vacacionesPendientes = vacacionesPendientes;
    }

    //Getters y Setters
    public double getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(double salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    public double getVacacionesPendientes() {
        return vacacionesPendientes;
    }

    public void setVacacionesPendientes(double vacacionesPendientes) {
        this.vacacionesPendientes = vacacionesPendientes;
    }
    
    //Metodos de la clase Empleado
    @Override
    public void actualizarBD(){
        //METODO PARA ACTUALIZAR LA BASE DE DATOS CON LA ESTRUCTURA DE DATOS DEL PROGRAMA
    }
    
    @Override
    public void insertarPersona(){
        //METODO PARA INSERTAR UNA PERSONA NUEVA A LA ESTRUCTURA DE DATOS
    }
    
    @Override
    public void editarPersona(){
        //METODO PARA EDITAR UN REGISTRO DE LA ESTRUCTURA DE DATOS
    }
    
    @Override
    public void eliminarPersona(){
        //METODO PARA ELIMINAR UN REGISTRO DE LA ESTRUCTURA DE DATOS
    }
}
