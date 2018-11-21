package dadoshibernate;

import javax.persistence.EntityManager;

import org.hibernate.Session;

import interfaces.IRepCurso;
import util.HibernateUtil;
import util.SQLUtil;
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
		entity.remove(e);
		entity.getTransaction().commit();
		entity.close();
	}

	@Override
	public Curso procurar(String key) throws Exception {
		// TODO Auto-generated method stub
		String sql = SQLUtil.getProperties().getProperty("sql.curso.procurar");
		Curso curso = null;
		EntityManager entity = HibernateUtil.getEntityManager();
		curso = entity.createQuery(sql, Curso.class).setParameter("x", key).getSingleResult();
		entity.close();
		return curso;

	}
}
