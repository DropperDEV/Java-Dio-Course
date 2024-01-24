package edu.james.EscopoEEstruturasDeControleEmJava;

import java.util.ArrayList;

public class RepeticaoForEmArrays {
    public static void main(String[] args) {
        ArrayList<Integer> umAdez = new ArrayList<>();

        for (int i = 0; i <= 10;i++){
            umAdez.add(i);
        }

        for (int numero : umAdez){
            System.out.println(numero);
        }
    }
}
