package uni1a;

public class Investigador {
	 private String nombre;
	    private String especialidad;

	    public Investigador(String nombre, String especialidad) {
	        if (nombre == null || nombre.isEmpty()) {
	            throw new IllegalArgumentException("El nombre no puede estar vacío.");
	        }
	        if (especialidad == null || especialidad.isEmpty()) {
	            throw new IllegalArgumentException("La especialidad no puede estar vacía.");
	        }
	        this.nombre = nombre;
	        this.especialidad = especialidad;
	    }

	    // Getter y Setter para el campo 'nombre'
	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        if (nombre == null || nombre.isEmpty()) {
	            throw new IllegalArgumentException("El nombre no puede estar vacío.");
	        }
	        this.nombre = nombre;
	    }

	    // Getter y Setter para el campo 'especialidad'
	    public String getEspecialidad() {
	        return especialidad;
	    }

	    public void setEspecialidad(String especialidad) {
	        if (especialidad == null || especialidad.isEmpty()) {
	            throw new IllegalArgumentException("La especialidad no puede estar vacía.");
	        }
	        this.especialidad = especialidad;
	    }

	    @Override
	    public String toString() {
	        return "Investigador{" +
	               "nombre='" + nombre + '\'' +
	               ", especialidad='" + especialidad + '\'' +
	               '}';
	    }
	}
