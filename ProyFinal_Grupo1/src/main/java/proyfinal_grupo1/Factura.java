//Clase Factura, en esta clase se encontrara la informacion del caso, del cliente
//el tecnico que brindo el soporte y finalmente el pago del servicio, repuestos, impuestos y monto final

package proyfinal_grupo1;

import java.sql.Date;

public class Factura {
    //Variables
    private int numFactura;
    private int caso;
    private double cobroServicio;
    private double cobroImpuestos;
    private double montoFinal;
    private String ano;
    private String mes;
    private String dia;
    
    //Constructor
    public Factura(int numFactura, int caso, double cobroServicio, double cobroImpuestos, double montoFinal, String ano, String mes, String dia) {
        this.numFactura = numFactura;
        this.caso = caso;
        this.cobroServicio = cobroServicio;
        this.cobroImpuestos = cobroImpuestos;
        this.montoFinal = montoFinal;
        this.ano = ano;
        this.mes = mes;
        this.dia = dia;
    }
    
    //Getters y Setters
    public int getNumFactura() {
        return numFactura;
    }

    public void setNumFactura(int numFactura) {
        this.numFactura = numFactura;
    }

    public int getCaso() {
        return caso;
    }

    public void setCaso(int caso) {
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

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
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
