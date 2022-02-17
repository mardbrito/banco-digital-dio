package org.dio.banco;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cliente {

	private String nome;
	private String sobrenome;
	private String cpf;
	
	public Cliente() {}
	
	public Cliente(String nome) {
		this.nome = nome;
	}
}
