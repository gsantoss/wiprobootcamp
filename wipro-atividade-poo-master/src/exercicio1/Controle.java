package exercicio1;


public class Controle implements FuncoesDoControle {

    private int volume;
    private String canal;

    public Controle() {
    }

    public Controle(int volume, String canal) {
        this.volume = volume;
        this.canal = canal;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String  getCanal() {
        return canal;
    }

    public void setCanal(String  canal) {
        this.canal = canal;
    }

    @Override
    public void aumentarVolume() {
        System.out.println("Volume aumentado");
    }

    @Override
    public void diminuirVolume() {

        System.out.println("Volume dimunuído");
    }

    @Override
    public void aumentarCanal() {

        System.out.println("Canal aumentado");

    }

    @Override
    public void diminuirCanal() {

        System.out.println("Canal dimunído");
    }

    @Override
    public void trocarCanal() {

        System.out.println("Canal alterado");
    }

    @Override
    public void consultarValorDeSomECanal() {
        System.out.println("Canal: " + getCanal());
        System.out.println("Volume: " + getVolume());


    }
}
