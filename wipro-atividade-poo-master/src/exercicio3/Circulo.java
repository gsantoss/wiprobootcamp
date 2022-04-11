package exercicio3;

public class Circulo implements FormaGeometrica {


    double raio;
    double pi = 3.1416;

    public Circulo() {
    }

    public Circulo(double raio, double pi) {
        this.raio = raio;
        this.pi = pi;
    }



    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    @Override
    public String cor() {
        return "Branco";
    }

    @Override
    public String quantidadeDeLados() {
        return "Não possui lados";
    }

    @Override
    public double area(double a, double b) {
       double area = pi * (raio * raio);
            return area;
    }

}
