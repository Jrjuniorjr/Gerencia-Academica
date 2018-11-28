package storedproceduresandfunctions;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import util.JDBCConnectionUtil;
import util.SQLUtil;

public class StoredProceduresAndFunctions {
	public void makeAtaPresenca(int idDisciplina){
		Connection con;
		CallableStatement stmt;
		String sql = SQLUtil.getProperties().getProperty("sql.storedProcedure.makeAtaPresenca");
		try {
			try {
				con = JDBCConnectionUtil.getConnection();
				stmt = con.prepareCall(sql);
				stmt.setInt(1, idDisciplina);
				ResultSet rs = stmt.executeQuery();
				while(rs.next()){
					System.out.println("Numero de matricula" + rs.getString("numeroMatricula"));
					System.out.println("Nome: " + rs.getString("nome"));
					System.out.println("Sobrenome: " + rs.getString("sobrenome"));
					System.out.println("Primeiro GQ: " + rs.getDouble("primeiroGQ"));
					System.out.println("Segundo GQ: " + rs.getDouble("segundoGQ"));
					System.out.println("--------------------------------------------");
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
}
