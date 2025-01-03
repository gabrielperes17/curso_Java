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
public class EstruturasCondicionais {
    public static void main(String args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Em qual Ano Voce Nasceu?");
        int nascimento = sc.nextInt();
        int idade = 2025-nascimento;
        if (idade >= 18){
            System.out.println("Maior de Idade");
        }else{
            System.out.println("Menor de Idade");
        }
    }
};
