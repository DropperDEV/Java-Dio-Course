package edu.james.challengesDIO.POO.Iphone;

public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorNaInternet {
    @Override
    public void ligar() {
        System.out.println("Ligando Iphone...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação telefonica no iphone...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz no iphone...");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo pagina da internet no iphone..");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionado aba do navegador no iphone");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando site no iphone");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música no iphone...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música no iphone...");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando musica no iphone...");
    }
}
