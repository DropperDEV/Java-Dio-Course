package edu.james.POO.interfacee.equipamento.multifuncional;

import edu.james.POO.interfacee.equipamento.Impressora.Impressora;
import edu.james.POO.interfacee.equipamento.copiadora.Copiadora;
import edu.james.POO.interfacee.equipamento.digitalizadora.Digitalizadora;

public class Multifuncional implements Copiadora, Digitalizadora, Impressora {

    @Override
    public void ligar(){
        System.out.println("Ligando Multifuncional...");
    }

    @Override
    public void digitalizar() {
        System.out.println("Multifuncional Digitalizando...");
    }

    @Override
    public void copiar() {
        System.out.println("Multifuncional Copiando...");
    }

    @Override
    public void imprimir() {
        System.out.println("Multifuncional Imprimindo...");
    }

}
