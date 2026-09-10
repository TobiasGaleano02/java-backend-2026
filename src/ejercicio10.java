
import java.util.Scanner;
class ejercicio10 {

    //EJERCICIO 1
    //public static void main(String[] args){
    //Scanner scanner = new Scanner (System.in);

    // System.out.println("Ingrese un numero: ");
    //int numeroDeUsuario = scanner.nextInt();

    // for (int i = 1; i < numeroDeUsuario ; i++){
    //               System.out.println(i);
    //  }

    //    }
    //EJERCICIO 2
    // public static void main(String[] args){
    // Scanner scanner = new Scanner (System.in);

    // System.out.println("Ingrese un numero: ");
    // int numeroDeUsuario = scanner.nextInt();

    //for (int i = numeroDeUsuario; i >= 0 ; i--){
    // System.out.println(i);
    // }

    //  }

    //EJERCICIO 3
    // public static void main(String[] args){
    //   Scanner scanner = new Scanner (System.in);
    //   System.out.println("Ingrese un numero: ");
    //  int numeroDeUsuario = scanner.nextInt();

    //  for (int i = 2; i < numeroDeUsuario ; i+=2) {
    //     System.out.println(i);
    //      }

    //   }

    //EJERCICIO 4
    //public static void main(String[] args){
    //Scanner scanner = new Scanner (System.in);
    // System.out.println("Ingrese un numero: ");
    // int numeroDeUsuario = scanner.nextInt();

    // int suma = 0;
    //for (int i = 1; i <= numeroDeUsuario ; i++) {
    //    suma += i;
    // }
    //      System.out.println(suma);
    //
    //  }

    //EJERCICIO 5
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int numeroDeUsuario = scanner.nextInt();

        int contador = 0;
        for (int i = 1; i < numeroDeUsuario; i ++) {
            if (i % 3 == 0){
                contador++;
            }
        }
        System.out.println(contador);
    }
}
