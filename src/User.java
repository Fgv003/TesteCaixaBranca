
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class User {
	public String nome="";														1
	public boolean result = false;

	public Connection conectarBD() {											2
		Connection conn = null;													3
		try {																	4
			Class.forName("com.mysql.Driver.Manager").newInstance();			5
			String url = "jdbc:mysql://127.0.0.1/test?user=lopes&password=123";
			conn = DriverManager.getConnection(url);
		} 6 catch (Exception e)7 { }8
		return conn;}															9

	public boolean verificarUsuario (String login, String senha) {				10
		String sql = "";														11
		sql += "select nome from usuarios ";
		sql += "where login = " + "'" + login + "'";
		sql += "  and senha = " + "'" + senha + "';";
		Connection conn = conectarBD();											12
		try {																	13
			Statement st = conn.createStatement();								14
			ResultSet rs = st.executeQuery(sql);
			if(rs.next()) {														15
				result = true;													16
				nome = rs.getString("nome");
			}																	17
		}18	catch (Exception e) 19{ }20
		return result;
	}																			21


	}//fim da class22

