package tugas;

import java.util.Scanner;

public class TugasPembelianMinuman {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pilih, jumlah;
        int harga = 0;
        int totalSemua = 0;
        char lanjut = 'y'; // sudah diinisialisasi

        do {
            String namaMinuman = "";

            System.out.println("\n=== MENU MINUMAN ===");
            System.out.println("1. Americano  - Rp22000");
            System.out.println("2. Mocha      - Rp28000");
            System.out.println("3. Flat White - Rp30000");
            System.out.print("Masukkan pilihan: ");
            pilih = input.nextInt();

            // Tentukan menu
            if (pilih == 1) {
                namaMinuman = "Americano";
                harga = 22000;
            } else if (pilih == 2) {
                namaMinuman = "Mocha";
                harga = 28000;
            } else if (pilih == 3) {
                namaMinuman = "Flat White";
                harga = 30000;
            } else {
                System.out.println("Menu tidak tersedia!");
                continue;
            }

            System.out.print("Jumlah beli: ");
            jumlah = input.nextInt();

            int subtotal = harga * jumlah;
            totalSemua += subtotal;

            System.out.println("Ditambahkan: " + namaMinuman + " x" + jumlah + " = Rp" + subtotal);

            System.out.print("Tambah pesanan? (y/n): ");
            lanjut = input.next().charAt(0);

        } while (lanjut == 'y' || lanjut == 'Y');

        // Diskon
        double diskon = 0;
        if (totalSemua > 60000) {
            diskon = totalSemua * 0.1;
        }

        double totalBayar = totalSemua - diskon;

        // Pembayaran
        System.out.print("\nMasukkan uang bayar: Rp");
        double uang = input.nextDouble();

        double kembalian = uang - totalBayar;

        // Output struk
        System.out.println("\n=== STRUK PEMBELIAN ===");
        System.out.println("Total Belanja : Rp" + totalSemua);
        System.out.println("Diskon        : Rp" + diskon);
        System.out.println("Total Bayar   : Rp" + totalBayar);
        System.out.println("Uang Bayar    : Rp" + uang);
        System.out.println("Kembalian     : Rp" + kembalian);

        input.close();
    }
}