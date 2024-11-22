/**
 * Class SerieDeTV
 */
package uni1a;
import java.util.ArrayList;
import java.util.List;

// Subclase SerieDeTV que extiende de ContenidoAudiovisual
public class SerieDeTV extends ContenidoAudiovisual {
   private List<Temporada> temporadas; // Agregación de Temporada
   
    public SerieDeTV(String titulo, int duracionEnMinutos, String genero, int temporadas) {
        super(titulo, duracionEnMinutos, genero);
        this.temporadas = new ArrayList<>();
    }

    // Método para agregar una temporada
    public void agregarTemporada(Temporada temporada) {
        temporadas.add(temporada);
    }

    // Getter para la lista de temporadas
    public List<Temporada> getTemporadas() {
        return temporadas;
    }
    
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la película:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Temporadas: " + this.temporadas);
        for (Temporada temporada : temporadas) {
            System.out.println(temporada);
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "SerieDeTV{" +
               "ID=" + getId() +
               ", Título='" + getTitulo() + '\'' +
               ", Duración=" + getDuracionEnMinutos() +
               ", Género='" + getGenero() + '\'' +
               ", Temporadas=" + temporadas +
               '}';
    }
}