package br.edu.ifpb.padroes.coquetel.adicionais;

import br.edu.ifpb.padroes.coquetel.Coquetel;

public class Suco extends CoquetelDecorator {

	public Suco(Coquetel coquetel) {
		super(coquetel);
		nome = "Suco";
		preco = 4.0;
	}

}
