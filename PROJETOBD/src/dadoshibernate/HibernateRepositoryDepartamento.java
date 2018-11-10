package dadoshibernate;

import util.*;
import javax.persistence.EntityManager;
import org.hibernate.*;
import model.*;
import util.HibernateUtil;
import util.SQLUtil;
import interfaces.*;
public class HibernateRepositoryDepartamento implements IRepDepartamento{

	@Override
	public void inserir(Departamento e) throws Exception {
		EntityManager entity = HibernateUtil.getEntityManager();
		entity.getTransaction().begin();
		entity.persist(e);
		entity.getTransaction().commit();
		entity.close();
	}

	@Override
	public void atualizar(Departamento e) throws Exception {
		// TODO Auto-generated method stub
		EntityManager entity = HibernateUtil.getEntityManager();
		entity.getTransaction().begin();
//		Departamento d = entity.find(Departamento.class, e.getId());
		entity.merge(e);
		entity.flush();
		//entity.unwrap(Session.class).update(e);
		entity.getTransaction().commit();
		entity.close();
	}

	@Override
	public void remover(Departamento e) throws Exception {
		EntityManager entity = HibernateUtil.getEntityManager();
		entity.getTransaction().begin();
		entity.merge(e);
		entity.getTransaction().commit();
		entity.close();
	}

	@Override
	public Departamento procurar(String key) throws Exception {
		// TODO Auto-generated method stub
		String sql = SQLUtil.getProperties().getProperty("sql.departamento.procurar");
		Departamento departamento = null;
		EntityManager entity = HibernateUtil.getEntityManager();
		departamento = entity.createQuery(sql, Departamento.class).
				setParameter("x", key).
				getSingleResult();
		entity.close();
		return departamento;

	}

}
