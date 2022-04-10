package estruturaderepeticao;

import java.util.Scanner;

public class Questao03Votacao {
	public static void main(String a[])
	{
		Scanner sc = new Scanner(System.in);
		String candidato1, candidato2, candidato3, candidato4;

		int votos1, votos2, votos3, votos4;
		int votacao, totalVotos, maiorVotacao;
	
		votos1 = votos2 = votos3 = votos4 = 0;
		
		int votantes = 0;
		int eleitores = 0;
		
		System.out.println("Favor informe o nome dos 04 candidatos");
		System.out.print("Candidato 1: ");
		candidato1 = sc.nextLine();
		System.out.print("Candidato 2: ");
		candidato2 = sc.nextLine();
		System.out.print("Candidato 3: ");
		candidato3 = sc.nextLine();
		System.out.print("Candidato 4: ");
		candidato4 = sc.nextLine();
		
		System.out.println("Favor informe a quantidade de eleitores:");
		eleitores = sc.nextInt();
		
		totalVotos = 0;
		do {
			System.out.print("Digite seu voto: ");
			votacao = sc.nextInt();
			
			switch(votacao){
			case 1:
				votos1++;
				totalVotos++;
				break;
			case 2:
				votos2++;
				totalVotos++;
				break;
			case 3:
				votos3++;
				totalVotos++;
				break;
			case 4:
				votos4++;
				totalVotos++;
				break;
			default:
				if (votacao != 0)
				{
					System.out.println("Voto Inválido!");
				}
			}
			
			votantes++;
		} while (votantes < eleitores);
		System.out.println("Candidato "+candidato1+" teve "+ votos1+" votos");
		System.out.println("Candidato "+candidato2+" teve "+ votos2+" votos");
		System.out.println("Candidato "+candidato3+" teve "+ votos3+" votos");
		System.out.println("Candidato "+candidato4+" teve "+ votos4+" votos");
		
		System.out.printf("Total de Votos da Eleição: %d\n", totalVotos);
		maiorVotacao = votos1;
		if (votos2 > maiorVotacao)
			maiorVotacao = votos2;
		if (votos3 > maiorVotacao)
			maiorVotacao = votos3;
		if (votos4 > maiorVotacao)
			maiorVotacao = votos4;
		System.out.println("Candidato(s) Vencedor(es) da Eleição:");
		if (votos1 == maiorVotacao)
			System.out.println(candidato1);
		if (votos2 == maiorVotacao)
			System.out.println(candidato2);
		if (votos3 == maiorVotacao)
		System.out.println(candidato3);
		if (votos4 == maiorVotacao)
			System.out.println(candidato4);
		sc.close();
	}
}