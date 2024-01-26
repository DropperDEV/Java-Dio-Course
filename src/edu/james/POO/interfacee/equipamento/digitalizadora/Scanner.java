package edu.james.POO.interfacee.equipamento.digitalizadora;

public class Scanner implements Digitalizadora{


    @Override
    public void ligar(){
        System.out.println("Ligando Scanner...");
    }
    @Override
    public void digitalizar(){
        System.out.println("Scanner Digitalizando...");
    }
}
