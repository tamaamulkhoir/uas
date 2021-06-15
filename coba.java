import java.sql.*;
import java.util.HashSet;
import java.util.Set;

import siskom.Mahasiswa;

public class coba {
private static Mahasiswa[] mahasiswa;

public static void main(String[]args) {
	String username = "tamaamul";
	String password = "H1051201061";
	String dbUrl = "jdbc:mysql://localhost:3306/baru";
	String query = "select * from Mahasiswa_Final";
			//+""
			//+"(H1201016,indra,dansen,A)";
	
	//('001','wawan','ayani','A');
	//(002,"iwan","ayani","A");
	//(003,"gunawan","Dansen","B");
	//(004,"awan","Kobar","B");
	//(005,"dawan","serdam","C");
	
	try {
		Connection conn = DriverManager.getConnection(dbUrl, username, password);
		Statement stm = conn.createStatement();
		ResultSet rs = stm.executeQuery(query);	
	while(rs.next()) {
		System.out.println(rs.getString("Nim")+" "+rs.getString("Nama"));
	}
	}
	catch (Exception e) {
		
	}

}}
