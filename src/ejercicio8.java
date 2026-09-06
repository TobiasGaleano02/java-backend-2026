import java.util.Scanner;
public class ejercicio8 {


        public static void main (String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese el precio del producto: ");
            double precio = scanner.nextDouble();
            System.out.println("Ingrese la cantidad: ");
            int cantidad = scanner.nextInt();
            System.out.println("Eres socio?: ");
            boolean socio = scanner.nextBoolean();
            double total = total(precio, cantidad);
            if ( socio && total >= 500)
            {
                double descuentoTotal = total * 0.80;
                System.out.println("El costo total es: " + descuentoTotal);
            }
            else if (socio && total < 500)
            {
                double descuentoParcial = total * 0.90;
                System.out.println("El costo total es: " + descuentoParcial);
            }
            else
                System.out.println("El costo total es: " + total);
        }
        public static double total (double a, double b){
            return a * b;
        }


}
