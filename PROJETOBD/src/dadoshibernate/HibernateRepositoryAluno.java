package dadoshibernate;

import javax.persistence.EntityManager;

import model.*;
import util.HibernateUtil;
import interfaces.*;

public class HibernateRepositoryAluno implements IRepAluno{
	@Override
	public void inserir(Aluno e) throws Exception {
		EntityManager entity = HibernateUtil.getEntityManager();
		entity.getTransaction().begin();
		entity.persist(e);
		entity.getTransaction().commit();
		entity.close();
	}

	@Override
	public void atualizar(Aluno e) throws Exception {
		// TODO Auto-generated method stub
		EntityManager entity = HibernateUtil.getEntityManager();
		entity.getTransaction().begin();
		entity.merge(e);
		entity.getTransaction().commit();
		entity.close();
	}

	@Override
	public void remover(Aluno e) throws Exception {
		EntityManager entity = HibernateUtil.getEntityManager();
		entity.getTransaction().begin();
		entity.merge(e);
		entity.getTransaction().commit();
		entity.close();
	}

	@Override
	public Aluno procurar(String key) throws Exception {
		// TODO Auto-generated method stub
		Aluno aluno = null;
		EntityManager entity = HibernateUtil.getEntityManager();
		aluno = entity.find(Aluno.class, key);
		entity.close();
		return aluno;

	}
}