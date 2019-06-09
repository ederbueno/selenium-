package br.com.americanas.massadados;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import br.com.americanas.contexto.ContextoAmericanas;

public class ConexaoSqlLite {
	
	public static Connection conexao;

	public static boolean conectar() throws ClassNotFoundException {
		try {
			Class.forName("org.sqlite.JDBC");
			
                conexao = DriverManager.getConnection(ContextoAmericanas.URLBANCO);

		} catch (SQLException e) {
			System.err.println(e.getMessage());
			return false;
		}
		System.out.println("Conectado com o Banco");
		return true;
	}

	public static boolean desconectar() {

		try {

			if (conexao.isClosed() == false)
				conexao.close();

		} catch (SQLException e) {
			System.err.println(e.getMessage());
			return false;

		}
		System.out.println("Desconectado com o Banco");
		return true;

	}


}
