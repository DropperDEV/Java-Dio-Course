package edu.james.TratamentoDeExcecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TratamentoSimples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Digite sua altura");
            byte altura = sc.nextByte();
        } catch(InputMismatchException e){
            System.out.println("Digite um numero!");
        } finally{
            System.out.println("Processo finalizado.");
        }



    }
}
