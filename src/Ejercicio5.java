import java.util.Scanner;

public class Ejercicio5 {

            public static void main(String[] args){
                Scanner scanner = new Scanner(System.in);
                System.out.println(
                        "1- Crear usuario" +
                        "2- Editar Usuario" +
                        "3- Eliminar usuario"
                );
                System.out.println("Elija una opcion: ");
                int opcion = scanner.nextInt();

                switch ( opcion) {
                    case 1:
                        System.out.println("Crear usuario.");
                        break;
                    case 2:
                        System.out.println("Editar usuario. ");
                        break;
                    case 3:
                        System.out.println("Eliminar usuario. ");
                        break;
                    default:
                        System.out.println("Opcion Invalida.");
                }

            }






}
