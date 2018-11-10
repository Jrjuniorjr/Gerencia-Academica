package dadoshibernate;

import javax.persistence.EntityManager;

import model.*;
import util.HibernateUtil;
import util.SQLUtil;
import interfaces.*;

public class HibernateRepositoryMatricula implements IRepMatricula{

	@Override
	public void inserir(Matricula e) throws Exception {
		EntityManager entity = HibernateUtil.getEntityManager();
		entity.getTransaction().begin();
		entity.persist(e);
		entity.getTransaction().commit();
		entity.close();
	}

	@Override
	public void atualizar(Matricula e) throws Exception {
		// TODO Auto-generated method stub
		EntityManager entity = HibernateUtil.getEntityManager();
		entity.getTransaction().begin();
		entity.merge(e);
		entity.getTransaction().commit();
		entity.close();
	}

	@Override
	public void remover(Matricula e) throws Exception {
		EntityManager entity = HibernateUtil.getEntityManager();
		entity.getTransaction().begin();
		entity.merge(e);
		entity.getTransaction().commit();
		entity.close();
	}

	@Override
	public Matricula procurar(String key) throws Exception {
		// TODO Auto-generated method stub
		Matricula matricula = null;
		String sql = SQLUtil.getProperties().getProperty("sql.matricula.procurar");
		EntityManager entity = HibernateUtil.getEntityManager();
		matricula = entity.createQuery(sql, Matricula.class).
				setParameter("x", key).
				getSingleResult();
		entity.close();
		return matricula;

	}
}
