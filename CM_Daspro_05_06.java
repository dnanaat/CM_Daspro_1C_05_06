import java.util.Scanner;
public class CM_Daspro_05_06 {

    static String[] namaItem = new String[10];
    static String[] kategoriItem = new String[10];
    static int[] stokItem = new int[10];
    static Scanner sc = new Scanner(System.in);

    static {
        namaItem[0] = "Kopi Hitam";
        kategoriItem[0] = "Minuman";
        stokItem[0] = 10;

        namaItem[1] = "Cappuccino";
        kategoriItem[1] = "Minuman";
        stokItem[1] = 5;

        namaItem[2] = "Teh Tarik";
        kategoriItem[2] = "Minuman";
        stokItem[2] = 8;
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n===== MENU INVENTORI KAFE =====");
            System.out.println("1. Tampilkan Inventori");
            System.out.println("2. Tambah Stok untuk Item yang Ada");
            System.out.println("3. Tambah Item Baru");
            System.out.println("4. Keluar");
            System.out.print("\nPilih menu: ");
            int pilihan = sc.nextInt();

            if (pilihan == 1) {
                tampilkanInventori();
            } else if (pilihan == 2) {
                tambahStok();
            } else if (pilihan == 3) {
                tambahItemBaru();
            }
        }
    }

    static void tampilkanInventori() {
        System.out.println("\n===== DATA INVENTORI =====");
        System.out.println("No   Nama Item          Kategori   Stok");
        System.out.println("------------------------------------------");

        for (int i = 0; i < namaItem.length; i++) {
            if (namaItem[i] != null) {
                System.out.println((i + 1) + ".   " + namaItem[i] + "\t\t" + kategoriItem[i] + "\t   " + stokItem[i]);
            }
        }
    }

    static void tambahStok() {
        tampilkanInventori();
        System.out.print("\nMasukkan nomor item : ");
        int nomor = sc.nextInt() - 1;
        if (nomor >= 0 && nomor < namaItem.length && namaItem[nomor] != null) {
            System.out.print("Masukkan jumlah stok yang ingin ditambahkan : ");
            int jumlah = sc.nextInt();
            if (jumlah == 0) {
                System.out.print("Jumlah harus lebih dari 0, silahkan input kembali : ");
                jumlah = sc.nextInt();
            }
            stokItem[nomor] += jumlah;
            System.out.println("Stok " + namaItem[nomor] + " berhasil ditambahkan. Stok sekarang : " + stokItem[nomor]);
        } else {
            System.out.println("Item tidak ditemukan");
        }
    }

    static void tambahItemBaru() {
        sc.nextLine();
        System.out.print("\nMasukkan nama item baru : ");
        String namaBaru = sc.nextLine();
        System.out.print("Masukkan kategori item baru : ");
        String kategoriBaru = sc.nextLine();
        System.out.print("Masukkan jumlah stok awal : ");
        int stokBaru = sc.nextInt();
        if (stokBaru == 0) {
            System.out.print("Input harus lebih dari 0, silahkan input kembali : ");
            stokBaru = sc.nextInt();
        }
    }
    
}