package br.inatel.dm110.exercicio2.impl;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;

import br.inatel.dm110.exercicio2.api.Exercicio2Service;
import br.inatel.dm110.exercicio2.api.Result;
import br.inatel.dm110.exercicio2.interfaces.Exercicio2Remote;

@RequestScoped
public class Exercicio2ServiceImpl implements Exercicio2Service {

	@EJB(lookup = "java:app/exercicio2-ejb-0.1-SNAPSHOT/Exercicio2Bean!br.inatel.dm110.exercicio2.interfaces.Exercicio2Remote")
	private Exercicio2Remote exercicio2Bean;
	
	@Override
	public void createClient(String nome, String email) {
		exercicio2Bean.createNewClient(nome, email);;
	}
}
