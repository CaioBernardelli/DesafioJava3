package iphone;

public interface ReprodutorMusica {
    public default void pausar() {
        System.out.println("Pausando");
    }

    public default void selecionarMusica() {
        System.out.println("Selecionando música");
    }
    
    public default void tocar() {
        System.out.println("Tocar música");
    }
}
