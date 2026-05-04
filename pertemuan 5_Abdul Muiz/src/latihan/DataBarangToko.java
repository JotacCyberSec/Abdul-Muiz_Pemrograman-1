package latihan;

public class DataBarangToko {
    public static void main(String[] args) {

        // Array data barang
        String[] namaBarang = {"Beras", "Gula", "Minyak", "Telur", "Susu"};
        int[] hargaBarang = {12000, 14000, 15000, 25000, 10000};

        // Tampilkan daftar barang
        System.out.println("=== Daftar Barang Toko ===");
        for (int i = 0; i < namaBarang.length; i++) {
            System.out.println((i + 1) + ". " + namaBarang[i] + " - Rp" + hargaBarang[i]);
        }

        // Simulasi beli barang
        int totalBelanja = 0;

        System.out.println("\nMembeli beberapa barang...");

        // Misal beli barang ke-1 dan ke-3
        totalBelanja += hargaBarang[0];
        totalBelanja += hargaBarang[2];

        System.out.println("Membeli: " + namaBarang[0]);
        System.out.println("Membeli: " + namaBarang[2]);

        System.out.println("\nTotal belanja: Rp" + totalBelanja);
    }
}