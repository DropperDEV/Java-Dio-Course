package edu.james.POO.pilaresPOO;

public class Autodromo {
    public static void main(String[] args) {
        Moto esportiva = new Moto("414141");
        esportiva.setNome("Hayabusa");
        esportiva.ligar();


        Carro sedan = new Carro("79826982");
        sedan.setNome("Mercedes");
        sedan.ligar();
    }
}
