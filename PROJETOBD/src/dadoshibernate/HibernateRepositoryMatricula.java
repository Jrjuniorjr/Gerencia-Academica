package dadoshibernate;

import javax.persistence.EntityManager;

import model.*;
import util.HibernateUtil;
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
		EntityManager entity = HibernateUtil.getEntityManager();
		matricula = entity.find(Matricula.class, key);
		entity.close();
		return matricula;

	}
}
