//Clase Proveedor, clase hija de Persona. Aqui se manejara la informacion de los
//proveedores y de la empresa en la que trabajan

package proyfinal_grupo1;

public class Proveedor extends Persona{
    //Variables
    private String empresa;
    private String productoRepuestoQueProvee;
    
    //Constructor
    public Proveedor(String empresa, String productoRepuestoQueProvee, int numeroCedula, String nombre, String primerApellido, String provincia, String canton, String correo, double numTelefono) {
        super(numeroCedula, nombre, primerApellido, provincia, canton, correo, numTelefono);
        this.empresa = empresa;
        this.productoRepuestoQueProvee = productoRepuestoQueProvee;
    }
    
    //Getters y Setters
    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getProductoRepuestoQueProvee() {
        return productoRepuestoQueProvee;
    }

    public void setProductoRepuestoQueProvee(String productoRepuestoQueProvee) {
        this.productoRepuestoQueProvee = productoRepuestoQueProvee;
    }
    
    //Metodos de la clase Proveedor
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
