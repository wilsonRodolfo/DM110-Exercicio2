package br.inatel.dm110.exercicio2.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.inatel.dm110.exercicio2.entities.Client;

@Stateless
public class ClientDAO {

	@PersistenceContext(unitName = "exercicio2_DM110")
	private EntityManager em;
	
	public void insert(Client client) {
		em.persist(client);
	}
}
