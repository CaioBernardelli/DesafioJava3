package iphone;

public interface NavegarInternet {
    static void exibirPagina() {
        System.out.println("Exibindo página");
    }

    default void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    default void atualizarPagina() {
        System.out.println("Atualizando página");
    }
}
