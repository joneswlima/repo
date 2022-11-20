import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConexaoPSQL {

	private String url;
	private String user;
	private String pass;
	private Connection conn;

	ConexaoPSQL(){
		url = "jdbc:postgresql://localhost:5432/pdv";
		user = "pdv";
		pass = "pdv2002";

		try {
			Class.forName("org.postgresql.Driver");
			conn = DriverManager.getConnection(url,user,pass);
			System.out.println("ESSA CONEXÃO É A BOA!");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("DEU FALHA NA CONEXÃO LOKO!");
		}


	}
	 public int executaSQL(String sql) {
		 try {
			Statement stm = conn.createStatement();
			int resultadoSQL = stm.executeUpdate(sql);
			conn.close();
			System.out.println("CRIADO COM SUCESSO LOKO");
			return resultadoSQL;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("FALHA NA EXECUÇÃO SQL LOKO");
			return 0;
		}
	 }
	
}


