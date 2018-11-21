package dadosjdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import interfaces.*;
import model.*;
import util.JDBCConnectionUtil;
import util.SQLUtil;

public class JDBCRepositoryDisciplinasPeriodoAtual implements IRepDisciplinasPeriodoAtual{
	@Override
	public void inserir(DisciplinasPeriodoAtual e) throws Exception {
		Connection con;
		PreparedStatement stmt;
		String sql = SQLUtil.getProperties().getProperty("sql.cursando.inserir");
		try{
			con = JDBCConnectionUtil.getConnection();
			stmt = con.prepareStatement(sql);
			if(e != null){
				stmt.setInt(1, e.getIdMatricula());
				stmt.setInt(2, e.getIdDisciplina());
				stmt.setDouble(3, e.getPrimeiroGQ());
				stmt.setDouble(4, e.getSegundoGQ());
				//stmt.setString(4, e.getDepartamento().getCodigo());
				stmt.executeUpdate();
				stmt.close();
				con.close();
			}
		}catch(SQLException ex){
			throw ex;
		}
	}

	@Override
	public void atualizar(DisciplinasPeriodoAtual e) throws Exception {
		Connection con;
		PreparedStatement stmt;
		String sql = SQLUtil.getProperties().getProperty("sql.cursando.atualizar");
		try{
			con = JDBCConnectionUtil.getConnection();
			stmt = con.prepareStatement(sql);
			if(e != null){
				stmt.setInt(1, e.getIdMatricula());
				stmt.setInt(2, e.getIdDisciplina());
				stmt.setDouble(3, e.getPrimeiroGQ());
				stmt.setDouble(4, e.getSegundoGQ());
				//stmt.setString(4, e.getDepartamento().getCodigo());
				stmt.executeUpdate();
				stmt.close();
				con.close();
			}
		}catch(SQLException ex){
			throw ex;
		}
	}

	@Override
	public void remover(DisciplinasPeriodoAtual e) throws Exception {
		Connection con;
		PreparedStatement stmt;
		String sql = SQLUtil.getProperties().getProperty("sql.cursando.remover");
		try{
			con = JDBCConnectionUtil.getConnection();
			stmt = con.prepareStatement(sql);
			if(e != null){
				stmt.setInt(1, e.getIdMatricula());
				stmt.setInt(2, e.getIdDisciplina());
				stmt.executeUpdate();
				stmt.close();
				con.close();
			}
		}catch(SQLException ex){
			throw ex;
		}
	}

	@Override
	public DisciplinasPeriodoAtual procurar(String key) throws Exception {
		Connection con;
		PreparedStatement stmt;
		ResultSet rs;
		DisciplinasPeriodoAtual disciplinasPeriodoAtual = null;
		String sql = SQLUtil.getProperties().getProperty("sql.cursando.procurar");
		try{
			con = JDBCConnectionUtil.getConnection();
			stmt = con.prepareStatement(sql);
			stmt.setString(1, key);
			rs = stmt.executeQuery();
			rs.next();
			disciplinasPeriodoAtual = new DisciplinasPeriodoAtual();
			disciplinasPeriodoAtual.setIdMatricula(rs.getInt("idMatricula"));
			disciplinasPeriodoAtual.setIdDisciplina(rs.getInt("idDisciplina"));
			disciplinasPeriodoAtual.setPrimeiroGQ(rs.getDouble("primeiroGQ"));
			disciplinasPeriodoAtual.setSegundoGQ(rs.getDouble("segundoGQ"));
			
			stmt.close();
			con.close();
		}catch(SQLException ex){
			throw ex;
		}
		return disciplinasPeriodoAtual;
	}

}
