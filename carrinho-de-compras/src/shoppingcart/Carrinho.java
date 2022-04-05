package shoppingcart;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Carrinho {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int qtd, codigo, op;
		double total = 0.0, diferenca = 1.0, porcentagem = 0.0, recebe = 0.0, vezes = 0.0;
		

		int[] soma = new int[10];

		char decisao = ' ';

		String[] carrinhoNome = new String[10];

		double[] precoCarrinho = new double[10];

		String[] produto = new String[] { "Leite", "Cereal", "Arroz", "Atum", "Feijão", "Azeite", "Óleo", "Sabão",
				"Sal", "Açúcar" };

		int[] quantidade = new int[] { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };

		double[] precos = new double[] { 4.57, 3.02, 9.43, 3.55, 6.55, 4.55, 7.33, 1.99, 3.82, 4.29 };

		System.out.println("\t\t\t\t\tWIPRO STORE");
		System.out.println("========================================================================================"
				+ "======\n");
		System.out.println("CÓDIGO\t\t\tPRDUTO\t\t\tQTND. PRODUTOS\t\t\tPRECO UNIT.\n");

		for (int i = 0; i <= 9; i++) {
			System.out.println(i + 1 + "\t\t\t" + produto[i] + "\t\t\t\t" + quantidade[i] + "\t\t\t   " + precos[i]);
		}
		System.out.println("========================================================================================"
				+ "======\n");

		System.out.printf("Olá digite o código do produto: ");
		codigo = sc.nextInt();

		System.out.printf("Informe a quantidade desejada de produtos: ");
		qtd = sc.nextInt();

		if (quantidade[codigo - 1] - qtd >= 0) {
			System.out.println(qtd + " UN " + produto[codigo - 1] + " adicionado com sucesso no carrinho !!");
		}

		switch (codigo) {
		case 1:
			if (quantidade[0] - qtd < 0) {
				System.out.println("Quantidade indisponível");
				break;
			}
			quantidade[0] -= qtd;
			soma[0] += qtd;
			break;
		case 2:
			if (quantidade[1] - qtd < 0) {
				System.out.println("Quantidade indisponível");
				break;
			}
			quantidade[1] -= qtd;
			soma[1] += qtd;
			break;
		case 3:
			if (quantidade[2] - qtd < 0) {
				System.out.println("Quantidade indisponível");
				break;
			}
			quantidade[2] -= qtd;
			soma[2] += qtd;
			break;
		case 4:
			if (quantidade[3] - qtd < 0) {
				System.out.println("Quantidade indisponível");
				break;
			}
			quantidade[3] -= qtd;
			soma[3] += qtd;
			break;
		case 5:
			if (quantidade[4] - qtd < 0) {
				System.out.println("Quantidade indisponível");
				break;
			}
			quantidade[4] -= qtd;
			soma[4] += qtd;
			break;
		case 6:
			if (quantidade[5] - qtd < 0) {
				System.out.println("Quantidade indisponível");
				break;
			}
			quantidade[5] -= qtd;
			soma[5] += qtd;
			break;
		case 7:
			if (quantidade[6] - qtd < 0) {
				System.out.println("Quantidade indisponível");
				break;
			}
			quantidade[6] -= qtd;
			soma[6] += qtd;
			break;
		case 8:
			if (quantidade[7] - qtd < 0) {
				System.out.println("Quantidade indisponível");
				break;
			}
			quantidade[7] -= qtd;
			soma[7] += qtd;
			break;
		case 9:
			if (quantidade[8] - qtd < 0) {
				System.out.println("Quantidade indisponível");
				break;
			}
			quantidade[8] -= qtd;
			soma[8] += qtd;
			break;
		case 10:
			if (quantidade[9] - qtd < 0) {
				System.out.println("Quantidade indisponível");
				break;
			}
			quantidade[9] -= qtd;
			soma[9] += qtd;
			break;
		default:
			System.out.println("Código inválido");
			break;
		}

		System.out.printf("Deseja continuar a sua compra ? [S/N]: ");
		decisao = sc.next().charAt(0);

		carrinhoNome[codigo - 1] = produto[codigo - 1];
		precoCarrinho[codigo - 1] = precos[codigo - 1];

		while (decisao != 'n') {

			System.out.println("CÓDIGO\t\t\tPRDUTO\t\t\tQTND. PRODUTOS\t\t\tPRECO UNIT.\n");

			for (int i = 0; i <= 9; i++) {
				System.out
						.println(i + 1 + "\t\t\t" + produto[i] + "\t\t\t\t" + quantidade[i] + "\t\t\t   " + precos[i]);
			}
			System.out
					.println("========================================================================================"
							+ "======\n");

			System.out.printf("Olá digite o código do produto: ");
			codigo = sc.nextInt();

			System.out.printf("Informe a quantidade desejada de produtos: ");
			qtd = sc.nextInt();

			if (quantidade[codigo - 1] - qtd >= 0) {
				System.out.println(qtd + " UN " + produto[codigo - 1] + " adicionado com sucesso no carrinho !!");
			}

			switch (codigo) {
			case 1:
				if (quantidade[0] - qtd < 0) {
					System.out.println("Quantidade indisponível");
					break;
				}
				quantidade[0] -= qtd;
				soma[0] += qtd;
				break;
			case 2:
				if (quantidade[1] - qtd < 0) {
					System.out.println("Quantidade indisponível");
					break;
				}
				quantidade[1] -= qtd;
				soma[1] += qtd;
				break;
			case 3:
				if (quantidade[2] - qtd < 0) {
					System.out.println("Quantidade indisponível");
					break;
				}
				quantidade[2] -= qtd;
				soma[2] += qtd;
				break;
			case 4:
				if (quantidade[3] - qtd < 0) {
					System.out.println("Quantidade indisponível");
					break;
				}
				quantidade[3] -= qtd;
				soma[3] += qtd;
				break;
			case 5:
				if (quantidade[4] - qtd < 0) {
					System.out.println("Quantidade indisponível");
					break;
				}
				quantidade[4] -= qtd;
				soma[4] += qtd;
				break;
			case 6:
				if (quantidade[5] - qtd < 0) {
					System.out.println("Quantidade indisponível");
					break;
				}
				quantidade[5] -= qtd;
				soma[5] += qtd;
				break;
			case 7:
				if (quantidade[6] - qtd < 0) {
					System.out.println("Quantidade indisponível");
					break;
				}
				quantidade[6] -= qtd;
				soma[6] += qtd;
				break;
			case 8:
				if (quantidade[7] - qtd < 0) {
					System.out.println("Quantidade indisponível");
					break;
				}
				quantidade[7] -= qtd;
				soma[7] += qtd;
				break;
			case 9:
				if (quantidade[8] - qtd < 0) {
					System.out.println("Quantidade indisponível");
					break;
				}
				quantidade[8] -= qtd;
				soma[8] += qtd;
				break;
			case 10:
				if (quantidade[9] - qtd < 0) {
					System.out.println("Quantidade indisponível");
					break;
				}
				quantidade[9] -= qtd;
				soma[9] += qtd;
				break;
			default:
				System.out.println("Código inválido");
				break;
			}

			carrinhoNome[codigo - 1] = produto[codigo - 1];
			precoCarrinho[codigo - 1] = precos[codigo - 1];

			System.out.printf("Deseja continuar a sua compra ? [S/N]: ");
			decisao = sc.next().charAt(0);

		}
		System.out.println("ITENS NO CARRINHO: ");
		System.out.println("Nome\t\t\tQtde. no carrinho\t\t\tPreço unit. (R$)\t\t\tPreço Total (R$)\n");

		for (int i = 0; i <= 9; i++) {
			if (carrinhoNome[i] != null && soma[i] != 0.0 && precoCarrinho[i] != 0.0) {
				System.out.println(carrinhoNome[i] + "\t\t\t\t" + soma[i] + "\t\t\t\t" + "\t" + precoCarrinho[i]
						+ "\t\t\t\t" + "\t" + (soma[i] * precoCarrinho[i]));

			}
		}
		for (int i = 0; i <= 9; i++) {
			total += soma[i] * precoCarrinho[i];
		}

		porcentagem += (total * 9.0) / 100.0;

		System.out.println("Valor total da compra com Imposto de 9%: R$: " + String.format("%.2f", (total + porcentagem)));
		System.out.println("Opções de Pagamento: \n");
		System.out.println("[1] À vista em dinheiro ou cartão MASTERCARD, recebe 20% de desconto");
		System.out.println("[2] À vista no cartão de crédito, recebe 15% de desconto");
		System.out.println("[3] Em duas vezes, preço normal de etiqueta sem juros");
		System.out.println("[4] Em três vezes, preço normal de etiqueta mais juros de 10%\n");

		System.out.printf("Qual seria a forma de pagamento ? ");
		op = sc.nextInt();
		total += porcentagem;
		porcentagem = 0.0;
		
		System.out.println("\nWipro STORE");
		System.out.println("Rua do Mussa, n°0 - Mercadinho Haram - LTDA");
		System.out.println("CNPJ: 00.531.567/0001-54\n");

		System.out.println("\t\t\t\t\tNOTA FISCAL");
		System.out.println("========================================================================================"
				+ "=================================\n");
		System.out.println("PRODUTO\t\t\tQtde. de produto\t\t\tPreço unit. (R$)\t\t\tPreço Total (R$)\n");
		for (int i = 0; i <= 9; i++) {
			if (carrinhoNome[i] != null && soma[i] != 0.0 && precoCarrinho[i] != 0.0) {

				System.out.println(carrinhoNome[i] + "\t\t\t\t" + soma[i] + "\t\t\t\t" + "\t" + precoCarrinho[i]
						+ "\t\t\t\t" + "\t" + (soma[i] * precoCarrinho[i]));

			}
		}
		System.out.println("========================================================================================"
				+ "=================================\n");
		
		if (op == 1) {
			diferenca = 0.8;
			recebe += ((total * diferenca) * 20.0) / 100.0;
			porcentagem += ((total * diferenca) * 9) / 100.0;
		} else if (op == 2) {
			diferenca = 0.85;
			recebe += ((total * diferenca) * 15.0) / 100.0;
			porcentagem += ((total * diferenca) * 9) / 100.0;
		} else if (op == 4) {
			vezes = 3.0;
			diferenca = 1.1;
			recebe += ((total * diferenca) * 10.0) / 100.0;
			porcentagem += ((total * diferenca) * 9) / 100.0;
			System.out.println("VALOR DAS 3 PARCELAS: R$ " + String.format("%.2f",(total * diferenca) / vezes));
		} else if (op == 3) {
			vezes = 2.0;
			porcentagem += (total * 9) / 100.0;
			System.out.println("VALOR DAS 2 PARCELAS: R$ " + String.format("%.2f",total / vezes));
		}

		

		if (op == 1 || op == 2) {
			System.out.println("DESCONTO NA COMPRA: R$" + String.format("%.2f", recebe));
		}

		if (op == 4) {
			System.out.println("Juros R$: " + String.format("%.2f", recebe));
		}
		System.out.println("VALOR TOTAL A SER PAGO:R$ " + String.format("%.2f", total * diferenca));
		System.out.println("VALOR TRIBUTÁRIO: R$" + String.format("%.2f", porcentagem));

		sc.close();
	}
}
