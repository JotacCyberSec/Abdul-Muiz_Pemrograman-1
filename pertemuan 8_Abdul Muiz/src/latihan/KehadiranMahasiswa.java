import java.util.Scanner;

public class KehadiranMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char ulang;

        do {
            System.out.println("====================================");
            System.out.println(" SISTEM REKAP NILAI MAHASISWA");
            System.out.println("====================================");

            System.out.print("Masukkan jumlah mahasiswa: ");
            int jumlah = input.nextInt();
            input.nextLine();

            String[] nama = new String[jumlah];
            double[] tugas = new double[jumlah];
            double[] uts = new double[jumlah];
            double[] uas = new double[jumlah];
            double[] rataRata = new double[jumlah];
            String[] status = new String[jumlah];

            for (int i = 0; i < jumlah; i++) {
                System.out.println("\nData Mahasiswa ke-" + (i + 1));

                System.out.print("Nama Mahasiswa : ");
                nama[i] = input.nextLine();

                System.out.print("Nilai Tugas    : ");
                tugas[i] = input.nextDouble();

                while (tugas[i] < 0 || tugas[i] > 100) {
                    System.out.print("Nilai harus 0-100, masukkan lagi Nilai Tugas: ");
                    tugas[i] = input.nextDouble();
                }

                System.out.print("Nilai UTS      : ");
                uts[i] = input.nextDouble();

                while (uts[i] < 0 || uts[i] > 100) {
                    System.out.print("Nilai harus 0-100, masukkan lagi Nilai UTS: ");
                    uts[i] = input.nextDouble();
                }

                System.out.print("Nilai UAS      : ");
                uas[i] = input.nextDouble();

                while (uas[i] < 0 || uas[i] > 100) {
                    System.out.print("Nilai harus 0-100, masukkan lagi Nilai UAS: ");
                    uas[i] = input.nextDouble();
                }

                input.nextLine();

                rataRata[i] = (tugas[i] + uts[i] + uas[i]) / 3;

                if (rataRata[i] >= 75) {
                    status[i] = "LULUS";
                } else {
                    status[i] = "TIDAK LULUS";
                }
            }

            System.out.println("\n==============================================================");
            System.out.println(" HASIL DATA MAHASISWA");
            System.out.println("==============================================================");

            System.out.printf("%-5s %-20s %-10s %-10s %-10s %-12s %-15s\n",
                    "No", "Nama", "Tugas", "UTS", "UAS", "Rata-rata", "Status");

            for (int i = 0; i < jumlah; i++) {
                System.out.printf("%-5d %-20s %-10.2f %-10.2f %-10.2f %-12.2f %-15s\n",
                        (i + 1), nama[i], tugas[i], uts[i], uas[i], rataRata[i], status[i]);
            }

            System.out.print("\nApakah ingin mengulang program? (y/t): ");
            ulang = input.next().charAt(0);
            input.nextLine();

        } while (ulang == 'y' || ulang == 'Y');

        System.out.println("Program selesai. Terima kasih!");

        input.close();
    }
}