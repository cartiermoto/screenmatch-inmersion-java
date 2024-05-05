import modelo.Pelicula;
import modelo.Serie;
import java.util.Scanner;

public class Principal {
    public void muestraElMenu (){
    int opcion = 0;
        Scanner teclado = new Scanner(System.in);

    while (opcion != 9 ) {
        String menu = """
                 Bienvenido(a) a Screematch
                1)Registrar nueva Pelicula
                2)Registra nueva Serie
                9)Salir
                 """;
        System.out.println(menu);
        opcion = teclado.nextInt();
        teclado.nextLine();

        switch (opcion) {
            case 1:
                System.out.println("Ingrese el nombre del titulo de la pelicula");
                String Nombre = teclado.nextLine();
                System.out.println("Ingrese el año de lanzamiento de la pelicula");
                int fechaDeLanzamiento = teclado.nextInt();
                teclado.nextLine();
                System.out.println("Ingrese la duración en minutos de la pelicula");
                int duracionEnMinutos = teclado.nextInt();
                teclado.nextLine();
                Pelicula peliculaUsuario = new Pelicula();
                peliculaUsuario.setNombre(Nombre);
                peliculaUsuario.setFechaDeLanzamiento(fechaDeLanzamiento);
                peliculaUsuario.setTiempoDeDuracionEnMinutos(duracionEnMinutos);
                peliculaUsuario.muestraFichaTecnica();
                break;
            case 9:
                System.out.println("Saliendo del sistema,gracias");
                break;
            default:
                System.out.println("Opción no válida");
        }

    }
}
}