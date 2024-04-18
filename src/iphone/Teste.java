package iphone;

import iphone.AparelhoTelefonico;

public class Teste {
    public static void main(String[] args) {
        AparelhoTelefonico aparelho = new AparelhoTelefonico();
        aparelho.pausar();
        aparelho.selecionarMusica();
        NavegarInternet.exibirPagina(); // Chama o método estático da interface
        aparelho.adicionarNovaAba();
        aparelho.atualizarPagina();
        
        
        // Testar ligar e desligar
        aparelho.ligar();
        aparelho.ligar(); // Testar ligar quando já está ligado
        aparelho.desligar();
        aparelho.desligar(); // Testar desligar quando já está desligado

        // Testar atender correio de voz
        aparelho.atenderCorreioDeVoz();
        aparelho.ligar(); // Ligando o aparelho
        aparelho.atenderCorreioDeVoz(); // Testar atender correio de voz quando o aparelho está ligado
    }
}
