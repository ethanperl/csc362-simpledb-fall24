import java.sql.Connection;
import java.sql.*;
import java.sql.DriverManager;
import java.util.Scanner;
import simpledb.jdbc.network.NetworkDriver;

public class SectionInfo {

	public static void main(String[] args) {
		
		System.out.print("Enter section number: ");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		sc.close();
		
		String url = "jdbc:derby://localhost/StudentDB";
		Driver d = new NetworkDriver();
		
		String qry = "";
		
		try(Connection conn = d.connect(url, null);
				PreparedStatement psmt = conn.prepareStatement(qry)){
			
			
			
			
		}
				
		catch(SQLException e) {
			e.printStackTrace();
		}
	
	}
		
}
