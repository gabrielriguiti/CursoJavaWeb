package br.com.SistemaLogin.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CriarConexao {

	public static Connection getConexao() throws SQLException{
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Conectado");
			
			return DriverManager.getConnection("jdbc:mysql://localhost/sistemalogin?useTimezone=true&serverTimezone=UTC&useSSL=false", "root", "tecsis");
		
		} catch (ClassNotFoundException e) {
			
			throw new SQLException(e);
		
		} catch (SQLException e1) {
			
			throw new SQLException(e1);
		}
		
	}
}
