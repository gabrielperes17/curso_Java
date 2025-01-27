/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectmain;
import java.util.Scanner;
/**
 *
 * @author Cliente
 */
public class AppExercicio {
    public static void main(String[] args) {
        Scanner function = new Scanner(System.in);
        int soma = 0;
        int num = 0;
        String resp = "";
        
        do {
            System.out.println("Digite um número: ");
            num = function.nextInt();
            soma += num;
            function.nextLine(); // Consumir o caractere de nova linha restante
            System.out.print("Quer continuar? (s/n): ");
            resp = function.nextLine();
        } while (!resp.equalsIgnoreCase("n")); // Usar equalsIgnoreCase para comparar strings
        
        System.out.println("A soma final é " + soma);
        function.close(); // Fechar o scanner para evitar vazamento de recursos
    }
}