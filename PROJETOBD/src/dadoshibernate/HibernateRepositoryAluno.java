package dadoshibernate;

import javax.persistence.EntityManager;

import model.*;
import util.HibernateUtil;
import util.SQLUtil;
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
		String sql = SQLUtil.getProperties().getProperty("sql.aluno.procurar");
		EntityManager entity = HibernateUtil.getEntityManager();
		aluno = entity.createQuery(sql, Aluno.class).
				setParameter("x", key).
				getSingleResult();
		entity.close();
		return aluno;

	}
}
