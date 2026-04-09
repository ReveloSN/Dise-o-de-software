package Model;

public class Libro extends Publicacion{

    private int anioPublicacion;
    private int numeroPaginas;

    public Libro(String titulo, double precio, int anioPublicacion, int numeroPaginas) {
        super(titulo, precio);
        this.anioPublicacion = anioPublicacion;
        this.numeroPaginas = numeroPaginas;
    }

    public Libro(int anioPublicacion, int numeroPaginas) {
        this.anioPublicacion = anioPublicacion;
        this.numeroPaginas = numeroPaginas;
    }

    public Libro() {
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "anioPublicacion=" + anioPublicacion +
                ", numeroPaginas=" + numeroPaginas +
                '}';
    }
}
