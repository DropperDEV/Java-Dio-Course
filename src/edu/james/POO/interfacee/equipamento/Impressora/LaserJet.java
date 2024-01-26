package edu.james.POO.interfacee.equipamento.Impressora;

public class LaserJet implements Impressora{

    @Override
    public void ligar(){
        System.out.println("Ligando LaserJet...");
    }
    public void imprimir(){
        System.out.println("LaserJet Imprimindo...");
    }
}
