//Clase ProductoRepuesto donde se almacenara el inventario de la empresa de las
//cosas que dispone para reparaciones o limpiezas de equipo

package proyfinal_grupo1;

public class ProductoRepuesto {
    //Variables
    private int idObjeto;
    private String nombreProducto;
    private String descripcionProducto;
    private String tipoObjeto;
    private double precioCompra;
    private double precioVenta;
    private int cantidad;
    
    //Constructor
    public ProductoRepuesto(int idObjeto, String nombreProducto, String descripcionProducto, String tipoObjeto, double precioCompra, double precioVenta, int cantidad) {
        this.idObjeto = idObjeto;
        this.nombreProducto = nombreProducto;
        this.descripcionProducto = descripcionProducto;
        this.tipoObjeto = tipoObjeto;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.cantidad = cantidad;
    }
    
    //Getters y Setters
    public int getIdObjeto() {
        return idObjeto;
    }

    public void setIdObjeto(int idObjeto) {
        this.idObjeto = idObjeto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public String getTipoObjeto() {
        return tipoObjeto;
    }

    public void setTipoObjeto(String tipoObjeto) {
        this.tipoObjeto = tipoObjeto;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    //Metodos de la clase ProductoRepuesto
    public void insertarObjeto(){
        //METODO PARA INSERTAR UN OBJETO NUEVO A LA ESTRUCTURA DE DATOS
    }

    public void leerObjetos(){
        //METODO PARA CONSULTAR LA ESTRUCTURA DE DATOS
    }

    public void editarObjeto(){
        //METODO PARA EDITAR UN REGISTRO DE LA ESTRUCTURA DE DATOS
    }

    public void eliminarObjeto(){
        //METODO PARA ELIMINAR UN REGISTRO DE LA ESTRUCTURA DE DATOS
    }
    
    public void actualizarBD(){
        //METODO PARA ACTUALIZAR LA BASE DE DATOS CON LA ESTRUCTURA DE DATOS DEL PROGRAMA
    }
}
