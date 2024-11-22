package uni1a;

public class Sketch extends ContenidoAudiovisual {
    private String autor;          // Autor del sketch
    private String tipoHumor;      // Tipo de humor (e.g., slapstick, satírico)
    private int duracionEnMinutos; // Duración en minutos

    // Constructor
    public Sketch(String titulo, int duracionEnMinutos, String genero, String autor, String tipoHumor) {
        super(titulo, duracionEnMinutos, genero); // Llama al constructor de la superclase
        this.autor = autor;
        this.tipoHumor = tipoHumor;
        this.duracionEnMinutos = duracionEnMinutos; // Guardamos la duración
    }

    // Getters y Setters
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTipoHumor() {
        return tipoHumor;
    }

    public void setTipoHumor(String tipoHumor) {
        this.tipoHumor = tipoHumor;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    // Implementación del método abstracto
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del Sketch:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración: " + duracionEnMinutos + " minutos");
        System.out.println("Género: " + getGenero());
        System.out.println("Autor: " + autor);
        System.out.println("Tipo de humor: " + tipoHumor);
    }

    @Override
    public String toString() {
        return "Sketch{" +
                "autor='" + autor + '\'' +
                ", tipoHumor='" + tipoHumor + '\'' +
                ", duracionEnMinutos=" + duracionEnMinutos +
                "} " + super.toString();
    }
}

