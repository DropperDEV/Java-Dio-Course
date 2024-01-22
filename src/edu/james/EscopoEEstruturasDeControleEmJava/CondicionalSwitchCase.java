package edu.james.EscopoEEstruturasDeControleEmJava;

public class CondicionalSwitchCase {
    public static void main(String[] args) {
        String malas = "Cleiton";

        switch(malas){
            case "Jairo":{
                System.out.println("Pertence a familia");
            }
            case "Cleiton":{
                System.out.println("Membro honorario, Pertence a familia");
            }
            case "Claudio":{
                System.out.println("Pai da familia");
            }
            default:{
                System.out.println("Não pertence a familia");
            }
        }
    }
}
