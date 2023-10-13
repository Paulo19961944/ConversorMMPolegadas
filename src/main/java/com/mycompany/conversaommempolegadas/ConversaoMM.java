package com.mycompany.conversaommempolegadas;

import java.util.Scanner;

public class ConversaoMM {
    public static void conversaoMM() {
        // Instancia a Classe Scanner
        Scanner scanner = new Scanner(System.in);

        // Captura os Dados
        System.out.print("Digite o Numero em MM: ");
        float mm = scanner.nextFloat();

        // Faz os Calculos
        float resultadoNumeradorFloat = (float) mm / 25.4f * 128;
        int resultadoNumerador;

        if (resultadoNumeradorFloat > 0.5) {
            resultadoNumerador = Math.round(resultadoNumeradorFloat);
        } else {
            resultadoNumerador = (int) resultadoNumeradorFloat;
        }

        int resultadoDenominador = 128;

        // Divide por 2 até existir um número ímpar
        while (resultadoNumerador % 2 == 0) {
            resultadoNumerador /= 2;
            resultadoDenominador /= 2;
        }
        // Resultado
        System.out.println("\n--------- RESULTADO ----------\n");
        System.out.println("O Resultado é: " + resultadoNumerador + "/" + resultadoDenominador + "\"");
    }
}
