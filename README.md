# Assessment OOP — Data Mahasiswa

Program Java sederhana untuk mengelola data mahasiswa: menampilkan daftar mahasiswa (Nama, NIM, Jurusan, IPK, Status, Predikat) dan memperbarui IPK berdasarkan NIM.

## Prasyarat

- **Java JDK** (JRE tidak cukup, perlu compiler). Cek versi:
  ```bash
  javac -version
  java -version
  ```

## Cara Menjalankan

### 1. Masuk ke folder project

```bash
cd assesment-oop
```

### 2. Compile

```bash
javac main.java
```

Ini menghasilkan file `Main.class` dan `Mahasiswa.class`.

### 3. Jalankan program

```bash
java Main
```

### 4. Input saat program berjalan

- **NIM mahasiswa yang ingin diupdate** — ketik NIM (contoh: `2440005`) lalu Enter.
- **IPK baru** — ketik nilai IPK (contoh: `3.9`) lalu Enter.

Program akan menampilkan data mahasiswa yang baru diperbarui.

---

## Contoh Log Output

Berikut contoh output saat program dijalankan: pertama daftar mahasiswa ditampilkan, lalu pengguna memilih NIM dan IPK baru.

```
java Main
=== Data Mahasiswa ===
Nama: Andy Ismail
NIM: 2440001
Jurusan: Teknik Informatika
IPK: 3.75
Status: Lulus
Dengan Pujian

Nama: Saepuloh
NIM: 2440002
Jurusan: Sistem Informasi
IPK: 3.4
Status: Belum Lulus
Memuaskan

Nama: Citra
NIM: 2440003
Jurusan: Teknik Informatika
IPK: 3.9
Status: Lulus
Dengan Pujian

Nama: Dony santoso
NIM: 2440004
Jurusan: Teknik Industri
IPK: 3.0
Status: Belum Lulus
Memuaskan

Nama: Ahmed
NIM: 2440005
Jurusan: Akuntansi
IPK: 3.2
Status: Belum Lulus
Memuaskan

Masukkan NIM mahasiswa yang ingin diupdate: 2440005
Masukkan IPK baru: 3.9
Data berhasil diperbarui!

=== Data Mahasiswa ===
Nama: Ahmed
NIM: 2440005
Jurusan: Akuntansi
IPK: 3.9
Status: Lulus
Dengan Pujian
```

*(Setelah update IPK 3.9, status menjadi "Lulus" dan predikat "Dengan Pujian".)*
