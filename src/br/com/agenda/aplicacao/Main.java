package br.com.agenda.aplicacao;

import java.util.Date;

import br.com.agenda.dao.ContatoDAO;
import br.com.agenda.model.Contato;

public class Main {

	public static void main(String[] args) {
		
		ContatoDAO contatoDao = new ContatoDAO();
		
		Contato contato = new Contato();
		contato.setNome("Jair Messias");
		contato.setIdade(60);
		contato.setDataCadatros(new Date()); 
		
		contatoDao.save(contato);
	}
}
