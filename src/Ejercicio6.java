import java.util.Scanner;
public class Ejercicio6 {


                public static void main(String[] args){
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Ingrese el primer numero: ");
                    double numero1 = scanner.nextDouble();
                    System.out.println("Ingrese el segundo numero: ");
                    double numero2 = scanner.nextDouble();
                    System.out.println("1- sumar\n2 -Restar\n3 -Multiplicar\n4 -Dividir");
                    System.out.println("Elija una operacion ");
                    int opcion = scanner.nextInt();

                    switch (opcion){
                        case 1:
                            double suma = sumar(numero1, numero2);
                            System.out.println(suma);
                            break;
                        case 2:
                            double resta = restar(numero1, numero2);
                            System.out.println(resta);
                            break;
                        case 3:
                            double multiplicacion = multiplicar(numero1, numero2);
                            System.out.println(multiplicacion);
                            break;
                        case 4:
                             if (numero2 == 0)
                                System.out.println("No se puede dividir por cero");
                             else{
                            double division = dividir(numero1, numero2);
                                System.out.println(division);}
                            break;
                        default:
                            System.out.println("pcion invalida.");

                    }
                }


                public static double sumar( double a, double b){
                    return a + b;
                }

                public static double restar ( double a, double b){
                    return a - b;
                }

                public static double multiplicar( double a, double b){
                    return a * b;
                }

                public static double dividir( double a, double b){
                    return a / b;
                }












}
