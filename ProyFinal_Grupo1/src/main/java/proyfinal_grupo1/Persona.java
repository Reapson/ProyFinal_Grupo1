//Clase Abstracta Persona, va a ser la clase padre de Empleado, Cliente y Proveedor

package proyfinal_grupo1;

public abstract class Persona {
    //Variables
    private int numeroCedula;
    private String nombre;
    private String primerApellido;
    private String provincia;
    private String canton;
    private String correo;
    private double numTelefono;

    //Constructores
    public Persona(int numeroCedula, String nombre, String primerApellido, String provincia, String canton, String correo, double numTelefono) {
        this.numeroCedula = numeroCedula;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.provincia = provincia;
        this.canton = canton;
        this.correo = correo;
        this.numTelefono = numTelefono;
    }
    
    public Persona(String correo) {
        this.correo = correo;
    }

    //Getters y Setters
    public int getNumeroCedula() {
        return numeroCedula;
    }

    public void setNumeroCedula(int numeroCedula) {
        this.numeroCedula = numeroCedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCanton() {
        return canton;
    }

    public void setCanton(String canton) {
        this.canton = canton;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public double getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(double numTelefono) {
        this.numTelefono = numTelefono;
    }
    
    //Metodos abstractos de la clase Persona
    public abstract void insertarPersona();
    public abstract void leerPersonas();
    public abstract void editarPersona();
    public abstract void eliminarPersona();
    public abstract void actualizarBD();
}
