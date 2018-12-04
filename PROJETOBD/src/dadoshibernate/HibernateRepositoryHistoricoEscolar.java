package dadoshibernate;

import javax.persistence.EntityManager;

import interfaces.IRepHistoricoEscolar;
import model.*;
import util.HibernateUtil;
import util.SQLUtil;

public class HibernateRepositoryHistoricoEscolar implements IRepHistoricoEscolar{

	@Override
	public HistoricoEscolar procurarPorId(int id) {
		HistoricoEscolar he = null;
		String sql = SQLUtil.getProperties().getProperty("sql.historico.procurarPorId");
		EntityManager entity = HibernateUtil.getEntityManager();
		he = entity.createQuery(sql, HistoricoEscolar.class).
				setParameter("x", id).
				getSingleResult();
		entity.close();
		return he;
	}

	@Override
	public HistoricoEscolar procurarPorMatricula(Matricula matricula) {
		// TODO Auto-generated method stub
		HistoricoEscolar he = null;
		String sql = SQLUtil.getProperties().getProperty("sql.historico.procurarPorIdMatricula");
		EntityManager entity = HibernateUtil.getEntityManager();
		he = entity.createQuery(sql, HistoricoEscolar.class).
				setParameter("x", matricula.getId()).
				getSingleResult();
		entity.close();
		return he;
	}

	@Override
	public HistoricoEscolar procurarPorDisciplina(Disciplina disciplina) {
		// TODO Auto-generated method stub
		HistoricoEscolar he = null;
		String sql = SQLUtil.getProperties().getProperty("sql.historico.procurarPorIdDisciplina");
		EntityManager entity = HibernateUtil.getEntityManager();
		he = entity.createQuery(sql, HistoricoEscolar.class).
				setParameter("x", disciplina.getId()).
				getSingleResult();
		entity.close();
		return he;
	}
	
}
