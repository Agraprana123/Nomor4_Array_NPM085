# Array

1. variabel angka akan menjadi sebuah array integer yang berisi lima elemen dengan nilai 1, 2, 3, 4, dan 5. Anda dapat mengakses nilai-nilai ini dengan menggunakan indeks, misalnya angka[0] akan menghasilkan nilai 1, angka[1] akan menghasilkan nilai 2, dan seterusnya.

                 // Membuat sebuah array integer dengan beberapa nilai
                        int[] angka = {1, 2, 3, 4, 5};
   2. Code di atas digunakan dalam bahasa pemrograman Java untuk menampilkan semua nilai dalam array angka menggunakan perulangan for. Kode dimulai dengan mencetak pesan "Nilai dalam array:" ke layar sebagai label. Kemudian, sebuah perulangan for digunakan untuk mengakses setiap elemen dalam array angka. Setiap iterasi dari perulangan mencetak indeks elemen berserta nilainya.

                // Menampilkan semua nilai dalam array menggunakan perulangan for
                        System.out.println("Nilai dalam array:");
                
                        for (int i = 0; i < angka.length; i++) {
                            System.out.println("Index " + i + ": " + angka[i]);
                        }   
