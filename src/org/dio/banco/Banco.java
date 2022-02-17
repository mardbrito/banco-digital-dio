package org.dio.banco;
import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Banco {

	private String nome;	
	List<Conta> contas = new ArrayList<Conta>();
	
	public Banco(String nome) {
		this.nome = nome;
	}

	public void add(Conta conta) {
		contas.add(conta);		
	}
	
	public void listaContas(String nome) {
		System.out.println("Banco: " + nome);
		for (int i = 0; i < contas.size(); i++) {			
			System.out.println("Numero da conta: " + contas. get(i).getNumero()); 
			System.out.println("Titular da conta: " + contas. get(i).getCliente().getNome()); 			
		}
		System.out.println("---------------");
	}
}