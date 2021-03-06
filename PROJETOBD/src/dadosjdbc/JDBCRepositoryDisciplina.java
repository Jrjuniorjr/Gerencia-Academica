package dadosjdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import interfaces.IRepDisciplina;
import model.Curso;
import model.Departamento;
import model.Disciplina;
import util.JDBCConnectionUtil;
import util.SQLUtil;

/*public class JDBCRepositoryDisciplina implements IRepDisciplina{

	@Override
	public void inserir(Disciplina e) throws Exception {
		Connection con;
		PreparedStatement stmt;
		String sql = SQLUtil.getProperties().getProperty("sql.disciplina.inserir");
		try{
			con = JDBCConnectionUtil.getConnection();
			stmt = con.prepareStatement(sql);
			if(e != null){
				stmt.setString(1, e.getCodigo());
				stmt.setString(2, e.getNomeCurso());
				stmt.setInt(3, e.getNumeroCreditoConclusao());
				stmt.setString(4, e.getCodigoDepartamento());
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
	public void atualizar(Disciplina e) throws Exception {
		Connection con;
		PreparedStatement stmt;
		String sql = SQLUtil.getProperties().getProperty("sql.disciplina.atualizar");
		try{
			con = JDBCConnectionUtil.getConnection();
			stmt = con.prepareStatement(sql);
			if(e != null){
				stmt.setString(1, e.getCodigo());
				stmt.setString(2, e);
				stmt.setInt(3, e.getNumeroCreditoConclusao());
				stmt.setString(4, e.getCodigoDepartamento());
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
	public void remover(Disciplina e) throws Exception {
		Connection con;
		PreparedStatement stmt;
		String sql = SQLUtil.getProperties().getProperty("sql.disciplina.remover");
		try{
			con = JDBCConnectionUtil.getConnection();
			stmt = con.prepareStatement(sql);
			if(e != null){
				stmt.setString(1, e.getCodigo());
				stmt.executeUpdate();
				stmt.close();
				con.close();
			}
		}catch(SQLException ex){
			throw ex;
		}
	}

	@Override
	public Disciplina procurar(String key) throws Exception {
		Connection con;
		PreparedStatement stmt;
		ResultSet rs;
		Curso curso = null;
		String sql = SQLUtil.getProperties().getProperty("sql.curso.procurar");
		try{
			con = JDBCConnectionUtil.getConnection();
			stmt = con.prepareStatement(sql);
			stmt.setString(1, key);
			rs = stmt.executeQuery();
			rs.next();
			curso = new Curso();
			curso.setCodigo(rs.getString("codigo"));
			curso.setNomeCurso(rs.getString("nome_curso"));
			curso.setNumeroCreditoConclusao(rs.getInt("num_credito_conclusao"));
			//curso.setDepartamento(procurarDepartamento(rs.getString("codigo_departamento")));
			curso.setCodigoDepartamento(rs.getString("codigo_departamento"));
			stmt.close();
			con.close();
		}catch(SQLException ex){
			throw ex;
		}
		return curso;
	}
	private Departamento procurarCoisa(String key) throws Exception{
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
			}
		}catch(SQLException ex){
			throw ex;
		}catch(ClassNotFoundException ex){
			throw ex;
		}
		return departamento;
	}*/