package uni1a;
//Clase Actor de película.
public class Actor {
    private String nombre;
    private int edad;
    private String rol;

    public Actor(String nombre, int edad, String rol) {
        this.nombre = nombre;
        this.edad = edad;
        this.rol = rol;
    }

    // Getter y Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "Actor{" +
               "nombre='" + nombre + '\'' +
               ", edad=" + edad +
               ", rol='" + rol + '\'' +
               '}';
    }
}
