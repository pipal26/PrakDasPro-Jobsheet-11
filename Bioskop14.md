1. Apakah pengisian elemen array harus dilakukan secara berurutan mulai dari indeks
ke-0? Jelaskan!
Tidak, array bisa diisi dengan fleksibel walaupun tidak berurutan
2. Mengapa terdapat null pada daftar nama penonton?
Karena pada indeks tersebut tidak diisi dan default string adalah null.
3. Lengkapi daftar penonton pada langkah ke-4 sebagai berikut
        penonton[0][0] = "Amin";
        penonton[0][1] = "Bena";
        penonton[1][0] = "Candra";
        penonton[1][1] = "Dela";
        penonton[2][0] = "Eka";
        penonton[2][1] = "Farhan";
        penonton[3][0] = "Gisel";
        penonton[3][1] = "Hana";
4. Tambahkan kode program sebagai berikut:
        System.out.println(penonton.length);
        System.out.println(penonton[0].length);
        System.out.println(penonton[1].length);
        System.out.println(penonton[2].length);
        System.out.println(penonton[3].length);
Jelaskan fungsi dari penonton.length dan penonton[0].length!
Memanggil baris dan kolom pada array 2d.
Apakah penonton[0].length, penonton[1].length, penonton[2].length, dan
penonton[3].length memiliki nilai yang sama? Mengapa?
Tidak, karena setiap indeks tersebut memiliki inisialisasi yang berbeda.
5. Modifikasi kode program pada pertanyaan 4 untuk menampilkan panjang setiap baris
pada array menggunakan for loop. Compile, run, lalu amati hasilnya. 
System.out.println(penonton.length);
        
        for (int i = 0; i < penonton.length; i++) {
            System.out.println("Panjang baris ke-" + i + " : " + penonton[i].length);
        }

6. Modifikasi kode program pada pertanyaan 5 untuk menampilkan panjang setiap baris
pada array menggunakan foreach loop. Compile, run, lalu amati hasilnya.
System.out.println(penonton.length);

        for (String[] baris : penonton) {
            System.out.println("Panjang baris : " + baris.length);
        }

7. Tambahkan kode program untuk menampilkan nama penonton pada baris ke-3
menggunakan for loop. Compile, run, lalu amati hasilnya.
 System.out.println("Nama Penonton Bioskop di Baris ke-3:");

        for (int i = 0; i < penonton[2].length; i++) {
            System.out.println(penonton[2][i]);
        }
8. Modifikasi kode program pada pertanyaan 7 menjadi perulangan dengan foreach
loop. Compile, run, lalu lakukan amati hasilnya.
 System.out.println("Nama Penonton Bioskop di Baris ke-3 (foreach):");
        for (String nama : penonton[2]) {
            System.out.println(nama);
        }

9. Modifikasi kembali kode program pada langkah 11 untuk menampilkan nama
penonton untuk setiap baris. Compile dan run program kemudian amati hasilnya.
for(int i = 0; i < penonton.length; i++){
            System.out.println("Nama Penonton Bioskop di Baris ke-" + (i+1) + ":" + String.join(", ",penonton[i] ));
        }

10. Menurut Anda, apa kekurangan dan kelebihan foreach loop dibandingkan dengan for
loop?
Kelebihan foreach Loop:

foreach memiliki sintaks yang lebih ringkas dan membuat kode lebih mudah dibaca karena Anda fokus langsung pada elemen, bukan pada indeks.
Kekurangan foreach Loop:

Kekurangan utamanya adalah Anda tidak memiliki akses ke indeks (posisi) elemen yang sedang diiterasi.
11. Berapa indeks baris maksimal untuk array penonton?
3
12. Berapa indeks kolom maksimal untuk array penonton?
1
13. Apa fungsi dari String.join()?
Fungsi dari String.join() adalah untuk menggabungkan (mengkompilasi) elemen-elemen dari sebuah koleksi atau array menjadi satu string tunggal, dengan menyisipkan sebuah delimiter (pemisah) di antara setiap elemen.