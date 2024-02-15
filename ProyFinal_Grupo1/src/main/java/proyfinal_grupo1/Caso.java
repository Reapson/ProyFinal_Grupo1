//Clase Caso, en esta clase se manejaran todos los casos y el historial de estos casos
//Aqui se llevara seguimiento de los casos de soporte

package proyfinal_grupo1;

public class Caso {
    //Variables
    private int numCaso;
    private Tecnico tecnicoAsignado;
    private Cliente clienteAsignado;
    private ProductoRepuesto parteReemplazada;
    private String descripcionProblema;
    private String descripcionSolucion;
    private String estadoCaso;
    
    //Constructor
    public Caso(int numCaso, Tecnico tecnicoAsignado, Cliente clienteAsignado, ProductoRepuesto parteReemplazada, String descripcionProblema, String descripcionSolucion, String estadoCaso) {
        this.numCaso = numCaso;
        this.tecnicoAsignado = tecnicoAsignado;
        this.clienteAsignado = clienteAsignado;
        this.parteReemplazada = parteReemplazada;
        this.descripcionProblema = descripcionProblema;
        this.descripcionSolucion = descripcionSolucion;
        this.estadoCaso = estadoCaso;
    }
    
    //Getters y Setters
    public int getNumCaso() {
        return numCaso;
    }

    public void setNumCaso(int numCaso) {
        this.numCaso = numCaso;
    }

    public Tecnico getTecnicoAsignado() {
        return tecnicoAsignado;
    }

    public void setTecnicoAsignado(Tecnico tecnicoAsignado) {
        this.tecnicoAsignado = tecnicoAsignado;
    }

    public Cliente getClienteAsignado() {
        return clienteAsignado;
    }

    public void setClienteAsignado(Cliente clienteAsignado) {
        this.clienteAsignado = clienteAsignado;
    }

    public ProductoRepuesto getParteReemplazada() {
        return parteReemplazada;
    }

    public void setParteReemplazada(ProductoRepuesto parteReemplazada) {
        this.parteReemplazada = parteReemplazada;
    }

    public String getDescripcionProblema() {
        return descripcionProblema;
    }

    public void setDescripcionProblema(String descripcionProblema) {
        this.descripcionProblema = descripcionProblema;
    }

    public String getDescripcionSolucion() {
        return descripcionSolucion;
    }

    public void setDescripcionSolucion(String descripcionSolucion) {
        this.descripcionSolucion = descripcionSolucion;
    }

    public String getEstadoCaso() {
        return estadoCaso;
    }

    public void setEstadoCaso(String estadoCaso) {
        this.estadoCaso = estadoCaso;
    }
    
    //Metodos de la clase Caso
    public void insertarCaso(){
        //METODO PARA INSERTAR UN CASO NUEVO A LA ESTRUCTURA DE DATOS
    }
    
    public void leerCaso(){
        //METODO PARA CONSULTAR LA ESTRUCTURA DE DATOS
    }
    
    public void editarCaso(){
        //METODO PARA EDITAR UN REGISTRO DE LA ESTRUCTURA DE DATOS
    }
    
    public void eliminarCaso(){
        //METODO PARA ELIMINAR UN REGISTRO DE LA ESTRUCTURA DE DATOS
    }
    
    public void actualizarBD(){
        //METODO PARA ACTUALIZAR LA BASE DE DATOS CON LA ESTRUCTURA DE DATOS DEL PROGRAMA
    }
}
