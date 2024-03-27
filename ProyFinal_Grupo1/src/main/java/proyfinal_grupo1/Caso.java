//Clase Caso, en esta clase se manejaran todos los casos y el historial de estos casos
//Aqui se llevara seguimiento de los casos de soporte 

package proyfinal_grupo1;

public class Caso {
    //Variables
    private int numCaso;
    private int cedulaTecnico;
    private int cedulaCliente;
    private int idProductoReemplazar;
    private String descripcionProblema;
    private String descripcionSolucion;
    private String estadoCaso;
    
    //Constructor
    public Caso(int numCaso, int cedulaTecnico, int cedulaCliente, int idProductoReemplazar, String descripcionProblema, String descripcionSolucion, String estadoCaso) {
        this.numCaso = numCaso;
        this.cedulaTecnico = cedulaTecnico;
        this.cedulaCliente = cedulaCliente;
        this.idProductoReemplazar = idProductoReemplazar;
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

    public int getCedulaTecnico() {
        return cedulaTecnico;
    }

    public void setCedulaTecnico(int cedulaTecnico) {
        this.cedulaTecnico = cedulaTecnico;
    }

    public int getCedulaCliente() {
        return cedulaCliente;
    }

    public void setCedulaCliente(int cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }

    public int getIdProductoReemplazar() {
        return idProductoReemplazar;
    }

    public void setIdProductoReemplazar(int idProductoReemplazar) {
        this.idProductoReemplazar = idProductoReemplazar;
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
    public void actualizarBD(){
        //METODO PARA ACTUALIZAR LA BASE DE DATOS CON LA ESTRUCTURA DE DATOS DEL PROGRAMA
    }
    
    public void insertarCaso(){
        //METODO PARA INSERTAR UN CASO NUEVO A LA ESTRUCTURA DE DATOS
    }
    
    public void editarCaso(){
        //METODO PARA EDITAR UN REGISTRO DE LA ESTRUCTURA DE DATOS
    }
    
    public void eliminarCaso(){
        //METODO PARA ELIMINAR UN REGISTRO DE LA ESTRUCTURA DE DATOS
    }
}
