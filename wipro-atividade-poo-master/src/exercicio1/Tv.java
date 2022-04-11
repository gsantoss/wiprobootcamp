package exercicio1;

/*

Grupo 8

Developers:

Gustavo Santos
Thiago Ferreira de Sousa
Guilherme Felix
Rodrigo Oliveira Sousa


Crie uma classe Televisao e uma classe ControleRemoto que pode controlar o volume e trocar os canais da televisão.
O controle de volume permite:

1 - aumentar ou diminuir a potência do volume de som em uma unidade de cada vez;
2 - aumentar e diminuir o número do canal em uma unidade
3 - trocar para um canal indicado;
4 - consultar o valor do volume de som e o canal selecionado.


 */

import java.util.Scanner;

public class Tv {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcao;



        do {

            System.out.println("Escolha uma opção");
            System.out.println("1 - Aumentar volume:");
            System.out.println("2 - Diminuir volume:");
            System.out.println("3 - Aumentar canal:");
            System.out.println("4 - Diminuir canal:");
            System.out.println("5 - Visualizar informções do canal:");
            System.out.println("0 - Desligar a TV");

            System.out.println("\nDigite a opção: ");
            opcao = scan.nextInt();

            Controle controle = new Controle();
            controle.setVolume(0);
            controle.setCanal("SBT");

            switch (opcao) {
                case 1:
                    controle.aumentarVolume();
                    break;
                case 2:
                    controle.diminuirVolume();
                    break;
                case 3:
                    controle.aumentarCanal();
                    break;
                case 4:
                    controle.diminuirCanal();
                    break;
                case 5:
                    controle.consultarValorDeSomECanal();
                    break;
                case 0:
                    System.out.println("Tv desligada");

                default:
                    System.out.println("Opção Inválida, favor digitar uma opção de 0 a 5");
                    break;
            }

        } while (opcao != 0);

    }
}
