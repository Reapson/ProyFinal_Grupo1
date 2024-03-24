//Clase Factura, en esta clase se encontrara la informacion del caso, del cliente
//el tecnico que brindo el soporte y finalmente el pago del servicio, repuestos, impuestos y monto final

package proyfinal_grupo1;

public class Factura {
    //Variables
    private int numFactura;
    private Caso caso;
    private double cobroServicio;
    private double cobroImpuestos;
    private double montoFinal;
    //FALTA IMPLEMENTAR FECHA PARA REPORTE DE FACTURACION MENSUAL (C)
    
    //Constructor
    public Factura(int numFactura, Caso caso, double cobroServicio, double cobroImpuestos, double montoFinal) {
        this.numFactura = numFactura;
        this.caso = caso;
        this.cobroServicio = cobroServicio;
        this.cobroImpuestos = cobroImpuestos;
        this.montoFinal = montoFinal;
    }
    
    //Getters y Setters
    public int getNumFactura() {
        return numFactura;
    }

    public void setNumFactura(int numFactura) {
        this.numFactura = numFactura;
    }

    public Caso getCaso() {
        return caso;
    }

    public void setCaso(Caso caso) {
        this.caso = caso;
    }

    public double getCobroServicio() {
        return cobroServicio;
    }

    public void setCobroServicio(double cobroServicio) {
        this.cobroServicio = cobroServicio;
    }

    public double getCobroImpuestos() {
        return cobroImpuestos;
    }

    public void setCobroImpuestos(double cobroImpuestos) {
        this.cobroImpuestos = cobroImpuestos;
    }

    public double getMontoFinal() {
        return montoFinal;
    }

    public void setMontoFinal(double montoFinal) {
        this.montoFinal = montoFinal;
    }
    
    //Metodos de la clase Factura
    public void actualizarBD(){
        //METODO PARA ACTUALIZAR LA BASE DE DATOS CON LA ESTRUCTURA DE DATOS DEL PROGRAMA
    }
    
    public void insertarFactura(){
        //METODO PARA INSERTAR UNA FACTURA NUEVA A LA ESTRUCTURA DE DATOS
    }
    
    public void editarFactura(){
        //METODO PARA EDITAR UN REGISTRO DE LA ESTRUCTURA DE DATOS
    }
    
    public void eliminarFactura(){
        //METODO PARA ELIMINAR UN REGISTRO DE LA ESTRUCTURA DE DATOS
    }
}
