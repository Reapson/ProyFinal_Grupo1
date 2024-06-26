//Clase Cliente, va a ser la clase hija de Persona. Aqui se almacenara 
//la informacion de los clientes de la empresa

package proyfinal_grupo1;

public class Cliente extends Persona{
    //Variables
    private String descuentoEmpresarial;
    private String descuentoTerceraEdad;
    private String sexo;
    
    //Constructor
    public Cliente(String descuentoEmpresarial, String descuentoTerceraEdad, String sexo, int numeroCedula, String nombre, String primerApellido, String provincia, String canton, String correo, double numTelefono) {
        super(numeroCedula, nombre, primerApellido, provincia, canton, correo, numTelefono);
        this.descuentoEmpresarial = descuentoEmpresarial;
        this.descuentoTerceraEdad = descuentoTerceraEdad;
        this.sexo = sexo;
    }

    //Getters and Setters
    public String getDescuentoEmpresarial() {
        return descuentoEmpresarial;
    }

    public void setDescuentoEmpresarial(String descuentoEmpresarial) {
        this.descuentoEmpresarial = descuentoEmpresarial;
    }

    public String getDescuentoTerceraEdad() {
        return descuentoTerceraEdad;
    }

    public void setDescuentoTerceraEdad(String descuentoTerceraEdad) {
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
