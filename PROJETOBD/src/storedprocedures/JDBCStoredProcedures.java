package storedprocedures;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import interfaces.IStoredProcedures;
import model.*;
import util.JDBCConnectionUtil;
import util.SQLUtil;

public class JDBCStoredProcedures implements IStoredProcedures {

	public void makeAtaPresenca(Disciplina disciplina) {
		Connection con;
		CallableStatement stmt;
		String sql = SQLUtil.getProperties().getProperty("sql.storedProcedure.makeAtaPresenca");
		try {
			try {
				con = JDBCConnectionUtil.getConnection();
				stmt = con.prepareCall(sql);
				stmt.setInt(1, disciplina.getId());
				ResultSet rs = stmt.executeQuery();
				while (rs.next()) {
					System.out.println("Numero de matricula" + rs.getString("numeroMatricula") + " ------ " + "Nome: "
							+ rs.getString("nome") + " ------ " + "Sobrenome: " + rs.getString("sobrenome") + " ------ "
							+ "Primeiro GQ: " + rs.getDouble("primeiroGQ") + " ------ " + "Segundo GQ: "
							+ rs.getDouble("segundoGQ"));
				}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void alterarNotaManeiraSegura(DisciplinasPeriodoAtual disciplinasPeriodoAtual) {
		// TODO Auto-generated method stub
		Connection con;
		CallableStatement stmt;
		String sql = SQLUtil.getProperties().getProperty("sql.storedProcedure.alterarNotaManeiraSegura");
		try {
			try {
				con = JDBCConnectionUtil.getConnection();
				stmt = con.prepareCall(sql);
				stmt.setInt(1, disciplinasPeriodoAtual.getId());
				stmt.setDouble(1, disciplinasPeriodoAtual.getPrimeiroGQ());
				stmt.setDouble(1, disciplinasPeriodoAtual.getSegundoGQ());
				stmt.execute();
				stmt.close();
				con.close();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void demitirProfessor(Professor professor) {
		// TODO Auto-generated method stub
		Connection con;
		CallableStatement stmt;
		String sql = SQLUtil.getProperties().getProperty("sql.storedProcedure.demitirProfessor");
		try {
			try {
				con = JDBCConnectionUtil.getConnection();
				stmt = con.prepareCall(sql);
				stmt.setInt(1, professor.getId());
				stmt.execute();
				stmt.close();
				con.close();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	@Override
	public void inserirDisciplinaObrigatoriaRecalcularCreditosCurso(Disciplina disciplina, Curso curso){
		// TODO Auto-generated method stub
				Connection con;
				CallableStatement stmt;
				String sql = SQLUtil.getProperties().getProperty("sql.storedProcedure.inserirDisciplinaObrigatoriaRecalcularCreditosCurso");
				try {
					try {
						con = JDBCConnectionUtil.getConnection();
						stmt = con.prepareCall(sql);
						stmt.setInt(1, disciplina.getId());
						stmt.setInt(1, curso.getId());
						stmt.execute();
						stmt.close();
						con.close();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}
	
	@Override
	public void cursandoParaHistorico(){
		Connection con;
		CallableStatement stmt;
		String sql = SQLUtil.getProperties().getProperty("sql.storedProcedure.cursandoParaHistorico");
		try {
			try {
				con = JDBCConnectionUtil.getConnection();
				stmt = con.prepareCall(sql);
				stmt.execute();
				stmt.close();
				con.close();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
