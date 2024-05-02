import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("¡Bienvendio a la inmersión en Java!");
        //System.out.println("Película Matrix");

        //Declaración de variables
        int fechaDeLanzamiento = 1999;
        double evaluacion = 4.5;
        boolean incluidoEnElPlanBasico = true;
        String nombre = "Matrix";
        String sinopsis = """
                La mejor película del fin del milenio
                """;
        double mediaEvaluacionUsuario = 0;

        //Impresión de variables por consola o pantalla
        System.out.println("Película: " + nombre);
        System.out.println("Fecha de lanzamiento: " + fechaDeLanzamiento);
        System.out.println(sinopsis);
        System.out.println("Putuación: " + evaluacion);
        System.out.println("Inclusión en el plan básico: " + incluidoEnElPlanBasico);

        double mediaEvaluacionPelicula = (4.5 + 4.8 + 3) / 3;
        System.out.println("La media de la evaluación de Matrix: " + mediaEvaluacionPelicula);

        if (fechaDeLanzamiento > 2023) {
            System.out.println("Película popular en el momento");
        } else {
            System.out.println("Película retro que vale la pena ver");
        }

        for (int i = 0; i < 3; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingresa la nota que le darías a Matrix");
            double notaMatrix = teclado.nextDouble();
            mediaEvaluacionUsuario = mediaEvaluacionUsuario + notaMatrix;
        }
        System.out.println("La media de las notas de la película Matrix es: " + mediaEvaluacionUsuario/3);
    }
}