

// importamos la libreria scanner, para poder leer lo que dice el usuario
import java.util.Scanner;

// creamos la clase main, donde van a ir nuestros metodos para poder llevar a cabo el ejercicio
public class ejercicio9 {


    // creamos el metodo void main para pedir y devolver datos en la terminal
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("QUe edad tienes?: ");
        int edad = scanner.nextInt();
        System.out.println("Cuanto es tu sueldo mensual?: ");
        double sueldoMensual = scanner.nextDouble();
        System.out.println("Tienes deudas?: ");
        boolean deudas = scanner.nextBoolean();

        if ( edad >= 21 && sueldoMensual >= 1500 && !deudas){
            System.out.println("Prestamos aprobado");
        }
        else
            System.out.println("Prestamo rechazado");

    }



}
