package util;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.Service;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.spi.SessionFactoryServiceInitiator;
import org.hibernate.service.spi.SessionFactoryServiceRegistryBuilder;



import model.Curso;
import model.Departamento;
import model.Professor;


public class HibernateUtil {
	private static SessionFactory sessionFactory;
	private static Session session;
	static {

		Configuration con = new Configuration();
		
		con.configure();
		
		sessionFactory = con.buildSessionFactory();

		session = sessionFactory.openSession();
	}

	public static Session getSession() {
		if (session == null || !session.isOpen()) {
			session = sessionFactory.openSession();
		}
		return session;
	}

}
