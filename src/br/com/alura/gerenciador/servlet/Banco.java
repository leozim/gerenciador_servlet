package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private static List<Empresa> lista = new ArrayList<Empresa>();
	
	public void adicionar(Empresa empresa) {
		Banco.lista.add(empresa);
	}

	public static List<Empresa> getEmpresas() {
		return lista;
	}

	public static void setLista(List<Empresa> lista) {
		Banco.lista = lista;
	}
}
