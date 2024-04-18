package iphone;

public class AparelhoTelefonico implements NavegarInternet,ReprodutorMusica {
    private boolean ligado;

    public AparelhoTelefonico() {
        this.ligado = false; // Por padrão, o aparelho começa desligado
    }

    public void ligar() {
        if (!ligado) {
            System.out.println("Ligando o aparelho telefônico...");
            ligado = true;
        } else {
            System.out.println("O aparelho já está ligado.");
        }
    }

    public void desligar() {
        if (ligado) {
            System.out.println("Desligando o aparelho telefônico...");
            ligado = false;
        } else {
            System.out.println("O aparelho já está desligado.");
        }
    }

    public void atenderCorreioDeVoz() {
        if (ligado) {
            System.out.println("Atendendo correio de voz...");
        } else {
            System.out.println("Você precisa ligar o aparelho para acessar o correio de voz.");
        }
    }
}

