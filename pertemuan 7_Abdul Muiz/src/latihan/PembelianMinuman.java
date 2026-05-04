package latihan;

import java.util.Scanner;

public class PembelianMinuman {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pilih, jumlah;
        int total = 0;
        String namaKopi = "";
        int harga = 0;

        System.out.println("=== MENU MINUMAN ===");
        System.out.println("1. Americano  - Rp22000");
        System.out.println("2. Mocha      - Rp28000");
        System.out.println("3. Flat White - Rp30000");
        System.out.print("Masukkan pilihan: ");
        pilih = input.nextInt();

        // Penentuan menu
        if (pilih == 1) {
            namaKopi = "Americano";
            harga = 22000;
        } else if (pilih == 2) {
            namaKopi = "Mocha";
            harga = 28000;
        } else if (pilih == 3) {
            namaKopi = "Flat White";
            harga = 30000;
        } else {
            System.out.println("Menu tidak tersedia!");
            input.close();
            return;
        }

        System.out.print("Jumlah beli: ");
        jumlah = input.nextInt();

        total = harga * jumlah;

        // Diskon versi beda (pakai variable)
        double diskon = 0;
        if (total > 60000) {
            diskon = total * 0.1;
        }

        double totalBayar = total - diskon;

        // Output lebih detail
        System.out.println("\n=== STRUK PEMBELIAN ===");
        System.out.println("Menu     : " + namaKopi);
        System.out.println("Harga    : Rp" + harga);
        System.out.println("Jumlah   : " + jumlah);
        System.out.println("Subtotal : Rp" + total);
        System.out.println("Diskon   : Rp" + diskon);
        System.out.println("Total    : Rp" + totalBayar);

        input.close();
    }
}