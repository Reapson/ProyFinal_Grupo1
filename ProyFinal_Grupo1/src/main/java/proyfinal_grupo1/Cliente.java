//Clase Cliente, va a ser la clase hija de Persona. Aqui se almacenara 
//la informacion de los clientes de la empresa

package proyfinal_grupo1;

public class Cliente extends Persona{
    //Variables
    private boolean descuentoEmpresarial;
    private boolean descuentoTerceraEdad;
    private String sexo;
    
    //Constructor
    public Cliente(boolean descuentoEmpresarial, boolean descuentoTerceraEdad, String sexo, int numeroCedula, String nombre, String primerApellido, String provincia, String canton, String correo, double numTelefono) {
        super(numeroCedula, nombre, primerApellido, provincia, canton, correo, numTelefono);
        this.descuentoEmpresarial = descuentoEmpresarial;
        this.descuentoTerceraEdad = descuentoTerceraEdad;
        this.sexo = sexo;
    }

    //Getters and Setters
    public boolean isDescuentoEmpresarial() {
        return descuentoEmpresarial;
    }

    public void setDescuentoEmpresarial(boolean descuentoEmpresarial) {
        this.descuentoEmpresarial = descuentoEmpresarial;
    }

    public boolean isDescuentoTerceraEdad() {
        return descuentoTerceraEdad;
    }

    public void setDescuentoTerceraEdad(boolean descuentoTerceraEdad) {
        this.descuentoTerceraEdad = descuentoTerceraEdad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    //Metodos de la clase Cliente
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
