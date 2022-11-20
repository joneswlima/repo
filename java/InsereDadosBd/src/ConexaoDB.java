import java.sql.*;

public 

String url = "jdbc:postgresql://localhost:5432/pdv";
String usuario = "pdv";
String senha = "pdv2002";
try {
    Class.forName("org.postgresql.Driver");
    Connection conexao = DriverManager.getConnection(url, usuario, senha);
} catch (ClassNotFoundException e) {
    // Erro caso o driver JDBC não foi instalado
    e.printStackTrace();
} catch (SQLException e) {
    // Erro caso haja problemas para se conectar ao banco de dados
    e.printStackTrace();
}