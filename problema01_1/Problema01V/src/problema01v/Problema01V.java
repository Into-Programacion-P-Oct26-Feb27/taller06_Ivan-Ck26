/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package problema01v;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Problema01V {

    /**
     * @param args the command line arguments
     */
       
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.println("=== MENÚ DE OPERACIONES ARITMÉTICAS ===");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("5. Módulo (residuo)");
        System.out.println("6. Potencia");
        System.out.print("Seleccione una operación (1-6): ");
        int opcion = entrada.nextInt();

     
        if (opcion >= 1 && opcion <= 6) {
            System.out.print("Ingrese el primer número: ");
            double num1 = entrada.nextDouble();
            
            System.out.print("Ingrese el segundo número: ");
            double num2 = entrada.nextDouble();

          
            if (num1 > num2) {
                String nombreOperacion = "";
                double resultado = 0;
                boolean operacionValida = true;

                if (opcion == 1) {
                    nombreOperacion = "Suma";
                    resultado = num1 + num2;
                } else {
                    if (opcion == 2) {
                        nombreOperacion = "Resta";
                        resultado = num1 - num2;
                    } else {
                        if (opcion == 3) {
                            nombreOperacion = "Multiplicación";
                            resultado = num1 * num2;
                        } else {
                            if (opcion == 4) {
                                nombreOperacion = "División";
                                
                                if (num2 != 0) {
                                    resultado = num1 / num2;
                                } else {
                                    System.out.println("Error: No es posible dividir entre cero.");
                                    operacionValida = false;
                                }
                            } else {
                                if (opcion == 5) {
                                    nombreOperacion = "Módulo";
                                    if (num2 != 0) {
                                        resultado = num1 % num2;
                                    } else {
                                        System.out.println("Error: No se puede calcular el módulo con divisor cero.");
                                        operacionValida = false;
                                    }
                                } else {
                                    if (opcion == 6) {
                                        nombreOperacion = "Potencia";
                                        resultado = Math.pow(num1, num2);
                                    }
                                }
                            }
                        }
                    }
                }

               
             if (operacionValida) {
            System.out.println("\n----------------------------------------");
           System.out.println("       OPERACIONES ARITMÉTICAS          ");
            System.out.println("----------------------------------------");
            System.out.printf("Primer número: %.2f\n", num1);
             System.out.printf("Segundo número: %.2f\n", num2);
          System.out.printf("Operación seleccionada: %s\n\n", nombreOperacion);
            System.out.printf("Resultado: %.2f\n", resultado);
             System.out.println("----------------------------------------");
                }

            } else {
                System.out.println("No es posible realizar la operación solicitada: El primer número debe ser mayor que el segundo.");
            }

        } else {
            System.out.println("La opción seleccionada no es válida.");
        }
    }
}
    
    

