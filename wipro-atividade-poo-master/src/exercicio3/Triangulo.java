package exercicio3;

public class Triangulo implements FormaGeometrica{

    private double a;
    private double b;

    public Triangulo() {
    }

    public Triangulo(double a, double b) {
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
        return "verde";
    }

    @Override
    public String quantidadeDeLados() {
        return "três lados";
    }

    @Override
    public double area(double a, double b) {
       double area = (a * b)/2;
        return area;
    }

}
