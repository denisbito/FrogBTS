package br.org.universa.frogbts.dao;

import java.util.HashMap;
import java.util.Map;

import br.org.universa.frogbts.entity.Bug;

public class BugDao {
	static Map<Long, Bug> bugs = new HashMap<Long, Bug>(); 
	
	public void inserirBug(Bug bug) {
		bug.setId(new Long(bug.hashCode()));
		bugs.put(bug.getId(), bug);
		
	}

	public Bug recupera(Long id) {
		
		return bugs.get(id);
		
	}

}
