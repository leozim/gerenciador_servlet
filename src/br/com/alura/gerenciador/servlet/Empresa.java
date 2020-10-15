package br.com.alura.gerenciador.servlet;

public class Empresa {
	
	private Long id;
	private String nome;
	
	Empresa() { }
	Empresa(Long id, String nome){
		this.id = id;
		this.nome = nome;
	}
	
	public Long getId() {
		return this.id;
	}
	
	public String getNome() {
		return this.nome;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
