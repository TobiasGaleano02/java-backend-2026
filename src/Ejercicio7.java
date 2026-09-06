import java.util.Scanner;
public class Ejercicio7{
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            double saldo = 1000.0;
            System.out.println("Saldo:" + saldo);
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Retirar");
            System.out.println("Elija la opcion que desee realizar: ");
            int opcion = scanner.nextInt();
            switch(opcion){
                case 1:
                    double saldoActual = consultarSaldo(saldo);
                    System.out.println("Tu saldo actual es "+saldoActual);
                            break;
                case 2:
                    System.out.println("Cuanto deseas depositar?: ");
                    double montoAdepositar = scanner.nextDouble();
                    double deposito = depositar(saldo, montoAdepositar);
                    System.out.println("Tu nuevo saldo es "+ deposito);
                    break;
                case 3:
                    System.out.println("Cuanto deseas retirar?: ");
                    double montoAretirar = scanner.nextDouble();
                    boolean retiroPermitido  = puedeRetirar(saldo, montoAretirar);
                    if (retiroPermitido){
                        double retiro = retirar(saldo, montoAretirar);
                        System.out.println("Tu nuevo saldo es "+ retiro);}
                        else{
                            System.out.println("Fondos insuficientes");
                        }
                    break;
                default:
                    System.out.println("Opcion invalida.");





            }
        }

        public static double consultarSaldo(double saldo){
            return saldo;
            }
        public static double depositar(double saldo, double deposito){
                return saldo + deposito;
            }
        public static boolean puedeRetirar(double saldo, double retiro){
            return saldo >= retiro;
            }
        public static double retirar(double saldo, double retiro){
                return saldo - retiro;
            }


}
