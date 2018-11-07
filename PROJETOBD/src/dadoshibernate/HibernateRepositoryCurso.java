package dadoshibernate;

import javax.persistence.EntityManager;

import org.hibernate.Session;

import interfaces.IRepCurso;
import util.HibernateUtil;
import model.*;

public class HibernateRepositoryCurso implements IRepCurso{
	
	@Override
	public void inserir(Curso e) throws Exception {
		EntityManager entity = HibernateUtil.getEntityManager();
		entity.getTransaction().begin();
		entity.persist(e);
		entity.getTransaction().commit();
		entity.close();
	}

	@Override
	public void atualizar(Curso e) throws Exception {
		// TODO Auto-generated method stub
		EntityManager entity = HibernateUtil.getEntityManager();
		entity.getTransaction().begin();
		entity.merge(e);
		entity.getTransaction().commit();
		entity.close();
	}

	@Override
	public void remover(Curso e) throws Exception {
		EntityManager entity = HibernateUtil.getEntityManager();
		entity.getTransaction().begin();
		entity.merge(e);
		entity.getTransaction().commit();
		entity.close();
	}

	@Override
	public Curso procurar(String key) throws Exception {
		// TODO Auto-generated method stub
		Curso curso = null;
		EntityManager entity = HibernateUtil.getEntityManager();
		curso = entity.find(Curso.class, key);
		entity.close();
		return curso;

	}
}
