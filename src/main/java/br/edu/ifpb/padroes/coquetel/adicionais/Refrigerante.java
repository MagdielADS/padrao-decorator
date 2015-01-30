package br.edu.ifpb.padroes.coquetel.adicionais;

import br.edu.ifpb.padroes.coquetel.Coquetel;

public class Refrigerante extends CoquetelDecorator {

	public Refrigerante(Coquetel coquetel) {
		super(coquetel);
		nome = "Refrigerante";
		preco = 3.0;
	}

}
