package Model;

public class Disco extends Publicacion {

    private Float duracionMinutos;

    public Disco(String titulo, double precio, Float duracionMinutos) {
        super(titulo, precio);
        this.duracionMinutos = duracionMinutos;
    }

    public Disco(Float duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    public Disco(){
        super();
        this.duracionMinutos = (float) 0;
    }

    public Float getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(Float duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    @Override
    public String toString() {
        return "Disco{" +
                "duracionMinutos=" + duracionMinutos +
                '}';
    }
}
