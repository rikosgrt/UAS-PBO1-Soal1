
package soal1;

public class Main {

	public static void main(String[] args) {
		
		Mahasiswa mahasiswa = new Mahasiswa("Ahmad Kusen", 23);
		MahasiswaLama mahasiswaLama = new MahasiswaLama("Handi Mufti", 25, 2014);
		MahasiswaBaru mahasiswaBaru = new MahasiswaBaru("Ridwan Maulana", 21, 22205037);
		
		System.out.println("===== Objek Mahasiswa =====");
		mahasiswa.displayInfo();
		System.out.print("\n");
		
		System.out.println("===== Objek Mahasiswa Lama =====");
		mahasiswaLama.displayInfo();
		System.out.print("\n");
		
		System.out.println("===== Objek Mahasiswa Baru =====");
		mahasiswaBaru.displayInfo();
		System.out.print("\n");
	}

}
