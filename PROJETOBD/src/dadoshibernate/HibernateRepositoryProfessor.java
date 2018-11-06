package dadoshibernate;

import org.hibernate.Session;

import interfaces.IRepProfessor;
import model.Departamento;
import util.HibernateUtil;
import model.*;

public class HibernateRepositoryProfessor implements IRepProfessor{
	
	@Override
	public void inserir(Professor e) throws Exception {
		Session sesion = HibernateUtil.getSession();
		sesion.save(e);
		sesion.close();
	}

	@Override
	public void atualizar(Professor e) throws Exception {
		// TODO Auto-generated method stub
		Session sesion = HibernateUtil.getSession();
		sesion.saveOrUpdate(e);
		sesion.close();
	}

	@Override
	public void remover(Professor e) throws Exception {
		// TODO Auto-generated method stub
		Session sesion = HibernateUtil.getSession();
		sesion.remove(e);
		sesion.close();
	}

	@Override
	public Professor procurar(String key) throws Exception {
		// TODO Auto-generated method stub
		Session sesion = HibernateUtil.getSession();
		Professor p = (Professor) sesion.get(Professor.class, key);
		sesion.close();
		return p;
	}

}
