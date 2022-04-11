package exercicio3;

public class Retangulo implements FormaGeometrica{

    private double a;
    private double b;

    public Retangulo() {
    }

    public Retangulo(double a, double b) {
        this.a = a;
        this.b = b;
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
        return "Azul";
    }

    @Override
    public String quantidadeDeLados() {
        return "quatro lados";
    }

    @Override
    public double area(double a, double b) {
       double area = a * b ;
        return area;
    }

}
