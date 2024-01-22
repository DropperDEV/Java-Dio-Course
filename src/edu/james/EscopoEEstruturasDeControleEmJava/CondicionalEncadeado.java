package edu.james.EscopoEEstruturasDeControleEmJava;

public class CondicionalEncadeado {
    public static void main(String[] args) {
        byte nota  = 10;

        if (nota >=7){
            System.out.println("Aprovado");
        }
        else if (nota >= 5 && nota < 7){
            System.out.println("Prova de recuperação");
        }
        else{
            System.out.println("INADIMISSAO");
        }
    }
}
