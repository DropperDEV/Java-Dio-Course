package edu.james.EscopoEEstruturasDeControleEmJava;

public class CondicionalTernaria {
    public static void main(String[] args) {
        byte nota = 2;

        String resultado = nota >=7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Prova de recuperação" : "INADIMISSAO";

        System.out.println(resultado);
    }
}
