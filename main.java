import java.util.Scanner;

class Mahasiswa {

    String nama;
    String nim;
    String jurusan;
    private double ipk;
    String status;

    // Constructor
    public Mahasiswa(String nama, String nim, String jurusan, double ipk, String status) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.ipk = ipk;
        this.status = status;
    }

        // Getter
    public double getIpk() {
        return ipk;
    }

    // Setter
    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    // Update IPK
    public void updateIpk(double ipkBaru) {
        this.ipk = ipkBaru;
    }

    // Cek kelulusan
    public String cekKelulusan() {
        if (ipk >= 3.00) {
            return "Lulus";
        } else {
            return "Belum Lulus";
        }
    }

        // Method menentukan predikat
    public String hitungPredikat() {
        if (ipk >= 3.75) {
            System.out.println("Dengan Pujian");
        } else if (ipk >= 3.50) {
            System.out.println("Sangat Memuaskan");
        } else if (ipk >= 3.00) {
            System.out.println("Memuaskan");
        } else {
            System.out.println("Perlu Perbaikan");
            
        }
        System.out.println();

        return null;
    }


    // Method menampilkan data
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jurusan: " + jurusan);
        System.out.println("IPK: " + ipk);
        System.out.println("Status: " + status);
    }
}

class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Data Mahasiswa ===");

        Mahasiswa m1 = new Mahasiswa("Andy Ismail", "2440001", "Teknik Informatika", 3.75, "Lulus");
        Mahasiswa m2 = new Mahasiswa("Saepuloh", "2440002", "Sistem Informasi", 3.40, "Belum Lulus");
        Mahasiswa m3 = new Mahasiswa("Citra", "2440003", "Teknik Informatika", 3.90, "Lulus");
        Mahasiswa m4 = new Mahasiswa("Dony santoso", "2440004", "Teknik Industri", 3.00, "Belum Lulus");
        Mahasiswa m5 = new Mahasiswa("Ahmed", "2440005", "Akuntansi", 3.20, "Belum Lulus");




        Mahasiswa[] daftar = {m1, m2, m3, m4, m5};

        for (Mahasiswa m : daftar) {
            m.tampilkanInfo();
            m.hitungPredikat();
        }

        System.out.print("Masukkan NIM mahasiswa yang ingin diupdate: ");
        String nimCari = input.nextLine();

        for (Mahasiswa m : daftar) {
            if (m.nim.equals(nimCari)) {

                System.out.print("Masukkan IPK baru: ");
                double ipkBaru = input.nextDouble();

                m.updateIpk(ipkBaru);

                System.out.println("Data berhasil diperbarui!\n");

                System.out.println("=== Data Mahasiswa ===");
                m.tampilkanInfo();
                m.hitungPredikat();
            }
        }
    }
}