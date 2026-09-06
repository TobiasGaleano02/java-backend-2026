
// crear la clase

public class Main {

        // creamos el metodo main donde vamos a mostrar en la
        //terminar los resultados

            public static void main(String[] args) {
                boolean resultado = puedeAcceder(20, false);
                if (resultado)
                    System.out.println("Acceso permitido");
                else
                    System.out.println("Acceso denegado");


            }

        //creamos el metodo donde pondremos las condiciones y funciones

            public static boolean puedeAcceder(int edad, boolean tieneEntrada) {
                    return edad >= 18 && tieneEntrada;
            }






}