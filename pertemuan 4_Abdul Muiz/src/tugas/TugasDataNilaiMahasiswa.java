package tugas;

import java.util.Scanner;

public class TugasDataNilaiMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama Mahasiswa: ");
        String nama = input.nextLine();

        System.out.print("Masukkan NIM: ");
        String nim = input.nextLine();

        System.out.print("Masukkan SKS Mata Kuliah: ");
        int sks = input.nextInt();

        int realisasi;

        if (sks == 2) {
            realisasi = 14;
        } else if (sks == 3) {
            realisasi = 21;
        } else {
            System.out.println("SKS tidak valid!");
            input.close();
            return;
        }

        System.out.print("Masukkan jumlah kehadiran: ");
        int jumlahKehadiran = input.nextInt();

        if (jumlahKehadiran < 0 || jumlahKehadiran > realisasi) {
            System.out.println("Jumlah kehadiran tidak valid!");
            input.close();
            return;
        }

        System.out.print("Masukkan nilai tugas: ");
        double nilaiTugas = input.nextDouble();

        System.out.print("Masukkan nilai UTS: ");
        double nilaiUTS = input.nextDouble();

        System.out.print("Masukkan nilai UAS: ");
        double nilaiUAS = input.nextDouble();

        if (nilaiTugas < 0 || nilaiTugas > 100 ||
            nilaiUTS < 0 || nilaiUTS > 100 ||
            nilaiUAS < 0 || nilaiUAS > 100) {
            System.out.println("Nilai harus berada di antara 0 sampai 100!");
            input.close();
            return;
        }

        double bobotKehadiran = ((double) jumlahKehadiran / realisasi) * 10;
        double bobotTugas = nilaiTugas * 0.20;
        double bobotUTS = nilaiUTS * 0.30;
        double bobotUAS = nilaiUAS * 0.40;

        double total = bobotKehadiran + bobotTugas + bobotUTS + bobotUAS;

        char grade;
        if (total >= 90) {
            grade = 'A';
        } else if (total >= 80) {
            grade = 'B';
        } else if (total >= 70) {
            grade = 'C';
        } else if (total >= 60) {
            grade = 'D';
        } else {
            grade = 'E';
        }

        String keterangan;
        if (total >= 60) {
            keterangan = "LULUS";
        } else {
            keterangan = "TIDAK LULUS";
        }

        System.out.println("\n============ HASIL ============");
        System.out.println("Nama             : " + nama);
        System.out.println("NIM              : " + nim);
        System.out.println("SKS              : " + sks);
        System.out.println("Realisasi        : " + realisasi);
        System.out.println("Jumlah Kehadiran : " + jumlahKehadiran);
        System.out.printf("Bobot Kehadiran  : %.2f\n", bobotKehadiran);
        System.out.printf("Bobot Tugas      : %.2f\n", bobotTugas);
        System.out.printf("Bobot UTS        : %.2f\n", bobotUTS);
        System.out.printf("Bobot UAS        : %.2f\n", bobotUAS);
        System.out.printf("Total Nilai      : %.2f\n", total);
        System.out.println("Grade            : " + grade);
        System.out.println("Keterangan       : " + keterangan);

        input.close();
    }
}