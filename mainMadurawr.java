import java.util.Scanner;

public class mainMadurawr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int outerSwitch = 0;
        int innerSwitch = 0;
        int pilihan;

        System.out.println("Selamat datang di Warung Madura, silahkan pilih mode");
        System.out.println("1. Penjual");
        System.out.println("2. Pembeli");
        pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
                outerSwitch = 1;
                System.out.println("Selamat datang di mode penjual, silahkan pilih :");
                System.out.println("1. Histori Pembelian");
                System.out.println("2. Restock barang");
                System.out.println("3. Kembali");
                innerSwitch = scanner.nextInt();
                switch (innerSwitch) {
                    case 1:
                        System.out.println("1. Histori Pembelian");
                        break;
                    case 2:
                        System.out.println("2. Restock barang");
                        break;
                    case 3:
                        System.out.println("3. Kembali");
                        break;
                    default:
                        System.out.println("Pilihan hanya tidak valid!");
                        break;
                }
                break;
            case 2:
                outerSwitch = 2;
                System.out.println("Selamat datang di mode pembeli, silahkan pilih :");
                System.out.println("1. Tambah Barang");
                System.out.println("2. Lihat keranjang");
                System.out.println("3. Hapus Barang");
                System.out.println("4. Checkout");
                System.out.println("5. Kembali");
                innerSwitch = scanner.nextInt();
                switch (innerSwitch) {
                    case 1:
                        System.out.println("1. Tambah barang");
                        break;
                    case 2:
                        System.out.println("2. Lihat keranjang");
                        break;
                    case 3:
                        System.out.println("3. Hapus Barang");
                        break;
                    case 4:
                        System.out.println("4. Checkout");
                        break;
                    case 5:
                        System.out.println("5. Kembali");
                        break;
                    default:
                        System.out.println("Pilihan hanya tidak valid!");
                        break;
                }
                break;
            default:
                System.out.println("Pilihan hanya tidak valid!");
                break;
        }
    }
}
