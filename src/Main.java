import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int fechaDeLanzamiento = 1999;
        double evaluacion = 4.5;
        boolean incluidoEnElPlanBasico = true;
        String nombrePelicula = "Matrix";
        String synopsis = """
                La mejor pelicula del fin del milenio
                protagonistas: Kenu
                """;
        double mediaEvaluacionUsuario = 0;
        System.out.println("Pelicula: " + nombrePelicula);
        System.out.println("Fecha de Lanzammiento: " + fechaDeLanzamiento);
        System.out.println("Evaluación: " + evaluacion);
        System.out.println("Synopsis: " + synopsis);

        double mediaEvaluacion = (4.5 + 4.8 + 3) / 3;
        System.out.println("Media de la evaluacion de Matrix: " + mediaEvaluacion);

        if (fechaDeLanzamiento >= 2023) {
            System.out.println("Pelicula popular en el momento");
        } else {
            System.out.println("Pelicula Retro qie vale la pena ver");
        }

        for (int i = 0; i < 3; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingresa la nota o evaluacion que le darias a Matrix");
            double notaMatrix = teclado.nextDouble();
            mediaEvaluacionUsuario = mediaEvaluacionUsuario + notaMatrix;


        }
        System.out.println("La media de la pelicula " + "Matrix calculada por el usuario es: " + mediaEvaluacionUsuario / 3);
    }
}
