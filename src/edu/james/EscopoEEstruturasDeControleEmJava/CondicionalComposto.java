package edu.james.EscopoEEstruturasDeControleEmJava;

public class CondicionalComposto {
    public static void main(String[] args) {
        double saldo = 15.0;
        double valorSolicitado = 17.0;

        if (valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;
        } else{
            System.out.println("Valor solicitado maior que saldo!");
        }
        System.out.printf("saldo: %.2f", saldo);
    }
}
