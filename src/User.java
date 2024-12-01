
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class User {																1
	public Connection conectarBD() {											2
		Connection conn = null;
		try {																	3
			Class.forName("com.mysql.Driver.Manager").newInstance();
			String url = "jdbc:mysql://127.0.0.1/test?user=lopes&password=123";
			conn = DriverManager.getConnection(url);
		} 4 catch (Exception e) { }5
		return conn;}															6
	public String nome="";
	public boolean result = false;
	public boolean verificarUsuario (String login, String senha) {				7
		String sql = "";
		sql += "select nome from usuarios ";
		sql += "where login = " + "'" + login + "'";
		sql += "  and senha = " + "'" + senha + "';";
		Connection conn = conectarBD();
		try {																	8
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			if(rs.next()) {														9
				result = true;
				nome = rs.getString("nome");									10
			}
		}11	catch (Exception e) { }12
		return result;13
	}																			14
}//fim da class22

