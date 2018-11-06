package dadoshibernate;

import org.hibernate.Session;

import interfaces.IRepDepartamento;
import model.Departamento;
import util.HibernateUtil;

public class HibernateRepositoryDepartamento implements IRepDepartamento{

	@Override
	public void inserir(Departamento e) throws Exception {
		Session sesion = HibernateUtil.getSession();
		sesion.save(e);
		sesion.close();
	}

	@Override
	public void atualizar(Departamento e) throws Exception {
		// TODO Auto-generated method stub
		Session sesion = HibernateUtil.getSession();
		sesion.saveOrUpdate(e);
		sesion.close();
	}

	@Override
	public void remover(Departamento e) throws Exception {
		// TODO Auto-generated method stub
		Session sesion = HibernateUtil.getSession();
		sesion.remove(e);
		sesion.close();
	}

	@Override
	public Departamento procurar(String key) throws Exception {
		// TODO Auto-generated method stub
		Session sesion = HibernateUtil.getSession();
		Departamento d = (Departamento) sesion.get(Departamento.class, key);
		sesion.close();
		return d;
	}

}
