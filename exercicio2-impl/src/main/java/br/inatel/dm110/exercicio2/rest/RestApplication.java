package br.inatel.dm110.exercicio2.rest;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import br.inatel.dm110.exercicio2.impl.Exercicio2ServiceImpl;

@ApplicationPath("/api")
public class RestApplication extends Application {
	
	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> classes = new HashSet<>();
		classes.add(Exercicio2ServiceImpl.class);
		return classes;
	}
}
