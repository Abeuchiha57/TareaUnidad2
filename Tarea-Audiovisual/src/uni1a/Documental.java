/**
 * Class Documental
 */
package uni1a;
import java.util.ArrayList;
import java.util.List;

// Subclase Documental que extiende de ContenidoAudiovisual
public class Documental extends ContenidoAudiovisual {
    private String tema;
    private List<Investigador> investigadores; // Agregación

    public Documental(String titulo, int duracionEnMinutos, String genero, String tema) {
        super(titulo, duracionEnMinutos, genero);
        this.tema = tema;
        if (tema == null || tema.isEmpty()) {
            throw new IllegalArgumentException("El tema no puede estar vacío.");
        }
        this.tema = tema;
        this.investigadores = new ArrayList<>();
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
    	 if (tema == null || tema.isEmpty()) {
             throw new IllegalArgumentException("El tema no puede estar vacío.");
         }
        this.tema = tema;
    }
        
        // Método para agregar un investigador
        public void agregarInvestigador(Investigador investigador) {
            investigadores.add(investigador);
        }

        // Getter para la lista de investigadores
        public List<Investigador> getInvestigadores() {
            return investigadores;
        
    }
    
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la película:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Tema: " + this.tema);
        System.out.println("Investigadores:");
        for (Investigador investigador : investigadores) {
            System.out.println(investigador);
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Documental{" +
               "ID=" + getId() +
               ", Título='" + getTitulo() + '\'' +
               ", Duración=" + getDuracionEnMinutos() +
               ", Género='" + getGenero() + '\'' +
               ", Tema='" + tema + '\'' +
               ", Investigadores=" + investigadores +
               '}';
       }
    }
