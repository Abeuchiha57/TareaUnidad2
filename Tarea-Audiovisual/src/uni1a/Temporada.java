package uni1a;

public class Temporada {

	 private int tempNum;
	    private int episodios;

	    public Temporada(int numero, int episodios) {
	        if (numero <= 0) {
	            throw new IllegalArgumentException("El número de temporada debe ser positivo.");
	        }
	        if (episodios < 0) {
	            throw new IllegalArgumentException("El número de episodios no puede ser negativo.");
	        }
	        this.tempNum = numero;
	        this.episodios = episodios;
	    }

	    // Getter y Setter
	    public int gettempNum() {
	        return tempNum;
	    }

	    public void setNumero(int numero) {
	        if (numero <= 0) {
	            throw new IllegalArgumentException("El número de temporada debe ser positivo.");
	        }
	        this.tempNum = numero;
	    }

	    public int getEpisodios() {
	        return episodios;
	    }

	    public void setEpisodios(int episodios) {
	        if (episodios < 0) {
	            throw new IllegalArgumentException("El número de episodios no puede ser negativo.");
	        }
	        this.episodios = episodios;
	    }

	    @Override
	    public String toString() {
	        return "Temporada{" +
	               "número=" + tempNum +
	               ", episodios=" + episodios +
	               '}';
	    }
	}
