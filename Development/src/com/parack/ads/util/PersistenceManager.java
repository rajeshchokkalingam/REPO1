package com.parack.ads.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.EntityManager;
public class PersistenceManager {   

	public static final boolean DEBUG = true;    
	private static final PersistenceManager singleton = new PersistenceManager();    
	protected EntityManagerFactory emf;    

	public static PersistenceManager getInstance() {        
		return singleton;  
	}    

	private PersistenceManager() {  }   

	public EntityManagerFactory getEntityManagerFactory() {        
		if (emf == null)      
			createEntityManagerFactory();    
		return emf;  
	}    

	public void closeEntityManagerFactory() {        
		if (emf != null) {      
			emf.close();      
			emf = null;      
			if (DEBUG)        
				System.out.println("n*** Persistence finished at " + new java.util.Date());    
		}  
	}    

	protected void createEntityManagerFactory() {        
		this.emf = Persistence.createEntityManagerFactory("Web_JPA");    
		if (DEBUG)      
			System.out.println("n*** Persistence started at " + new java.util.Date());  
	}
	
	public EntityManager getEntityManager() {
		return getEntityManagerFactory().createEntityManager();
	}
	
	public void closeEntityManager(EntityManager em) {
		if (em != null) {
			em.close();
		}
	}

}
