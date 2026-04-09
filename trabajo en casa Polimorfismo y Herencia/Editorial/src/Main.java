import Model.Libro;
import Model.Disco;
import Model.Idioma;
import Model.Video;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String titulo;
        double precio;
        int anioPublicacion;
        int numeroPaginas;
        String tituloDisco;
        double precioDisco;
        float duracionMinutos;
        String tituloVideo;
        double precioVideo;
        int opcionIdioma;
        Idioma idiomaVideo;
        float duracionHoras;

        System.out.println("Bienvenido de la editorial");
        System.out.println("vamos a crear un libro!!!!");
        System.out.println("cual es el titulo del libro");
        titulo = input.nextLine();
        System.out.println("cual es el precio del libro");
        precio = input.nextDouble();
        System.out.println("cual es el anio de publicacion del libro");
        anioPublicacion = input.nextInt();
        System.out.println("cual es el numero de paginas del libro");
        numeroPaginas = input.nextInt();

        Libro miLibro = new Libro(titulo, precio, anioPublicacion, numeroPaginas);
        System.out.println(miLibro);

        input.nextLine();
        System.out.println("vamos a crear un disco!!!!");
        System.out.println("cual es el titulo del disco");
        tituloDisco = input.nextLine();
        System.out.println("cual es el precio del disco");
        precioDisco = input.nextDouble();
        System.out.println("cual es la duracion en minutos del disco");
        duracionMinutos = input.nextFloat();

        Disco miDisco = new Disco(tituloDisco, precioDisco, duracionMinutos);
        System.out.println(miDisco);

        input.nextLine();
        System.out.println("vamos a crear un video!!!!");
        System.out.println("cual es el titulo del video");
        tituloVideo = input.nextLine();
        System.out.println("cual es el precio del video");
        precioVideo = input.nextDouble();
        System.out.println("selecciona el idioma del video:");
        System.out.println("1. ESPANOL");
        System.out.println("2. INGLES");
        System.out.println("3. PORTUGUES");
        opcionIdioma = input.nextInt();

        if (opcionIdioma == 2) {
            idiomaVideo = Idioma.INGLES;
        } else if (opcionIdioma == 3) {
            idiomaVideo = Idioma.PORTUGUES;
        } else {
            idiomaVideo = Idioma.ESPANOL;
        }

        System.out.println("cual es la duracion en horas del video");
        duracionHoras = input.nextFloat();

        Video miVideo = new Video(tituloVideo, precioVideo, idiomaVideo, duracionHoras);
        System.out.println(miVideo);
        input.close();
    }
}
