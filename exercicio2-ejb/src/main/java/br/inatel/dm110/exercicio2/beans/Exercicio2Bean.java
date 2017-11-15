package br.inatel.dm110.exercicio2.beans;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import br.inatel.dm110.exercicio2.dao.ClientDAO;
import br.inatel.dm110.exercicio2.entities.Client;
import br.inatel.dm110.exercicio2.interfaces.Exercicio2Local;
import br.inatel.dm110.exercicio2.interfaces.Exercicio2Remote;

@Stateless
@Remote(Exercicio2Remote.class)
@Local(Exercicio2Local.class)
public class Exercicio2Bean implements Exercicio2Remote, Exercicio2Local {

	@EJB
	private ClientDAO clientDAO;
	
	@Override
	public void createNewClient(String name, String email) {
		Client client = new Client();
		
		client.setName(name);
		client.setEmail(email);
		
		clientDAO.insert(client);
	}

}
