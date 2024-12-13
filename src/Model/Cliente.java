package Model;

public class Cliente {
    private String nombre;
    private String apellido;
    private int cedula;
    private String telefono;
    private String correo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Cliente(String nombre, String apellido, int cedula, String telefono, String correo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.telefono = telefono;
        this.correo = correo;

    }
    public void mostrarInfoCliente(){
        System.out.println("El Nombre del cliente es: " + this.nombre + "El apellido del ciente es: " + this.apellido + "El cedula del cliente es: " + this.cedula + "El telefono del cliente es: " + this.telefono + "El correo del cliente es: " + this.correo);

    }
}
