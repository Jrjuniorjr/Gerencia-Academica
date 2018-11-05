package dados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import interfaces.IRepCurso;
import model.Curso;
import model.Departamento;
import model.Professor;
import util.JDBCConnectionUtil;
import util.SQLUtil;

public class JDBCRepositoryCurso implements IRepCurso{

	@Override
	public void inserir(Curso e) throws Exception {
		Connection con;
		PreparedStatement stmt;
		String sql = SQLUtil.getProperties().getProperty("sql.curso.inserir");
		try{
			con = JDBCConnectionUtil.getConnection();
			stmt = con.prepareStatement(sql);
			if(e != null){
				stmt.setString(1, e.getCodigo());
				stmt.setString(2, e.getNomeCurso());
				stmt.setInt(3, e.getNumeroCreditoConclusao());
				stmt.setString(4, e.getDepartamento().getCodigo());
				stmt.executeUpdate();
				stmt.close();
				con.close();
			}
		}catch(SQLException ex){
			throw ex;
		}
	}

	@Override
	public void atualizar(Curso e) throws Exception {
		Connection con;
		PreparedStatement stmt;
		String sql = SQLUtil.getProperties().getProperty("sql.curso.atualizar");
		try{
			con = JDBCConnectionUtil.getConnection();
			stmt = con.prepareStatement(sql);
			if(e != null){
				stmt.setString(1, e.getCodigo());
				stmt.setString(2, e.getNomeCurso());
				stmt.setInt(3, e.getNumeroCreditoConclusao());
				stmt.setString(4, e.getDepartamento().getCodigo());
				stmt.executeUpdate();
				stmt.close();
				con.close();
			}
		}catch(SQLException ex){
			throw ex;
		}
	}

	@Override
	public void remover(Curso e) throws Exception {
		Connection con;
		PreparedStatement stmt;
		String sql = SQLUtil.getProperties().getProperty("sql.curso.remover");
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
	public Curso procurar(String key) throws Exception {
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
			curso.setDepartamento(procurarDepartamento(rs.getString("codigo_departamento")));
			stmt.close();
			con.close();
		}catch(SQLException ex){
			throw ex;
		}
		return curso;
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
			}
		}catch(SQLException ex){
			throw ex;
		}catch(ClassNotFoundException ex){
			throw ex;
		}
		return departamento;
	}
}
