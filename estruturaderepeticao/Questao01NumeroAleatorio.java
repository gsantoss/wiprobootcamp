package estruturaderepeticao;

import java.util.Random;
import java.util.Scanner;

/*1 . Escreva um programa Java que gera um n�mero aleat�rio (rand�mico) entre 0 e 10
(incluindo estes dois valores) e pe�a ao usu�rio para adivinh�-lo. Use um la�o while para
registrar as tentativas feitas e, a cada tentativa, d� dicas informando se o n�mero gerado �
maior ou menor que a tentativa feita. Finalmente mostre a quantidade de tentativas feitas at�
que o n�mero fosse acertado.*/

public class Questao01NumeroAleatorio {

	public static void main(String[] args) {
		
		//Vamos codar...
		
		//Organizar
		Scanner entrada = new Scanner(System.in);
		Random valor = new Random();
		int numeroInformado;
		int quantTentativas=0;
		
		//Passo 01: Primeiro ele sorteia e gera o n�mero aleat�rio;
		int numero = valor.nextInt(11);
		
		System.out.println(numero); //(para apresenta��o)
		
		//Passo 02: Solicitar ao usu�rio que advinhe o n�mero
		System.out.println("Advinhe o n�mero que foi gerado entre 0 e 10 (incluindo estes dois valores):");
		
		boolean continua = true;
		
		while(continua) {
			numeroInformado = entrada.nextInt();
			if(numeroInformado < numero) {
				System.err.println("Voc� n�o acertou! O n�mero gerado � MAIOR que o numero informado!");
			}else if(numeroInformado > numero) {
				System.err.println("Voc� n�o acertou! O n�mero gerado � MENOR que o n�mero informado!");
			}else {
				System.out.println("PARABENS!!!!!!!! Voc� acertou!" );
				
				continua = false;
			}
			
			quantTentativas++;
		}
		
		System.out.println("Quantidade de Tentativas: " + quantTentativas );
		entrada.close();	
	}
}
