package edu.james.POO.interfacee.equipamento.copiadora;

public class Xerox implements Copiadora{
    @Override
    public void ligar() {
        System.out.println("Ligando copiadora...");
    }

    @Override
    public void copiar(){
        System.out.println("Xerox copiando...");
    }
}
