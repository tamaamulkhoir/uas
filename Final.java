import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;                                                         
public class Final {
	static final String dbUrl = "jdbc:mysql://localhost/baru";
	static final String Username = "tamaamul";
	static final String Password = "H1051201061";
	
	static Connection conn;
	static Statement stmt;
	static ResultSet rs;

	static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
	static BufferedReader input = new BufferedReader(inputStreamReader);
	
	public static void main(String[] args) {

	    try {
	        conn = DriverManager.getConnection(dbUrl, Username, Password);
	        stmt = conn.createStatement();

	        while (!conn.isClosed()) {
	            showMenu();
	        }

	        stmt.close();
	        conn.close();

	    } catch (Exception e) {
	        e.printStackTrace();
	    }

	}
	static void showMenu() {
		System.out.println("========================================");
		System.out.println("==             MENU UTAMA             ==");
		System.out.println("========================================");
	    System.out.println("1. Show All Data");
	    System.out.println("2. Show Name + NIM");
	    System.out.println("3. Show Name + Addres");
	    System.out.println("4. Show Name + Class");
	    System.out.print("MASUKKAN PILIHAN===> ");
	   
	    try {
	        int pilihan = Integer.parseInt(input.readLine());

	        switch (pilihan) {
	            case 1:
	                showall();
	                break;
	            case 2:
	                shownamenim();
	                break;
	            case 3:
	                shownameaddres();
	                break;
	            case 4:
	                shownameclass();
	                break;
	            default:
	            	 showMenu();
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	 static void showall() {
	        String sql = "SELECT * FROM Mahasiswa_FInal";

	        try {
	            rs = stmt.executeQuery(sql);
	              while (rs.next()) {
	               System.out.println(rs.getString("Nim")+" "+rs.getString("Nama")+" "+rs.getString("Alamat")+" "+rs.getString("Kelas"));
	            }

	        } catch (Exception e) {
	            e.printStackTrace();
	        }

	    }

	 static void shownamenim() {
	        String sql = "SELECT Nim, Nama from Mahasiswa_Final";

	        try {
	            rs = stmt.executeQuery(sql);
	              while (rs.next()) { 	 
	            	  System.out.println(rs.getString("Nim")+" "+rs.getString("Nama"));
	            }

	        } catch (Exception e) {
	            e.printStackTrace();
	        }

	    }
	 static void shownameaddres() {
	        String sql = " SELECT Nama, Alamat from Mahasiswa_Final";

	        try {
	            rs = stmt.executeQuery(sql);
	              while (rs.next()) {
	            	  System.out.println(rs.getString("Nama")+" "+rs.getString("Alamat"));
	            }

	        } catch (Exception e) {
	            e.printStackTrace();
	        }

	    }
	 static void shownameclass() {
	        String sql = "  SELECT Nama, Kelas from Mahasiswa_Final";

	        try {
	            rs = stmt.executeQuery(sql);
	              while (rs.next()) {
	            	 
	            	  System.out.println(rs.getString("Nama")+" "+rs.getString("Kelas"));
	            }

	        } catch (Exception e) {
	            e.printStackTrace();
	        }

	    }
	
	 }

