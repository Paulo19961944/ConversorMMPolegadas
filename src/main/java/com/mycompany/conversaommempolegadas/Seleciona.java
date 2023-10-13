package com.mycompany.conversaommempolegadas;
import java.util.Scanner;

public class Seleciona {
    public static void selecionarOpcao() {
        boolean continuar = true; // Variável para controlar o loop
        // Início do Programa
        System.out.println("\n---------- CONVERSOR MM E POLEGADAS ----------\n");
        
        // Instancia a Classe Scanner
        Scanner scanner = new Scanner(System.in);
        
        // Seleciona MM ou Polegadas
        do {
            System.out.print("Caso queira converter para MM, digite 1. Caso queira converter para polegadas digite 2: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    ConversaoMM.conversaoMM();
                    break;
                case 2:
                    ConversaoPolegadas.converterPol();
                    break;
                default:
                    System.out.println("\nATENÇÃO: DIGITE 1 OU 2\n");
                    break;
            }
            
            System.out.print("\nDeseja continuar? (1 para continuar, 0 para sair): \n");// Verifica se deseja continuar
            int escolha = scanner.nextInt();
            if (escolha == 0) {
                continuar = false; // Define continuar como falso para sair do loop
            }
        } while (continuar);

        System.out.println("\n----------FIM----------\n");
    }
}
