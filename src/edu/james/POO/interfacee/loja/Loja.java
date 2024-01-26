package edu.james.POO.interfacee.loja;

import edu.james.POO.interfacee.equipamento.Impressora.DeskJet;
import edu.james.POO.interfacee.equipamento.Impressora.LaserJet;
import edu.james.POO.interfacee.equipamento.copiadora.Xerox;
import edu.james.POO.interfacee.equipamento.digitalizadora.Scanner;
import edu.james.POO.interfacee.equipamento.multifuncional.Multifuncional;

public class Loja {
    public static void main(String[] args) {
        Xerox xerox1 = new Xerox();
        DeskJet deskJet1 = new DeskJet();
        LaserJet laserJet1 = new LaserJet();
        Scanner scanner1 = new Scanner();
        Multifuncional multifuncional1 = new Multifuncional();


        xerox1.ligar();
        xerox1.copiar();

        deskJet1.ligar();
        deskJet1.imprimir();

        laserJet1.ligar();
        laserJet1.imprimir();

        scanner1.ligar();
        scanner1.digitalizar();

        multifuncional1.ligar();
        multifuncional1.copiar();
        multifuncional1.imprimir();
        multifuncional1.digitalizar();
    }
}
