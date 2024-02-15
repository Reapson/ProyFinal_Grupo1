//Clase Tecnico, clase hija de Empleado. Estos seran los tecnicos registrados 
//en la empresa que dan soporte a las computadora

package proyfinal_grupo1;

public class Tecnico extends Empleado{
    //Variables
    private String areaEspecializacion;
    private String marcaEspecializacion;
    
    //Constructor
    public Tecnico(String areaEspecializacion, String marcaEspecializacion, double salarioMensual, double vacacionesPendientes, int numeroCedula, String nombre, String primerApellido, String provincia, String canton, String correo, double numTelefono) {
        super(salarioMensual, vacacionesPendientes, numeroCedula, nombre, primerApellido, provincia, canton, correo, numTelefono);
        this.areaEspecializacion = areaEspecializacion;
        this.marcaEspecializacion = marcaEspecializacion;
    }
    
    //Getters y Setters
    public String getAreaEspecializacion() {
        return areaEspecializacion;
    }

    public void setAreaEspecializacion(String areaEspecializacion) {
        this.areaEspecializacion = areaEspecializacion;
    }

    public String getMarcaEspecializacion() {
        return marcaEspecializacion;
    }

    public void setMarcaEspecializacion(String marcaEspecializacion) {
        this.marcaEspecializacion = marcaEspecializacion;
    }
    
    //Metodos de la clase Tecnico
    @Override
    public void insertarPersona(){
        //METODO PARA INSERTAR UNA PERSONA NUEVA A LA ESTRUCTURA DE DATOS
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
