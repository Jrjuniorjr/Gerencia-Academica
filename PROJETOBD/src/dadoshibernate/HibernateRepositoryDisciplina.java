package dadoshibernate;

import javax.persistence.EntityManager;

import interfaces.*;
import model.*;
import util.HibernateUtil;
import util.SQLUtil;

public class HibernateRepositoryDisciplina implements IRepDisciplina{
	@Override
	public void inserir(Disciplina e) throws Exception {
		EntityManager entity = HibernateUtil.getEntityManager();
		entity.getTransaction().begin();
		entity.persist(e);
		entity.getTransaction().commit();
		entity.close();
	}

	@Override
	public void atualizar(Disciplina e) throws Exception {
		// TODO Auto-generated method stub
		EntityManager entity = HibernateUtil.getEntityManager();
		entity.getTransaction().begin();
		entity.merge(e);
		entity.getTransaction().commit();
		entity.close();
	}

	@Override
	public void remover(Disciplina e) throws Exception {
		EntityManager entity = HibernateUtil.getEntityManager();
		entity.getTransaction().begin();
		entity.merge(e);
		entity.getTransaction().commit();
		entity.close();
	}

	@Override
	public Disciplina procurar(String key) throws Exception {
		// TODO Auto-generated method stub
		Disciplina disciplina = null;
		String sql = SQLUtil.getProperties().getProperty("sql.disciplina.procurar");
		EntityManager entity = HibernateUtil.getEntityManager();
		disciplina = entity.createQuery(sql, Disciplina.class).
				setParameter("x", key).
				getSingleResult();
		entity.close();
		return disciplina;

	}
}
