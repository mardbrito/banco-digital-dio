package org.dio.banco;

public class ContaCorrente extends Conta {
	
	public ContaCorrente(Cliente cliente, Banco banco) {
		super(cliente, banco);
	
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("\n*** Extrato Conta Corrente ***");
		super.imprimirInforComuns();
	}
	
	
}
