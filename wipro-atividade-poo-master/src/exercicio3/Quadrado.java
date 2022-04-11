package exercicio3;

public class Quadrado implements FormaGeometrica{

    private double a;
    private double b;

    public Quadrado(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Quadrado() {
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public String cor() {
        return "Amarelo";
    }

    @Override
    public String quantidadeDeLados() {
        return "quatro lados iguais";
    }

    @Override
    public double area(double a, double b) {
      double area = a * b;
        return area;
    }

}
