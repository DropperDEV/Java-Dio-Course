package edu.james.POO.pilaresPOO;

public abstract class Veiculo {

    protected Veiculo(String chassi){
        this.chassi = chassi;
    }

    private String chassi;
    private String nome;


     protected String getNome() {
        return nome;
    }

     protected void setNome(String nome) {
        this.nome = nome;
    }



     protected String getChassi() {
        return chassi;
    }

    protected void setChassi(String chassi) {
        this.chassi = chassi;
    }



    protected abstract void ligar();
}
