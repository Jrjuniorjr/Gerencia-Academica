package dados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import interfaces.IRepProfessor;
import model.Departamento;
import model.Professor;
import util.JDBCConnectionUtil;
import util.SQLUtil;

public class JDBCRepositoryProfessor implements IRepProfessor{
	
	@Override
	public void inserir(Professor e) throws Exception {
		Connection con;
		PreparedStatement stmt;
		String sql = SQLUtil.getProperties().getProperty("sql.professor.inserir");
		try{
			con = JDBCConnectionUtil.getConnection();
			stmt = con.prepareStatement(sql);
			if(e != null){
				stmt.setString(1, e.getMatricula());
				stmt.setString(2, e.getCfe());
				stmt.setString(3, e.getNome());
				stmt.setString(4, e.getSobrenome());
				stmt.setString(5, e.getDepartamento().getCodigo());
				stmt.executeUpdate();
				stmt.close();
				con.close();
			}
		}catch(SQLException ex){
			throw ex;
		}
	}

	@Override
	public void atualizar(Professor e) throws Exception {
		Connection con;
		PreparedStatement stmt;
		String sql = SQLUtil.getProperties().getProperty("sql.professor.atualizar");
		try{
			con = JDBCConnectionUtil.getConnection();
			stmt = con.prepareStatement(sql);
			if(e != null){
				stmt.setString(1, e.getMatricula());
				stmt.setString(2, e.getCfe());
				stmt.setString(3, e.getNome());
				stmt.setString(4, e.getSobrenome());
				stmt.setString(5, e.getDepartamento().getCodigo());
				stmt.executeUpdate();
				stmt.close();
				con.close();
			}
		}catch(SQLException ex){
			throw ex;
		}
	}

	@Override
	public void remover(Professor e) throws Exception {
		Connection con;
		PreparedStatement stmt;
		String sql = SQLUtil.getProperties().getProperty("sql.professor.remover");
		try{
			con = JDBCConnectionUtil.getConnection();
			stmt = con.prepareStatement(sql);
			if(e != null){
				stmt.setString(1, e.getMatricula());
				stmt.executeUpdate();
				stmt.close();
				con.close();
			}
		}catch(SQLException ex){
			throw ex;
		}
	}

	@Override
	public Professor procurar(String key) throws Exception {
		Connection con;
		PreparedStatement stmt;
		ResultSet rs;
		Professor professor = null;
		String sql = SQLUtil.getProperties().getProperty("sql.professor.procurar");
		try{
			con = JDBCConnectionUtil.getConnection();
			stmt = con.prepareStatement(sql);
			stmt.setString(1, key);
			rs = stmt.executeQuery();
			rs.next();
			professor = new Professor();
			professor.setMatricula(rs.getString("matricula_prof"));
			professor.setCfe(rs.getString("CFE"));
			professor.setNome(rs.getString("Nome"));
			professor.setSobrenome(rs.getString("Sobrenome"));
			professor.setDepartamento(procurarDepartamento(rs.getString("codigo_departamento")));
			rs.close();
			stmt.close();
			con.close();
		}catch(SQLException ex){
			throw ex;
		}
		return professor;
	}

	private Departamento procurarDepartamento(String key) throws Exception{
		Connection con;
		PreparedStatement stmt;
		ResultSet rs;
		Departamento departamento = null;
		String sql = SQLUtil.getProperties().getProperty("sql.departamento.procurar");
		try{
			if(key != null){
			con = JDBCConnectionUtil.getConnection();
			stmt = con.prepareStatement(sql);
			stmt.setString(1, key);
			rs = stmt.executeQuery();
			rs.next();
			departamento = new Departamento();
			departamento.setCodigo(rs.getString("codigo"));
			departamento.setNome(rs.getString("nome"));
			departamento.setBloco(rs.getString("bloco").charAt(0));
			rs.close();
			stmt.close();
			con.close();
			}
		}catch(SQLException ex){
			throw ex;
		}catch(ClassNotFoundException ex){
			throw ex;
		}
		return departamento;
	}
}
