package tugas;

import java.util.Scanner;

public class TugasDataMahasiswa {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input data
        System.out.print("Nama: ");
        String nama = input.nextLine();

        System.out.print("NIM: ");
        String nim = input.nextLine();

        System.out.print("Program Studi: ");
        String prodi = input.nextLine();

        // Input gender
        System.out.print("Gender (L/P): ");
        String g = input.nextLine();

        String gender;
        if (g.equalsIgnoreCase("L")) {
            gender = "Laki-Laki";
        } else if (g.equalsIgnoreCase("P")) {
            gender = "Perempuan";
        } else {
            gender = "Tidak diketahui";
        }

        // Input kelas
        System.out.print("Kelas (A/B/CK/CS): ");
        String kelas = input.nextLine();

        // Output
        System.out.println("\n=== DATA MAHASISWA ===");
        System.out.println("Nama          : " + nama);
        System.out.println("NIM           : " + nim);
        System.out.println("Prodi         : " + prodi);
        System.out.println("Gender        : " + gender);
        System.out.println("Kelas         : " + kelas.toUpperCase());

        input.close();
    }
}