package exercicio3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Quadrado quadrado = new Quadrado();
        quadrado.setA(10);
        quadrado.setB(10);
        Retangulo retangulo = new Retangulo();
        retangulo.setA(5);
        retangulo.setB(10);
        Circulo circulo = new Circulo();
        circulo.setPi(3.1416);
        circulo.setRaio(6);
        Triangulo triangulo = new Triangulo();
        triangulo.setA(10);
        triangulo.setB(5);


        int opcao;
        do {

        System.out.println("Informa a forma geométrica que deseje saber a cor e calcular a área:");
        System.out.println("1 - Quadrado");
        System.out.println("2 - Retângulo");
        System.out.println("3 - Triângulo Retângulo");
        System.out.println("4 - Circulo");
        System.out.println("0 - Sair");

        System.out.println("Digite a opção desejada: ");
        opcao = scan.nextInt();


        switch (opcao){
            case 1 :
                System.out.println("A área do quadrado é: " + quadrado.area(quadrado.getA(), quadrado.getB()));
                System.out.println("Sua quantidade de lados é: " + quadrado.quantidadeDeLados());
                System.out.println("E sua cor: " + quadrado.cor());
                    break;
            case 2:
                System.out.println("A área do retângulo é: " + retangulo.area(retangulo.getA(), retangulo.getB()));
                System.out.println("Sua quantidade de lados é: " +retangulo.quantidadeDeLados());
                System.out.println("E sua cor: " + retangulo.cor());
                    break;
            case 3 :
                System.out.println("A área do triâgulo retângulo é: " + triangulo.area(retangulo.getA(), retangulo.getB()));
                System.out.println("Sua quantidade de lados é: " +triangulo.quantidadeDeLados());
                System.out.println("E sua cor: " + triangulo.cor());
                    break;
            case 4 :
                System.out.println("A área do circulo é: " + circulo.area(circulo.pi, circulo.raio));
                System.out.println("Sua quantidade de lados é: " +circulo.quantidadeDeLados());
                System.out.println("E sua cor: " + circulo.cor());
                    break;

        }

        }while (opcao != 0);
        System.out.println("Fim!");

    }
}
