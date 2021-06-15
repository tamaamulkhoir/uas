import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import siskom.Mahasiswa;

public class JBDC1 {
	private int nim;
	private String nama;
	private String alamat;
	private String kelas;
	
	public int getNim() {
		return nim;
	}
    public void setNim(int nim) {
		this.nim = nim;
	}
	public String getNama() {
		return nama;
	}
    public void setNama(String nama) {
		this.nama = nama;
	}
	public String getAlamat() {
		return alamat;
	}
    public void setAlamat(String alamat) {
		this.alamat = alamat;
	}
	public String getKelas() {
	return kelas;
    }
	public void setKelas(String kelas) {
	this.kelas = kelas;
    }
	static String username="tamaamul";
	static String password="H1051201061";
	static String dbUrl ="jbdc:mysql://localhost:3306/siskom";
	
	static Connection conn;
	static Statement stm;
	static ResultSet rs;
	Scanner sc;
public static void main(String[]args) {	
	
	}

}


	