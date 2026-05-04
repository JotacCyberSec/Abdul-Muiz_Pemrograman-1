package tugas;

import java.util.Scanner;

public class TugasSkorMahasiswa {
     public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        float kehadiran, realisasi, tugas, uts, uas, total;
        String grade;
        String keterangan;

        // Input
        System.out.print("Masukkan nilai Kehadiran : ");
        kehadiran = input.nextFloat();

        System.out.print("Masukkan nilai Realisasi : ");
        realisasi = input.nextFloat();

        System.out.print("Masukkan nilai Tugas     : ");
        tugas = input.nextFloat();

        System.out.print("Masukkan nilai UTS       : ");
        uts = input.nextFloat();

        System.out.print("Masukkan nilai UAS       : ");
        uas = input.nextFloat();

        // Perhitungan
        if (realisasi != 0) {
            total = (kehadiran / realisasi * 10) + tugas + uts + uas;

            // Penentuan grade
            if (total >= 80) {
                grade = "A";
            } else if (total >= 70) {
                grade = "B";
            } else if (total >= 60) {
                grade = "C";
            } else if (total >= 50) {
                grade = "D";
            } else {
                grade = "E";
            }

            // Keterangan lulus / tidak
            if (total >= 60) {
                keterangan = "LULUS";
            } else {
                keterangan = "TIDAK LULUS";
            }

            // Output
            System.out.println("\n=== HASIL NILAI ===");
            System.out.println("Total Nilai : " + total);
            System.out.println("Grade       : " + grade);
            System.out.println("Keterangan  : " + keterangan);

        } else {
            System.out.println("Realisasi tidak boleh 0!");
        }

        input.close();
    }
}
