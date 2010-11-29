package br.org.universa.frogbts.dao;

import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class GenericDAO implements EntityManagerFactory {
	

	public void close() {
	}

	public EntityManager createEntityManager() {
		return null;
	}

	public EntityManager createEntityManager(Map map) {
		return null;
	}

	public boolean isOpen() {
		// TODO Auto-generated method stub
		return false;
	}

}
