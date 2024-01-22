package edu.james.challengesDIO.smartTV;

public class Usuario {
    public static void main(String[] args) {
        SmartTV  tv4k = new SmartTV();

        System.out.println("PADRÃO TV");
        System.out.println("A tv está ligada? " +tv4k.ligada);
        System.out.println("Canal atual da tv: " +tv4k.canal);
        System.out.println("Volume atual da tv: " +tv4k.volume);

        System.out.println("\n");

        System.out.println("Modicada TV");
        tv4k.ligar();
        System.out.println("A tv está ligada? " +tv4k.ligada);
        tv4k.mudarCanal(10);
        System.out.println("Canal atual da tv: " +tv4k.canal);
        tv4k.aumentarVolume();
        System.out.println("Volume atual da tv: " +tv4k.volume);
    }
}
