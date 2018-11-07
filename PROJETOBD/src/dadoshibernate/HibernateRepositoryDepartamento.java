package dadoshibernate;

import javax.persistence.EntityManager;

import model.*;
import util.HibernateUtil;

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
		entity.merge(e);
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
		Departamento departamento = null;
		EntityManager entity = HibernateUtil.getEntityManager();
		departamento = entity.find(Departamento.class, key);
		entity.close();
		return departamento;

	}

}
