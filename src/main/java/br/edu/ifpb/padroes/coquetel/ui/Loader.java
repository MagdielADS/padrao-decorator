package br.edu.ifpb.padroes.coquetel.ui;

import br.edu.ifpb.padroes.coquetel.Coquetel;
import br.edu.ifpb.padroes.coquetel.adicionais.Energetico;
import br.edu.ifpb.padroes.coquetel.adicionais.Refrigerante;
import br.edu.ifpb.padroes.coquetel.bebidas.Whisky;


public class Loader {

	public static void main(String[] args) {
		Coquetel whisky = new Whisky();
		whisky = new Energetico(whisky);
		whisky = new Refrigerante(whisky);
		
		System.out.println(whisky.getNome());
		System.out.println(whisky.getPreco());
	}

}
