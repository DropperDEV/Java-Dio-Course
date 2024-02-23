package edu.james.EstruturaDeDadosEApiDeStreamsEmJava.ListaEncadeada;

public class Main {
    public static void main(String[] args) {
        ListaEncadeada<String> lista = new ListaEncadeada<>();

        lista.add("Um");
        lista.add("Dois");
        lista.add("Tres");
        lista.add("Quatro");

        System.out.println(lista.get(0));
        System.out.println(lista.get(3));

        System.out.println(lista);

        System.out.println(lista.remove(3));
        System.out.println(lista);
    }
}
