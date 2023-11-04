public class nomorempat{
    public static void main(String[] args) {
        // Membuat sebuah array integer dengan beberapa nilai
        int[] angka = {1, 2, 3, 4, 5};

        // Menampilkan semua nilai dalam array menggunakan perulangan for
        System.out.println("Nilai dalam array:");

        for (int i = 0; i < angka.length; i++) {
            System.out.println("Index " + i + ": " + angka[i]);
        }
    }
}