/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema1;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Problema1 {

/**
 * Solución B: Operaciones aritméticas usando switch
 * @author reroes
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

        // Validar si la opción del switch es válida antes de pedir los números
        switch (opcion) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.print("Ingrese el primer número: ");
                double num1 = entrada.nextDouble();
                
                System.out.print("Ingrese el segundo número: ");
                double num2 = entrada.nextDouble();

                // Validación de la restricción obligatoria
                if (num1 > num2) {
                    String nombreOperacion = "";
                    double resultado = 0;
                    boolean realizarInforme = true;

                    switch (opcion) {
                        case 1:
                            nombreOperacion = "Suma";
                            resultado = num1 + num2;
                            break;
                        case 2:
                            nombreOperacion = "Resta";
                            resultado = num1 - num2;
                            break;
                        case 3:
                            nombreOperacion = "Multiplicación";
                            resultado = num1 * num2;
                            break;
                        case 4:
                            nombreOperacion = "División";
                            if (num2 != 0) {
                                resultado = num1 / num2;
                            } else {
                                System.out.println("Error: El segundo número no"
                                        + " puede ser cero para la división.");
                                realizarInforme = false;
                            }
                            break;
                        case 5:
                            nombreOperacion = "Módulo";
                            if (num2 != 0) {
                                resultado = num1 % num2;
                            } else {
                                System.out.println("Error: El segundo número no "
                                        + "puede ser cero para el módulo.");
                                realizarInforme = false;
                            }
                            break;
                        case 6:
                            nombreOperacion = "Potencia";
                            resultado = Math.pow(num1, num2);
                            break;
                    }

                    
                    if (realizarInforme) {
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
                break;

            default:
                System.out.println("La opción seleccionada no es válida.");
                break;
        }
    }
}