package dadosjdbc;

import java.sql.*;

import interfaces.IRepHistoricoEscolar;
import model.*;
import util.*;

public class JDBCRepositoryHistoricoEscolar implements IRepHistoricoEscolar{
	@Override
	public void inserir(HistoricoEscolar e) throws Exception {
		Connection con;
		PreparedStatement stmt;
		String sql = SQLUtil.getProperties().getProperty("sql.historico.inserir");
		try{
			con = JDBCConnectionUtil.getConnection();
			stmt = con.prepareStatement(sql);
			if(e != null){
				stmt.setString(1, e.getMatriculaAluno());
				stmt.setString(2, e.getCodigoDisciplina());
				stmt.setDouble(3, e.getNotaFinal());
				stmt.setDate(4, e.getDataCursada());
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
	public void atualizar(HistoricoEscolar e) throws Exception {
		Connection con;
		PreparedStatement stmt;
		String sql = SQLUtil.getProperties().getProperty("sql.historico.atualizar");
		try{
			con = JDBCConnectionUtil.getConnection();
			stmt = con.prepareStatement(sql);
			if(e != null){
				stmt.setString(1, e.getMatriculaAluno());
				stmt.setString(2, e.getCodigoDisciplina());
				stmt.setDouble(3, e.getNotaFinal());
				stmt.setDate(4, e.getDataCursada());
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
	public void remover(HistoricoEscolar e) throws Exception {
		Connection con;
		PreparedStatement stmt;
		String sql = SQLUtil.getProperties().getProperty("sql.historico.remover");
		try{
			con = JDBCConnectionUtil.getConnection();
			stmt = con.prepareStatement(sql);
			if(e != null){
				stmt.setString(1, e.getMatriculaAluno());
				stmt.setString(2, e.getCodigoDisciplina());
				stmt.executeUpdate();
				stmt.close();
				con.close();
			}
		}catch(SQLException ex){
			throw ex;
		}
	}

	@Override
	public HistoricoEscolar procurar(String key) throws Exception {
		Connection con;
		PreparedStatement stmt;
		ResultSet rs;
		HistoricoEscolar historicoEscolar = null;
		String sql = SQLUtil.getProperties().getProperty("sql.historico.procurar");
		try{
			con = JDBCConnectionUtil.getConnection();
			stmt = con.prepareStatement(sql);
			stmt.setString(1, key);
			rs = stmt.executeQuery();
			rs.next();
			historicoEscolar = new HistoricoEscolar();
			historicoEscolar.setMatriculaAluno(rs.getString("num_matricula"));
			historicoEscolar.setCodigoDisciplina(rs.getString("codigo_disciplina"));
			historicoEscolar.setNotaFinal(rs.getDouble("nota_final"));
			historicoEscolar.setDataCursada(rs.getDate("data_cursada"));
			stmt.close();
			con.close();
		}catch(SQLException ex){
			throw ex;
		}
		return historicoEscolar;
	}

}
