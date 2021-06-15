package siskom;
//Nama : Tamaamul Khoir
//Nim : H1051201061
import java.util.HashSet;
import java.util.Set;

public class TestMahasiswa {
public static void main(String[]args) {
	Mahasiswa mhs1 = new Mahasiswa(001,"wawan",3.0);
	Mahasiswa mhs2 = new Mahasiswa(002,"iwan",3.2);
	Mahasiswa mhs3 = new Mahasiswa(003,"gunawan",3.3);
	Mahasiswa mhs4 = new Mahasiswa(004,"awan",3.1);
	Mahasiswa mhs5 = new Mahasiswa(005,"dawan",3.0);
	
	Set<Object> set = new HashSet<>();
	set.add(mhs1);
	set.add(mhs2);
	set.add(mhs3);
	set.add(mhs4);
	set.add(mhs5);
	System.out.println(set);
}
}
//private int nim;
	//private String nama;
	//private String alamat ;
	//private String kelas;
	
	//public void Mahasiswa(int nim, String nama, String alamat, String kelas) {
		//this.nim = nim;
		//this.nama = nama;
		//this.alamat = alamat;
		//this.kelas = kelas;
//	}
System.out.print("Masukkan Nim:");
String Nim = input.readLine().trim();
System.out.print("Masukkan Nama:");
String Nama = input.readLine().trim();
System.out.print("Masukkan Alamat:");
String Alamat = input.readLine().trim();
System.out.print("Masukkan Kelas:");
String Kelas = input.readLine().trim();
Set<Object> set = new HashSet<>();
set.add(Nim);
set.add(Nama);
set.add(Alamat);
set.add(Kelas);
//System.out.println(set);
sql = String.format(sql,Nim,Nama,Alamat,Kelas);
rs = stmt.executeQuery(sql);