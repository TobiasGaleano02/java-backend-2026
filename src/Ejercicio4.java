import java.util.Scanner;

public class Ejercicio4 {


            public static void main(String[] args){
                Scanner scanner = new Scanner(System.in);
                System.out.println("Ingrese su edad: ");
                int edad =  scanner.nextInt();
                boolean resultado = esMayorDeEdad(edad);
                if (resultado)
                    System.out.println("Puede entrar.");
                else
                    System.out.println("No puede entrar.");
            }

            public static boolean esMayorDeEdad (int edadPermitida){
                return edadPermitida >= 18;
            }





}
