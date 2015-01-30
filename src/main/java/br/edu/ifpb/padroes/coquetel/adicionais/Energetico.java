package br.edu.ifpb.padroes.coquetel.adicionais;

import br.edu.ifpb.padroes.coquetel.Coquetel;

public class Energetico extends CoquetelDecorator {

	public Energetico(Coquetel coquetel) {
		super(coquetel);
		nome = "Energético";
		preco = 5.0;
	}

}
