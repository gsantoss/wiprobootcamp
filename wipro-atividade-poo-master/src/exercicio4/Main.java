package exercicio4;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();
        Funcionario funcionario2 = new Funcionario();

        funcionario1.setNome("Ivanildo");
        funcionario1.setCpf("123.456.789-10");
        funcionario1.setBonus(500.0);
        funcionario1.setSalario(1200.00);
        System.out.println(funcionario1.getNome() + " recebeu: " + funcionario1.getSalario() + " + um bonus de: " + funcionario1.getBonus());

        funcionario2.setNome("wallace");
        funcionario2.setCpf("450.784.520-11");
        funcionario2.setBonus(1220.0);
        funcionario2.setSalario(10000.00);
        System.out.println(funcionario2.getNome() + " recebeu: " + funcionario2.getSalario() + " + um bonus de: " + funcionario2.getBonus());

    }
}
