package siskom;
//Nama : Tamaamul Khoir
//Nim : H1051201061

public class Mahasiswa {
private int nim;
private String nama;
private double ipk;

public Mahasiswa(int nim, String nama, double ipk) {
	super();
	this.nim = nim;
	this.nama = nama;
	this.ipk = ipk;
}
public Mahasiswa(int i, String string, String string2, String string3) {
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "\nMahasiswa [nim=" + nim + ", nama=" + nama + ", ipk=" + ipk + "]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + nim;
	return result;
}
@Override
public boolean equals(Object obj) {
	if (obj != null && obj instanceof Mahasiswa) {
		Mahasiswa o = (Mahasiswa) obj;
		if (nim != o.nim) {
			return false;
		}
	}
	return true;	
}

}
