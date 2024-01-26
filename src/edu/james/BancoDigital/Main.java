package edu.james.BancoDigital;

public class Main {

	public static void main(String[] args) {
		Cliente claudio = new Cliente("Claudio");

		Conta cc = new ContaCorrente(claudio);
		Conta poupanca = new ContaPoupanca(claudio);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
