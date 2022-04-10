package estruturaderepeticao;

import java.util.Random;
import java.util.Scanner;

/*1 . Escreva um programa Java que gera um número aleatório (randômico) entre 0 e 10
(incluindo estes dois valores) e peça ao usuário para adivinhá-lo. Use um laço while para
registrar as tentativas feitas e, a cada tentativa, dê dicas informando se o número gerado é
maior ou menor que a tentativa feita. Finalmente mostre a quantidade de tentativas feitas até
que o número fosse acertado.*/

public class Questao01NumeroAleatorio {

	public static void main(String[] args) {
		
		//Vamos codar...
		
		//Organizar
		Scanner entrada = new Scanner(System.in);
		Random valor = new Random();
		int numeroInformado;
		int quantTentativas=0;
		
		//Passo 01: Primeiro ele sorteia e gera o número aleatório;
		int numero = valor.nextInt(11);
		
		System.out.println(numero); //(para apresentação)
		
		//Passo 02: Solicitar ao usuário que advinhe o número
		System.out.println("Advinhe o número que foi gerado entre 0 e 10 (incluindo estes dois valores):");
		
		boolean continua = true;
		
		while(continua) {
			numeroInformado = entrada.nextInt();
			if(numeroInformado < numero) {
				System.err.println("Você não acertou! O número gerado é MAIOR que o numero informado!");
			}else if(numeroInformado > numero) {
				System.err.println("Você não acertou! O número gerado é MENOR que o número informado!");
			}else {
				System.out.println("PARABENS!!!!!!!! Você acertou!" );
				
				continua = false;
			}
			
			quantTentativas++;
		}
		
		System.out.println("Quantidade de Tentativas: " + quantTentativas );
		entrada.close();	
	}
}
