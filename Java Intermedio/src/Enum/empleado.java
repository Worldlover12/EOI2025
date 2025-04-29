package Enum;

public class empleado{
    private String nombre;
    private String apellido;
    private tiposEmpleado tipo;

    public empleado(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

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

    public void setTipo(tiposEmpleado tipo) {
        this.tipo = tipo;
    }
    public String getTipo(){
        return tipo.toString();
    }
}
