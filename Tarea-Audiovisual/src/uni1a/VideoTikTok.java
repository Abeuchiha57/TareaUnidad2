package uni1a;

public class VideoTikTok extends ContenidoAudiovisual {
    private int duracionEnSegundos; // Duración en segundos
    private int numeroDeVistas;
    private String creador;

    public VideoTikTok(String titulo, int duracionEnSegundos, String genero, String creador) {
        super(titulo, duracionEnSegundos / 60, genero); // Convertimos a minutos para la clase base
        this.duracionEnSegundos = duracionEnSegundos;
        this.numeroDeVistas = 0; // Inicialmente sin vistas
        this.creador = creador;
    }

    // Getters y Setters
    public int getDuracionEnSegundos() {
        return duracionEnSegundos;
    }

    public void setDuracionEnSegundos(int duracionEnSegundos) {
        this.duracionEnSegundos = duracionEnSegundos;
    }

    public int getNumeroDeVistas() {
        return numeroDeVistas;
    }

    public void setNumeroDeVistas(int numeroDeVistas) {
        this.numeroDeVistas = numeroDeVistas;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    // Método para incrementar el número de vistas
    public void incrementarVistas() {
        this.numeroDeVistas++;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del Video TikTok:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración: " + duracionEnSegundos + " segundos");
        System.out.println("Género: " + getGenero());
        System.out.println("Creador: " + creador);
        System.out.println("Número de vistas: " + numeroDeVistas);
    }

    @Override
    public String toString() {
        return "VideoTikTok{" +
                "duracionEnSegundos=" + duracionEnSegundos +
                ", numeroDeVistas=" + numeroDeVistas +
                ", creador='" + creador + '\'' +
                "} " + super.toString();
    }
}
