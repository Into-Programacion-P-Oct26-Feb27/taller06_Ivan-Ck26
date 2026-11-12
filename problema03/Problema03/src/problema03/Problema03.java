/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Problema03;

import java.util.Locale;
import java.util.Scanner;

/**
 * Problema 03: Cálculo de incremento salarial y bonificación por antigüedad
 * @author reroes
 */
public class Problema03 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

       
        System.out.print("Ingrese el nombre del empleado: ");
        String empleado = entrada.nextLine();

        System.out.println("=== TIPOS DE EMPLEADO ===");
        System.out.println("1. Tipo 1 (5%)");
        System.out.println("2. Tipo 2 (7%)");
        System.out.println("3. Tipo 3 (9%)");
        System.out.println("4. Tipo 4 (12%)");
        System.out.println("5 o cualquier otro. Tipo por defecto (15%)");
        System.out.print("Ingrese el tipo de empleado: ");
        int tipoEmpleado = entrada.nextInt();

        System.out.print("Ingrese los años de servicio: ");
        int anosServicio = entrada.nextInt();

        System.out.print("Ingrese el sueldo inicial: ");
        double sueldoInicial = entrada.nextDouble();

        
        double porcentajeIncrementoDecimal = 0.0;
        int porcentajeEnteroReporte = 0;
        double bonificacionAntiguedad = 0.0;

        
        switch (tipoEmpleado) {
            case 1:
                porcentajeIncrementoDecimal = 0.05; 
                porcentajeEnteroReporte = 5;
                break;
            case 2:
                porcentajeIncrementoDecimal = 0.07; 
                porcentajeEnteroReporte = 7;
                break;
            case 3:
                porcentajeIncrementoDecimal = 0.09; 
                porcentajeEnteroReporte = 9;
                break;
            case 4:
                porcentajeIncrementoDecimal = 0.12; 
                porcentajeEnteroReporte = 12;
                break;
            default:
                porcentajeIncrementoDecimal = 0.15; 
                porcentajeEnteroReporte = 15;
                break;
        }

        
        if (anosServicio < 2) {
            bonificacionAntiguedad = 0.00;
        } else {
            if (anosServicio >= 2 && anosServicio < 5) {
                bonificacionAntiguedad = 30.00;
            } else {
                if (anosServicio >= 5 && anosServicio < 10) {
                    bonificacionAntiguedad = 60.00;
                } else {
                    bonificacionAntiguedad = 100.00; 
                }
            }
        }

        
        double incrementoSalarial = sueldoInicial * porcentajeIncrementoDecimal;
        double nuevoSueldo = sueldoInicial + incrementoSalarial + bonificacionAntiguedad;

        
        System.out.println("\n----------------------------------------");
        System.out.println("      REPORTE DE INCREMENTO SALARIAL    ");
        System.out.println("----------------------------------------");
        System.out.printf("Empleado: %s\n", empleado);
        System.out.printf("Tipo de empleado: %d\n", tipoEmpleado);
        System.out.printf("Años de servicio: %d\n\n", anosServicio);
        System.out.printf("Sueldo inicial: $%.2f\n", sueldoInicial);
        System.out.printf("Porcentaje de incremento: %d%%\n", porcentajeEnteroReporte);
        System.out.printf("Incremento salarial: $%.2f\n", incrementoSalarial);
        System.out.printf("Bonificación por antigüedad: $%.2f\n\n", bonificacionAntiguedad);
        System.out.printf("Nuevo sueldo: $%.2f\n", nuevoSueldo);
        System.out.println("----------------------------------------");
    }
}