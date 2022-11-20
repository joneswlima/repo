import java.sql.ResultSet;

public class Main {

	public static void main(String[] args) {
		ConexaoPSQL conn = new ConexaoPSQL();
		String sql = "insert into tb_chave values (1008, 'AGORA 1008 FOI',1008)";
				
		int res = conn.executaSQL(sql);
		if(res > 0)
			System.out.println("ESSE INSERT DEU BOM");
		else {
			System.out.println("QUE CAMPO JÁ TEM LOKO?");
		}
			

	}

}
