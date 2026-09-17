import java.util.List;
import java.util.ArrayList;
public class exercises12 {

        public static void main(String[] args){

            List<Integer> precios = new ArrayList<>();
            precios.add(1200);
            precios.add(800);
            precios.add(2500);
            precios.add(400);
            precios.add(1800);
            precios.add(3000);

            int contador = 0;
            int sumaTotal = 0;
            for (Integer precio : precios){
                if (precio >= 1500 ){
                    sumaTotal += precio;
                    contador++;
                    System.out.println(precio);
                }
            }
            System.out.println("Cantidad de productos caros: "+ contador);
            System.out.println("Suma total de los productos caros: "+ sumaTotal);

        }





}
