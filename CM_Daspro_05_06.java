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

        }
    }
    
}