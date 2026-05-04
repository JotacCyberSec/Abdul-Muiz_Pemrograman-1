package tugas;

import java.util.Scanner;

public class TugasDataBarangToko {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Data barang
        String[] namaBarang = {"Beras", "Gula", "Minyak", "Telur", "Susu"};
        int[] hargaBarang = {12000, 14000, 15000, 25000, 10000};

        int totalBelanja = 0;

        // Tampilkan daftar
        System.out.println("=== DAFTAR BARANG TOKO ===");
        for (int i = 0; i < namaBarang.length; i++) {
            System.out.println((i + 1) + ". " + namaBarang[i] + " - Rp" + hargaBarang[i]);
        }

        // Input jumlah barang yang ingin dibeli
        System.out.print("\nBerapa jenis barang yang ingin dibeli? ");
        int jumlah = input.nextInt();

        System.out.println("\n=== STRUK BELANJA ===");

        // Loop input pilihan
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Pilih barang ke-" + (i + 1) + " (1-" + namaBarang.length + "): ");
            int pilih = input.nextInt();

            if (pilih >= 1 && pilih <= namaBarang.length) {
                System.out.println("Membeli: " + namaBarang[pilih - 1]);
                totalBelanja += hargaBarang[pilih - 1];
            } else {
                System.out.println("Pilihan tidak valid!");
                i--; // ulangi input
            }
        }

        // Diskon sederhana
        double diskon = 0;
        if (totalBelanja > 50000) {
            diskon = totalBelanja * 0.1;
        }

        double totalBayar = totalBelanja - diskon;

        // Output
        System.out.println("\nTotal Belanja : Rp" + totalBelanja);
        System.out.println("Diskon        : Rp" + diskon);
        System.out.println("Total Bayar   : Rp" + totalBayar);

        input.close();
    }
}