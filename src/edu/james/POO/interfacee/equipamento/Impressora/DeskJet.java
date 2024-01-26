package edu.james.POO.interfacee.equipamento.Impressora;

public class DeskJet implements Impressora {

    @Override
    public void ligar(){
        System.out.println("Ligando DeskJet...");
    }
    @Override
    public void imprimir(){
        System.out.println("DeskJet imprimindo...");
    }
}
