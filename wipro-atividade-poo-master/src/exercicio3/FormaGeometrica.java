package exercicio3;

/*

Dada a interface FormaGeometrica:


Crie as classes que representem: círculo, retângulo, quadrado e triangulo retângulo, implementando
a interface FormaGeometrica e crie métodos para o cálculo da área especifico de cada forma geométrica;


 */

public interface FormaGeometrica {

    String cor();
    String quantidadeDeLados();

    double area (double a, double b);

}
