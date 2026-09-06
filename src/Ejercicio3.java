


public class Ejercicio3 {

    //caso 1 deberia decir: 240.0
    //caso 2 deberia decir: 135.0
    //caso 3 deberia decir: 300.0

        public static void main(String[] args){
            double resultado = calcularPrecioFinal(300.0, false);
            System.out.println(resultado);

        }

        public static double calcularPrecioFinal(double precio, boolean esSocio){
            if ( precio >= 200.0 && esSocio)
                return precio * 0.80;
            else if (esSocio)
                return precio * 0.90;
            else
                return precio;

        }





}
