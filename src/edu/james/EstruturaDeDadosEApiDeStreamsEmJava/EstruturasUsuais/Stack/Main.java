package edu.james.EstruturaDeDadosEApiDeStreamsEmJava.EstruturasUsuais.Stack;

import edu.james.EstruturaDeDadosEApiDeStreamsEmJava.EqualsHashCode.Carro;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // não pode ser de um tipo primitivo
        Stack<Carro> carros = new Stack<>();
        carros.push(new Carro("Mustang"));
        carros.push(new Carro("Toyota"));
        System.out.println(carros);
        System.out.println(carros.peek());
        carros.pop();
        System.out.println(carros);
    }
}
