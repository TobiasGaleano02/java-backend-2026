
// creamos la clase
public class Ejercicio2 {

        // Tipo que devuelve:devuelve double
        //  Tipo de precio: double
        // Tipo de esSocio:boolean

        // creamos el metodo main.
        public static void main(String[] args){
            double resultado = calcularPrecioFinal(100.0, true);
            System.out.println(resultado);
        }

        // creamos el metodo cacularPrecioFinal.

        public static double calcularPrecioFinal(double precio, boolean esSocio){
            if (esSocio)
                return precio * 0.90;
            else
                return precio;

        }

}
