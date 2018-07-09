package empleado;

public class EmpleadoClase {
    
    private String Nombre;
    private String Apellido;
    private String Cargo;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public EmpleadoClase(String Nombre, String Apellido, String Cargo) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Cargo = Cargo;
    }
    
    
    
    
}
