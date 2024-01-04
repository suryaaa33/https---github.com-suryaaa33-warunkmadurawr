import java.util.Scanner;

public class mainMadurawr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WarungMadura warungMadura = new WarungMadura();
        KeranjangBelanja keranjang = new KeranjangBelanja();  // Gunakan hanya satu objek keranjang

        int choice;

        do {
            System.out.println("Selamat datang di Warung Madura");
            System.out.println("1. Tambah Barang yang ingin di-checkout");
            System.out.println("2. Lihat Barang");
            System.out.println("3. Checkout");
            System.out.println("4. Histori Transaksi");
            System.out.println("5. Keluar");
            System.out.print("Pilihan Anda: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan nama barang: ");
                    String namaBarang = scanner.next();
                    System.out.print("Masukkan jumlah barang: ");
                    int jumlahBarang = scanner.nextInt();
                    System.out.print("Masukkan harga barang: ");
                    int hargaBarang = scanner.nextInt();

                    Barang barangBaru = new Barang(namaBarang, hargaBarang, jumlahBarang);
                    keranjang.tambahBarangKeKeranjang(barangBaru);
                
                    System.out.println("Barang berhasil ditambahkan ke keranjang.");
                    break;
                case 2:
                    keranjang.lihatListBarang();
                    break;
                case 3:
                    keranjang.checkout();
                    warungMadura.tambahTransaksi(keranjang.copy());
                    break;
                case 4:
                    warungMadura.historiTransaksi();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
                    break;
            }
        } while (choice != 5);
        scanner.close();
    }
}
