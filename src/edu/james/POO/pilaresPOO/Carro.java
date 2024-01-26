package edu.james.POO.pilaresPOO;

public class Carro extends Veiculo {
    public Carro(String chassi){
        super(chassi);
    }

    private void ligarMotores(){
        System.out.println("Ligando motores");
    }

    private void acenderLuzes(){
        System.out.println("Ligando farois");
    }

    private void ajeitarRetrovisores(){
        System.out.println("Ajeitando retrovisores...");
    }

    private void olaMestre(){
        System.out.printf("Ola eu sou %s, me guie mestre", getNome());
    }
    @Override
    public void ligar() {
        ligarMotores();
        acenderLuzes();
        ajeitarRetrovisores();
        olaMestre();
    }
}
