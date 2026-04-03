// Abdul Muiz - 241011401799
// Mengembangakan code Data mahasiswa dengan menambahkan condition

import java.util.Scanner;

public class DataMahasiswa {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String nim, nama, alamat;
        int usia;
        double ipk;

        System.out.print("Input NIM   : ");
        nim = input.nextLine();

        System.out.print("Input Nama  : ");
        nama = input.nextLine();

        System.out.print("Input Usia  : ");
        usia = input.nextInt();

        System.out.print("Input IPK   : ");
        ipk = input.nextDouble();

        input.nextLine();

        System.out.print("Input Alamat: ");
        alamat = input.nextLine();

        // Validasi + output
        if (usia > 0 && ipk >= 0 && ipk <= 4) {

            String status;
            if (ipk >= 3.5) {
                status = "Cumlaude";
            } else if (ipk >= 3.0) {
                status = "Sangat Memuaskan";
            } else {
                status = "Memuaskan";
            }

            System.out.println("\n==============================");
            System.out.println("DATA MAHASISWA");
            System.out.println("==============================");
            System.out.println("NIM    : " + nim);
            System.out.println("Nama   : " + nama);
            System.out.println("Usia   : " + usia);
            System.out.println("IPK    : " + ipk);
            System.out.println("Status : " + status);
            System.out.println("Alamat : " + alamat);

        } else {
            System.out.println("Data tidak valid! Cek usia atau IPK.");
        }

        input.close();
    }
}