/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estudo_23_11_2023;

import java.util.Scanner;
public class Estudo_23_11_2023 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        /* Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
(Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)*/
    
        System.out.println("Calculadora de idade em dias \n\n");
        
    int idade, mes, dia, total;
    
    System.out.println("Digite sua idade: ");
    idade = sc.nextInt();
    System.out.println("Digite seu mes de nasciento: ");
    mes = sc.nextInt();
    System.out.println("Digite o dia de seu nascimento: ");
    dia = sc.nextInt();
    
    total = idade * 365 + mes * 30 + dia;
            System.out.println("Idade total em dias: " + total);
        
        
        
    }
    
}
