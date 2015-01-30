package br.edu.ifpb.padroes.coquetel.adicionais;

import br.edu.ifpb.padroes.coquetel.Coquetel;

public abstract class CoquetelDecorator extends Coquetel {
	
	private Coquetel coquetel;

	public CoquetelDecorator(Coquetel coquetel) {
		this.coquetel = coquetel;
	}
	
	@Override
	public String getNome() {
		return this.coquetel.getNome() + " + " + this.nome;
	}
	
	@Override
	public double getPreco() {
		return coquetel.getPreco() + this.preco;
	}
	
}
