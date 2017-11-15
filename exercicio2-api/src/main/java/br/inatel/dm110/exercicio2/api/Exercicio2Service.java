 package br.inatel.dm110.exercicio2.api;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/exercicio2")
public interface Exercicio2Service {

	@POST
	@Path("/client")
	@Produces(MediaType.APPLICATION_JSON)
	void createClient(@FormParam("nome") String nome, @FormParam("email") String email);
}
