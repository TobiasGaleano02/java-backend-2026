
import java.util.Scanner;
public class exercises11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cual es tu nombre ");
        String nombreAlumno = scanner.next();

        int[] notasAlumno = new int[5];

        for (int i = 0; i < notasAlumno.length; i++) {

            System.out.println("Escribe tu nota.");
            notasAlumno[i] = scanner.nextInt();
        }
        int aprobadas = contarAprobadas(notasAlumno);
        System.out.println(aprobadas);
        double suma = calcularSuma(notasAlumno);
        System.out.println(suma);
        double promedioNotas = promedio(notasAlumno);
        System.out.println(promedioNotas);
    }

    public static int contarAprobadas(int[] notas) {
        int contadorAprobadas = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 6) {
                contadorAprobadas++;
            }
        }
        return contadorAprobadas;
    }

    public static double calcularSuma(int[] notas){
        double suma = 0.0;
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
        }
        return suma;
    }

    public static double promedio(int[] notas){
        double suma = 0.0;
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
        }
        double promedioNotas = suma / notas.length;
        return promedioNotas;
    }
}
