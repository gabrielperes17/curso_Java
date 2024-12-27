/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectmain;
import java.math.*;
import java.util.Scanner;


/**
 *
 * @author Cliente
 */
public class GameRandom {
    public static void main(String[]agrs){
        Scanner geral= new Scanner(System.in);
        System.out.println("Tente Acertar o Valor Aleatorio !!!");
        System.out.println("Digite um Valor: ");
        int value=geral.nextInt();
        double random= Math.random();
        int n= (int) (5 + random * (10-5));
        System.out.printf("O valor Aleatorio foi %d%n ",n);
        if (value != n){
         System.out.println("Os Valores sao Diferentes voce Errou!");   
        }
        else{
         System.out.println("Valores Indenticos Voce acertou");   
        }
        geral.close();
    }
}
