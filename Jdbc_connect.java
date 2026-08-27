package JDBC;
import java.sql.*;//1st step

public class Jdbc_connect {

	public static void main(String[] args) {
		
		//2nd step - Regiser
		// TODO Auto-generated method stub
		String url = "jdbc:postgresql://localhost:5432/JDBC_demo";
		String username = "postgresql";
		String password = "";
		
		try {
			//load the driver - 3nd step
			Class.forName("org.postgresql.Driver");
			
			//Estaabilishing the ocnneciton - 4th step
			Connection con = DriverManager.getConnection(url,username,password);
			
			//Define SQL Query - 5th step
			Statement st = con.createStatement();
			
			//Executing the query - 6th step
			String query = "SELECT * FROM student";
			
			//Process the result - 7th step
			ResultSet rs = st.executeQuery(query);
			
			while(rs.next()) {
				String table = rs.getString(1) + ":" +rs.getString(2) + ":" + rs.getInt(3);
				System.out.println(table);
			}
			
			//close the resources - 8th step
			
			rs.close();
			st.close();
			con.close();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
