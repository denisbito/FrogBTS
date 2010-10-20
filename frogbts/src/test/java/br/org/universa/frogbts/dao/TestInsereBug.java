package br.org.universa.frogbts.dao;

import org.junit.Test;

import junit.framework.Assert;
import br.org.universa.frogbts.entity.Bug;


public class TestInsereBug {
	@Test
	public void  testInsereBug() {
		
		Bug bug = new Bug();
		
		String chave = "Erro na tela de login.";
		bug.setChave(chave);
		
		BugDao bugDao = new BugDao();
		bugDao.inserirBug(bug);
		
		Assert.assertNotNull(bug.getId());
	}
	
	@Test
	public void testVerificaIdDiferente() {
		
		Bug bug1 = new Bug();
		Bug bug2 = new Bug();
		
		String chave1 = "Erro na tela de login.";
		String chave2 = "Erro na tela de logout.";
			
		bug1.setChave(chave1);
		bug2.setChave(chave2);
		
		BugDao bugDao = new BugDao();
		
		bugDao.inserirBug(bug1);
		bugDao.inserirBug(bug2);
	
		
		Assert.assertFalse(bug1.getId().equals(bug2.getId()));
	}
	
	@Test
	public void testRecuperarBug() {
		Bug bug = new Bug();
		bug.setChave("Erro na pagina principal");
		
		BugDao bugDao = new BugDao();
		bugDao.inserirBug(bug);
		Bug bug2 = bugDao.recupera(bug.getId());
		
		Assert.assertEquals(bug.getId(),bug2.getId());
		Assert.assertEquals(bug.getChave(),bug2.getChave());
	}

}









