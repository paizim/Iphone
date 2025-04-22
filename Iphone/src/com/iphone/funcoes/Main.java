package com.iphone.funcoes;

public class Main {
    public static void main(String[] args) {
        Menu meuIphone = new Menu();

        // Testando Reprodutor Musical
        System.out.println("🎵 Testando Reprodutor Musical:");
        meuIphone.selecionarMusica("Imagine - John Lennon");
        meuIphone.tocar();
        meuIphone.pausar();

        // Testando Aparelho Telefônico
        System.out.println("\n📞 Testando Aparelho Telefônico:");
        meuIphone.ligar("1234-5678");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        // Testando Navegador de Internet
        System.out.println("\n🌐 Testando Navegador de Internet:");
        meuIphone.exibirPagina("https://www.apple.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}
