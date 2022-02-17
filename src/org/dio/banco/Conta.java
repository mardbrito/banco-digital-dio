package org.dio.banco;
import lombok.Getter;

@Getter
public abstract class Conta implements IConta{
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	protected Banco banco;
	
	public Conta(Cliente cliente, Banco banco) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
		this.banco = banco;
	}
	
	@Override
	public boolean sacar(double valor) {
		if (this.saldo < valor) {
			return false;
		} else {
			this.saldo -= valor;
			return true;			
		}
	}
	
	@Override
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	@Override
	public boolean transferir(double valor, Conta contaDestino) {
		if (this.saldo < valor) {
			return false;
		} else {
			this.sacar(valor);
			contaDestino.depositar(valor);
			return true;
		}
	}	
		
	protected void imprimirInforComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Banco: %s", this.banco.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
		System.out.println("------------------------------");
	}
	
	
}
