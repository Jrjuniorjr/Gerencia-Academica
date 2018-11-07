package util;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class HibernateUtil {
	private static EntityManagerFactory entityFactory;
	private static EntityManager entity;
	
	static {
		entityFactory = Persistence.createEntityManagerFactory("GerenciaAcademica");
		entity = entityFactory.createEntityManager();
	}

	public static EntityManager getEntityManager() {
		if (entity == null || !entity.isOpen()) {
			entity = entityFactory.createEntityManager();
		}
		return entity;
	}
	

}
