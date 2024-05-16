package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        String pronto;
        int resposta;
        int tentativa;


        System.out.println("  _____________________________________________________");
        System.out.println("               ⭐ JOGO DE ADVINHAÇÃO  ⭐                ");
        System.out.println("  _____________________________________________________");
        System.out.println();
        System.out.println("❗ REGRAS DO JOGO ❗  ");
        System.out.println();
        System.out.println("1- Vou pensar em um número ");
        System.out.println();
        System.out.println("2- Você tenta advinhar qual número estou pensando ");
        System.out.println();
        System.out.println("3- Te informo se se acertou ou não ");
        System.out.println();
        System.out.println("❓ Está pronto para jogar (s/n) ❓");
        pronto = leitura.next();

        switch (pronto){
            case "s":
                resposta =8;
                System.out.println(" Qual número entre 0 e 10 estou pensando ❓");
                tentativa = leitura.nextInt();
                if(tentativa == resposta){
                    System.out.println("✔️ Parabéns, certa resposta! ✔️");
                }else {
                    System.out.println("❌ Que pena, você errou! ❌");
                }
                break;
            case "n":
                System.out.println(";( Que pena, até mais ;(");
                break;
            default:
                System.out.println("⚠️ OPÇÃO INVÁLIDA! ⚠️");
        }
    }

}
