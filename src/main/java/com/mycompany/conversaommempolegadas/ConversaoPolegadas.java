/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conversaommempolegadas;
import java.util.Scanner;

/**
 *
 * @author paulo
 */
public class ConversaoPolegadas {
    public static void converterPol(){
        // Instancia a Classe Scanner
        Scanner scanner = new Scanner(System.in);
        
        // Captura os Numeros
        System.out.print("\nDigite o Número do Numerador em Polegadas: ");
        float numeradorPol = scanner.nextFloat();
        System.out.print("Digite o Número do Denominador em Polegadas: ");
        float denominadorPol = scanner.nextFloat();
        
        // Faz os Calculos
        float resultado = (float) (numeradorPol / denominadorPol * 25.4);
        
        // Printa o Resultado na Tela
        System.out.println("\n---------- RESULTADO ----------\n");
        System.out.println("O Resultado é: " + resultado + "mm");
    }
}
