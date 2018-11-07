package dadoshibernate;

import javax.persistence.EntityManager;

import model.*;
import util.HibernateUtil;

import interfaces.*;

public class HibernateRepositoryProfessor implements IRepProfessor{
	
	@Override
	public void inserir(Professor e) throws Exception {
		EntityManager entity = HibernateUtil.getEntityManager();
		entity.getTransaction().begin();
		entity.persist(e);
		entity.getTransaction().commit();
		entity.close();
	}

	@Override
	public void atualizar(Professor e) throws Exception {
		// TODO Auto-generated method stub
		EntityManager entity = HibernateUtil.getEntityManager();
		entity.getTransaction().begin();
		entity.merge(e);
		entity.getTransaction().commit();
		entity.close();
	}

	@Override
	public void remover(Professor e) throws Exception {
		EntityManager entity = HibernateUtil.getEntityManager();
		entity.getTransaction().begin();
		entity.merge(e);
		entity.getTransaction().commit();
		entity.close();
	}

	@Override
	public Professor procurar(String key) throws Exception {
		// TODO Auto-generated method stub
		Professor professor = null;
		EntityManager entity = HibernateUtil.getEntityManager();
		professor = entity.find(Professor.class, key);
		entity.close();
		return professor;
	}

}
