package edu.james.POO.pilaresPOO;

public class Moto extends Veiculo {

    public Moto(String chassi) {
        super(chassi);
    }



    private void ligarMotores(){
        System.out.println("Ligando motores");
    }

    private void acenderLuzes(){
        System.out.println("Ligando farois");
    }

    private void vrumVrum(){
        System.out.printf("%s,Randandandam%n",getNome());
    }


    @Override
    public void ligar(){
        ligarMotores();
        acenderLuzes();
        vrumVrum();
    }
}
