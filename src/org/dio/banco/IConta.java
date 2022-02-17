package org.dio.banco;

public interface IConta {
	
	boolean sacar(double valor);
	void depositar(double valor);
	boolean transferir(double valor, Conta contaDestino);
	void imprimirExtrato();
	
}
