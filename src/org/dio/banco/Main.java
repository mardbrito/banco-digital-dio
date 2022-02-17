package org.dio.banco;
public class Main {

	public static void main(String[] args) {
				
		Cliente client1 = new Cliente("Marcelo Brito");
		Cliente client2 = new Cliente("Alexandre Ferreira");
		
		Banco banco1 = new Banco("Bradesco");
		Banco banco2 = new Banco("Itaú");
				
		Conta cc = new ContaCorrente(client1, banco1);
		Conta cespecial = new ContaCorrente(client2, banco1);
		Conta cp = new ContaPoupanca(client2, banco2);	
		Conta ctest = new ContaPoupanca(client2, banco2);
		Conta cteste = new ContaPoupanca(client2, banco1);
		
		banco1.add(cc);
		banco2.add(cp);
		banco1.add(cespecial);
		banco2.add(ctest);
		banco1.add(cteste);
		
		//Deposita
		cc.depositar(200);

		//Transfere valores
		if (cc.transferir(25, cp)) {
			System.out.println("Transferencia realizado!");
			System.out.println("Saldo atual: " + cc.getSaldo());
		} else {
			System.out.println("Saldo insuficiente para transferir valores!");
		}
		
		//Saque
		if (cc.sacar(35)) {
			System.out.println("Saque realizado!");
			System.out.println("Saldo atual: " + cc.getSaldo());
		} else {
			System.out.println("Saldo insufuciente!");
		}

		//Imprime extrato
		cc.imprimirExtrato();
		cp.imprimirExtrato();		
		
		//Lista contas por banco
		banco2.listaContas(banco1.getNome());
		banco1.listaContas(banco2.getNome());
	
	}

}
