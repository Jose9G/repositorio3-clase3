/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programas;

import java.util.Scanner;

/**
 *
 * @author JOSE
 */
public class Aritmetica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Variables
        double num1, num2, suma, promedio;
        //Entrada de datos
        System.out.print("Ingresar número 1: ");
        num1 = sc.nextDouble();
        System.out.print("Ingresar número 2: ");
        num2 = sc.nextDouble();
        
        //Operaciones
        suma = num1 + num2;
        promedio = suma / 2;
        
        //Resultados
        System.out.println("La suma es: " + suma);
        System.out.println("El promedio es: " + promedio);
    }
}
