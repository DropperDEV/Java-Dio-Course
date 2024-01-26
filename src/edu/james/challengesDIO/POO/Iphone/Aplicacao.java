package edu.james.challengesDIO.POO.Iphone;

public class Aplicacao {
    public static void main(String[] args) {
        Iphone iphone2007 = new Iphone();

        iphone2007.ligar();
        iphone2007.atender();
        iphone2007.iniciarCorreioVoz();

        iphone2007.adicionarNovaAba();
        iphone2007.atualizarPagina();
        iphone2007.exibirPagina();


        iphone2007.selecionarMusica();
        iphone2007.tocar();
        iphone2007.pausar();
    }
}
