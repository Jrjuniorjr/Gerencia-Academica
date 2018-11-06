package dadoshibernate;

import org.hibernate.Session;

import interfaces.IRepCurso;
import util.HibernateUtil;
import model.*;

public class HibernateRepositoryCurso implements IRepCurso{
	
	@Override
	public void inserir(Curso e) throws Exception {
		Session sesion = HibernateUtil.getSession();
		sesion.save(e);
		sesion.close();
	}

	@Override
	public void atualizar(Curso e) throws Exception {
		// TODO Auto-generated method stub
		Session sesion = HibernateUtil.getSession();
		sesion.saveOrUpdate(e);
		sesion.close();
	}

	@Override
	public void remover(Curso e) throws Exception {
		// TODO Auto-generated method stub
		Session sesion = HibernateUtil.getSession();
		sesion.remove(e);
		sesion.close();
	}

	@Override
	public Curso procurar(String key) throws Exception {
		// TODO Auto-generated method stub
		Session sesion = HibernateUtil.getSession();
		Curso curso = (Curso) sesion.get(Curso.class, key);
		sesion.close();
		return curso;
	}
}
