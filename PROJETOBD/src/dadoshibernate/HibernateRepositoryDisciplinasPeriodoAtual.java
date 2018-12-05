package dadoshibernate;

import javax.persistence.EntityManager;

import interfaces.IRepDisciplinasPeriodoAtual;
import model.*;
import util.HibernateUtil;
import util.SQLUtil;

public class HibernateRepositoryDisciplinasPeriodoAtual implements IRepDisciplinasPeriodoAtual{

	@Override
	public void inserir(DisciplinasPeriodoAtual disciplinasPeriodoAtual) {
		EntityManager entity = HibernateUtil.getEntityManager();
		entity.getTransaction().begin();
		entity.persist(disciplinasPeriodoAtual);
		entity.getTransaction().commit();
		entity.close();
		
	}

	@Override
	public void atualizar(DisciplinasPeriodoAtual disciplinasPeriodoAtual) {
		EntityManager entity = HibernateUtil.getEntityManager();
		entity.getTransaction().begin();
		entity.merge(disciplinasPeriodoAtual);
		entity.getTransaction().commit();
		entity.close();
	}

	@Override
	public void remover(DisciplinasPeriodoAtual disciplinasPeriodoAtual) {
		EntityManager entity = HibernateUtil.getEntityManager();
		entity.getTransaction().begin();
		entity.remove(disciplinasPeriodoAtual);
		entity.getTransaction().commit();
		entity.close();
	}

	@Override
	public DisciplinasPeriodoAtual procurarPorId(int id) {
		// TODO Auto-generated method stub
		DisciplinasPeriodoAtual dpa = null;
		String sql = SQLUtil.getProperties().getProperty("sql.cursando.procurarPorId");
		EntityManager entity = HibernateUtil.getEntityManager();
		dpa = entity.createQuery(sql, DisciplinasPeriodoAtual.class).
				setParameter("x", id).
				getSingleResult();
		entity.close();
		return dpa;
	}

	@Override
	public DisciplinasPeriodoAtual procurarPorMatricula(Matricula matricula) {
		// TODO Auto-generated method stub
		DisciplinasPeriodoAtual dpa = null;
		String sql = SQLUtil.getProperties().getProperty("sql.cursando.procurarPorIdMatricula");
		EntityManager entity = HibernateUtil.getEntityManager();
		dpa = entity.createQuery(sql, DisciplinasPeriodoAtual.class).
				setParameter("x", matricula.getId()).
				getSingleResult();
		entity.close();
		return dpa;
	}

	@Override
	public DisciplinasPeriodoAtual procurarPorDisciplina(Disciplina disciplina) {
		// TODO Auto-generated method stub
		DisciplinasPeriodoAtual dpa = null;
		String sql = SQLUtil.getProperties().getProperty("sql.cursando.procurarPorIdDisciplina");
		EntityManager entity = HibernateUtil.getEntityManager();
		dpa = entity.createQuery(sql, DisciplinasPeriodoAtual.class).
				setParameter("x", disciplina.getId()).
				getSingleResult();
		entity.close();
		return dpa;
	}

}
