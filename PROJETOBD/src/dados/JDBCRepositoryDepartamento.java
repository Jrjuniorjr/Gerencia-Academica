package dados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import interfaces.IRepDepartamento;
import model.*;
import util.JDBCConnectionUtil;
import util.SQLUtil;

public class JDBCRepositoryDepartamento implements IRepDepartamento{

	@Override
	public void inserir(Departamento e) throws Exception {
		Connection con;
		PreparedStatement stmt;
		String sql = SQLUtil.getProperties().getProperty("sql.departamento.inserir");
		try{
			con = JDBCConnectionUtil.getConnection();
			stmt = con.prepareStatement(sql);
			if(e != null){
				stmt.setString(1, e.getCodigo());
				stmt.setString(2,e.getNome());
				/////stmt.(3, e.getBloco());
				stmt.executeUpdate();
				stmt.close();
				con.close();
			}
		}catch(SQLException ex){
			throw ex;
		}
	}

	@Override
	public void atualizar(Departamento e) throws Exception {
		Connection con;
		PreparedStatement stmt;
		String sql = SQLUtil.getProperties().getProperty("sql.departamento.atualizar");
		try{
			con = JDBCConnectionUtil.getConnection();
			stmt = con.prepareStatement(sql);
			if(e != null){
				stmt.setString(1, e.getCodigo());
				stmt.setString(2, e.getNome());
				/////stmt.setInt(3, e.getBloco());
				stmt.executeUpdate();
				stmt.close();
				con.close();
			}
		}catch(SQLException ex){
			throw ex;
		}
	}

	@Override
	public void remover(Departamento e) throws Exception {
		Connection con;
		PreparedStatement stmt;
		String sql = SQLUtil.getProperties().getProperty("sql.departamento.remover");
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
	public Departamento procurar(String key) throws Exception {
		Connection con;
		PreparedStatement stmt;
		ResultSet rs;
		Departamento departamento = null;
		String sql = SQLUtil.getProperties().getProperty("sql.departamento.procurar");
		try{
			con = JDBCConnectionUtil.getConnection();
			stmt = con.prepareStatement(sql);
			stmt.setString(1, key);
			rs = stmt.executeQuery();
			rs.next();
			departamento = new Departamento();
			departamento.setCodigo(rs.getString("codigo"));
			departamento.setNome(rs.getString("nome"));
			////departamento.setBloco(rs.getString(columnIndex));
			departamento.setProfessores(procurarProfessores(departamento.getCodigo()));
			departamento.setCursos(procurarCursos(departamento.getCodigo()));
			//falta disciplina
			stmt.close();
			con.close();
		}catch(SQLException ex){
			throw ex;
		}
		return departamento;
	}

	private ArrayList<Professor> procurarProfessores(String key) throws Exception{
		Connection con;
		PreparedStatement stmt;
		ResultSet rs;
		String sql = SQLUtil.getProperties().getProperty("sql.departamento.professores.procurar");
		ArrayList<Professor> professores = null;
		try{
			if(key != null){
			con = JDBCConnectionUtil.getConnection();
			stmt = con.prepareStatement(sql);
			stmt.setString(1, key);
			rs = stmt.executeQuery();
			professores = new ArrayList<>();
			while(rs.next()){
				professores.add(new Professor(rs.getString("matricula_prof"),
						rs.getString("CFE"),
						rs.getString("Nome"), rs.getString("Sobrenome"),
						rs.getString("codigo_departamento")));
			}
			
			}
		}catch(SQLException ex){
			throw ex;
		}catch(ClassNotFoundException ex){
			throw ex;
		}
		return professores;
	}
	
	private ArrayList<Curso> procurarCursos(String key) throws Exception{
		Connection con;
		PreparedStatement stmt;
		ResultSet rs;
		String sql = SQLUtil.getProperties().getProperty("sql.departamento.cursos.procurar");
		ArrayList<Curso> cursos = null;
		try{
			if(key != null){
			con = JDBCConnectionUtil.getConnection();
			stmt = con.prepareStatement(sql);
			stmt.setString(1, key);
			rs = stmt.executeQuery();
			cursos = new ArrayList<>();
			while(rs.next()){
				cursos.add(new Curso(rs.getString("codigo"), 
						rs.getString("nome_curso"),
						rs.getInt("num_credito_conclusao"),
						rs.getString("codigo_departamento")));
			}
			
			}
		}catch(SQLException ex){
			throw ex;
		}catch(ClassNotFoundException ex){
			throw ex;
		}
		return cursos;
	}

}
