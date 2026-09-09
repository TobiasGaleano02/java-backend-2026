

import java.util.Scanner;
public class examensemanal1 {

    public  static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cual es el precio?: ");
        double precio = scanner.nextDouble();
        System.out.println("Cual es la cantidad?: ");
        int cantidad = scanner.nextInt();
        System.out.println("Cual es tu edad: ");
        int edad = scanner.nextInt();
        System.out.println("Sos socio? ");
        boolean socio = scanner.nextBoolean();
        System.out.println("Como deseas retirar? ");
        System.out.println("1- Retiro");
        System.out.println("2- Envio normal");
        System.out.println("3- Envio express");
        System.out.println("Elija una opcion: ");
        int opcion = scanner.nextInt();

        if (edad < 18 ) {
            System.out.println("No eres mayor de edad, no puedes comprar.");
        }
        else {

            double subTotal = calcularSubTotal(precio, cantidad);

            double subTotalConDescuento = subTotalSinEnvio(subTotal, socio);

            double costoEnvio;

            switch (opcion) {

                case 1:
                    costoEnvio = 0;
                    break;
                case 2:
                    costoEnvio = 50;
                    break;
                case 3:
                    costoEnvio = 100;
                    break;
                default:
                    System.out.println("Opcion invalida");
                    return;
            }

            double total = subTotalConDescuento + costoEnvio;

            System.out.println("Subtotal: " + subTotal);
            System.out.println("Total con descuento: " + subTotalConDescuento);
            System.out.println("Costo de envio: " + costoEnvio);
            System.out.println("Total final: " + total);

        }
    }

    public static double calcularSubTotal (double precio, int cantidad ){
        return precio * cantidad;
    }

    public static double subTotalSinEnvio(double subtotal, boolean socio){

        if (socio && subtotal >= 500) {
            return subtotal * 0.85;
        } else if (socio) {
            return subtotal * 0.95;
        } else {
            return subtotal;
        }
    }
}
