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
public class AppDo {
    public static void main(String[] args){
    int n,s=0;
    String responde;
    Scanner teclado =new Scanner(System.in);
    do {
        System.out.println("Encolhe um numero Porra!");
        n=teclado.nextInt();
        s+=n;
        System.out.println("Quer continuar your merda!");
        responde= teclado.next();
    }while (responde.equals('s'));
    System.out.println("A soma total é "+ s);
}
}