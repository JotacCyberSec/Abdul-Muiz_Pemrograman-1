package tugas;

class Hewan {
    String nama;
    String jenis;
    int umur; // tahun

    // Constructor
    Hewan(String nama, String jenis, int umur) {
        this.nama = nama;
        this.jenis = jenis;
        this.umur = umur;
    }

    // Method tampilkan info
    void tampilkanInfo() {
        System.out.println("Nama Hewan : " + nama);
        System.out.println("Jenis      : " + jenis);
        System.out.println("Umur       : " + umur + " tahun");
        System.out.println("Status     : " + statusUmur());
        System.out.println("------------------------");
    }

    // Method tambahan: status umur
    String statusUmur() {
        if (umur < 5) {
            return "Muda";
        } else if (umur <= 20) {
            return "Dewasa";
        } else {
            return "Tua";
        }
    }

    // Method tambahan: aktivitas
    void makan() {
        System.out.println(nama + " sedang makan.");
    }
}

public class TugasDataHewan {
    public static void main(String[] args) {

        // Membuat objek
        Hewan h1 = new Hewan("Singa", "Mamalia", 5);
        Hewan h2 = new Hewan("Gajah", "Mamalia", 10);
        Hewan h3 = new Hewan("Kura-kura", "Reptil", 50);

        // Menampilkan info
        h1.tampilkanInfo();
        h1.makan();

        h2.tampilkanInfo();
        h2.makan();

        h3.tampilkanInfo();
        h3.makan();
    }
}