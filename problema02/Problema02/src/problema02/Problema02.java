/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Problema02;

import java.util.Locale;
import java.util.Scanner;

/**
 * Problema 02: Cálculo de peaje para la estación "Buena Vía"
 * @author reroes
 */
public class Problema02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        // 1. Solicitar datos de entrada
        System.out.print("Ingrese el nombre del propietario: ");
        String propietario = entrada.nextLine();

        System.out.println("=== CLASIFICACIÓN DE VEHÍCULOS ===");
        System.out.println("1. Vehículo ligero particular");
        System.out.println("2. Vehículo grande particular");
        System.out.println("3. Taxi");
        System.out.println("4. Autobús urbano");
        System.out.print("Ingrese el tipo de vehículo (1-4): ");
        int tipoVehiculo = entrada.nextInt();

        System.out.print("Ingrese el valor comercial (avalúo) del vehículo: ");
        double valorComercial = entrada.nextDouble();

        // Variables para el informe
        String nombreTipo = "";
        double porcentaje = 0;
        double valorFijo = 0;
        boolean tipoValido = true;

        // 2. Determinar tarifas según el tipo de vehículo usando switch
        switch (tipoVehiculo) {
            case 1:
                nombreTipo = "Vehículo ligero particular";
                porcentaje = 0.0001; // 0.01%
                valorFijo = 2.00;
                break;
            case 2:
                nombreTipo = "Vehículo grande particular";
                porcentaje = 0.0002; // 0.02%
                valorFijo = 2.50;
                break;
            case 3:
                nombreTipo = "Taxi";
                porcentaje = 0.0004; // 0.04%
                valorFijo = 1.50;
                break;
            case 4:
                nombreTipo = "Autobús urbano";
                porcentaje = 0.0005; // 0.05%
                valorFijo = 2.20;
                break;
            default:
                tipoValido = false;
                break;
        }

        // 3. Validar si el tipo de vehículo es correcto y proceder con los cálculos
        if (tipoValido) {
            // Cálculo del valor base del peaje: (Valor comercial * Porcentaje) + Valor fijo
            double valorBasePeaje = (valorComercial * porcentaje) + valorFijo;
            double recargo = 0.0;

            // Recargo: Vehículos particulares (tipos 1 y 2) con valor superior a $30,000 pagan $1.50 extra
            if ((tipoVehiculo == 1 || tipoVehiculo == 2) && valorComercial > 30000) {
                recargo = 1.50;
            }

            // Total a cancelar
            double totalCancelar = valorBasePeaje + recargo;

            // 4. Presentar el informe final
            System.out.println("\n----------------------------------------");
            System.out.println("          Peaje \"Buena Vía\"            ");
            System.out.println("----------------------------------------");
            System.out.printf("Propietario: %s\n", propietario);
            System.out.printf("Tipo: %s\n", nombreTipo);
            System.out.printf("    Avalúo: $%.2f\n", valorComercial);
            System.out.printf("    Valor base del peaje: $%.2f\n", valorBasePeaje);
            System.out.printf("    Recargo: $%.2f\n\n", recargo);
            System.out.printf("    Total a cancelar: $%.2f\n", totalCancelar);
            System.out.println("----------------------------------------");

        } else {
            System.out.println("Error: El tipo de vehículo ingresado no es válido.");
        }
    }
}
