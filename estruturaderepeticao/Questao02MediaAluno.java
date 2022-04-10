package estruturaderepeticao;

import java.util.Scanner;

//2. Faça um programa para receber o nome de um aluno e informar 2 notas, em seguida calcular
//a média do aluno e apresentar ao final a média calculada e a situação de Aprovação do aluno.
//(aprovado com média >= 6)
public class Questao02MediaAluno {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o nome do aluno");
		String nome = scanner.next();
		
		System.out.println("Informe a primeira nota do aluno:");
		double nota01 = scanner.nextDouble();
		
		System.out.println("Informe a segunda nota do aluno:");
		double nota02 = scanner.nextDouble();
		
		
		double media = (nota01 + nota02) / 2;
		
		System.out.println("Nome do aluno(a): " + nome);
		System.out.println("Média: " + media);
		if(media >=6 ) {
			System.out.println("Média: " + media + " Situação: APROVADO!" );
		}else {
			System.out.println("Média: " + media + " Situação: REPROVADO!" );
		}
		
		scanner.close();
	}

}
