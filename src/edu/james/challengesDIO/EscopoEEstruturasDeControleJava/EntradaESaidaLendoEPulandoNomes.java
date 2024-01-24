package edu.james.challengesDIO.EscopoEEstruturasDeControleJava;

import java.util.Scanner;

public class EntradaESaidaLendoEPulandoNomes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String[] nomes = new String[9];

        for(int i=0 ; i<9 ; i++)
            nomes[i] = sc.nextLine();

        System.out.println(nomes[2]);
        System.out.println(nomes[6]);
        System.out.println(nomes[8]);

    }
}