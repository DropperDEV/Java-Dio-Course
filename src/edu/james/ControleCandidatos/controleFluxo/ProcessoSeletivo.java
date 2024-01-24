package edu.james.ControleCandidatos.controleFluxo;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String[] candidatos = {"Pedro", "Juliana", "Lucas", "Gabriela"};
        for (String cadidato : candidatos){
            entrandoEmContato(cadidato);
        }
    }
     static void selecaoCandidatos() {
         String[] candidatos = {"Felipe", "Ana", "Carlos", "Isabel", "Rafael", "Mariana", "Pedro", "Juliana", "Lucas", "Gabriela"};

       int candidatoSelecionado = 0;
       int candidatoAtual = 0;
         double salarioBase = 200.0;
       while(candidatoSelecionado < 5 && candidatoAtual < candidatos.length){
           String candidato  = candidatos[candidatoAtual];
           double salarioPretendido = valorPretendido();

           System.out.printf("O candidato %s solicitou este valor de salario %f %n",candidato,salarioPretendido);
           if(salarioBase <=salarioPretendido ){
               System.out.printf("O candidato %s foi selecionado para vaga %n", candidato);
               candidatoSelecionado++;
           }
           candidatoAtual++;
       }
    }

    static void imprimirSelecionados(){
        String[] candidatos = {"Pedro", "Juliana", "Lucas", "Gabriela"};

        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");

        for (int i = 0; i < candidatos.length; i++){
            System.out.printf("O candidato numero %d é o %s",i+1,candidatos[i]);
        }
        for (String candidato : candidatos){
            System.out.printf("O candidato %s foi selecionado",candidato);
        }
    }

    static void entrandoEmContato(String candidato){
                int tentativasRealizadas = 1;
                boolean continuarTentando = true;
                boolean atendeu=false;
                do{
                    atendeu= atender();
                    continuarTentando = !atendeu;
                    if(continuarTentando = !atendeu){
                        tentativasRealizadas++;
                    }
                    else {
                        System.out.println("Contato realizado com sucesso");
                    }
                } while(continuarTentando && tentativasRealizadas <3);

                if(atendeu){
                    System.out.printf("Conseguimos contato com %s na %d tentativa %n",candidato,tentativasRealizadas);
                } else{
                    System.out.printf("Não conseguimos contato com %s, numero máximo de tentativas %d realizadas %n",candidato,tentativasRealizadas);
                }
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 200.0;
        if(salarioBase > salarioPretendido){
            System.out.println("Ligar para o candidato");
        } else if(salarioBase==salarioPretendido){
            System.out.println("Ligar para o candidato com contra proposta");
        } else{
            System.out.println("Aguardando o resultado dos demais candidatos");
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }

    static boolean atender(){
        return new Random().nextInt(3)==1;
    }
}
