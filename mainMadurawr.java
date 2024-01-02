public class mainMadurawr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WarungMadura warungMadura = new WarungMadura();
        int choice;

        do {
            System.out.println("Selamat datang di Warung Madura");
            System.out.println("Silakan memilih mode:");
            System.out.println("1. Mode Pembeli");
            System.out.println("2. Mode Penjual");
            System.out.println("3. Keluar");
            System.out.print("Pilihan Anda: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    modePembeli(scanner, warungMadura);
                    break;
                case 2:
                    modePenjual(scanner, warungMadura);
                    break;
                case 3:
                    System.out.println("Terima kasih telah menggunakan program ini.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
                    break;
            }
        } while (choice != 3);
    }

    public static void modePembeli(Scanner scanner, WarungMadura warungMadura) {
        KeranjangBelanja keranjang = new KeranjangBelanja();

        int choice;
        do {
            System.out.println("Menu Mode Pembeli:");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Lihat Barang");
            System.out.println("3. Hapus Barang");
            System.out.println("4. Checkout");
            System.out.println("5. Kembali ke Menu Utama");
            System.out.print("Pilihan Anda: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan nama barang: ");
                    String namaBarang = scanner.next();
                    System.out.print("Masukkan harga barang: ");
                    int hargaBarang = scanner.nextInt();
                    System.out.print("Masukkan stok barang: ");
                    int stokBarang = scanner.nextInt();
                    Barang barang = new Barang(namaBarang, hargaBarang, stokBarang);
                    warungMadura.tambahStokBarang(barang);
                    keranjang.addBarang(barang);
                    break;
                case 2:
                    System.out.println("List Barang di Keranjang:");
                    keranjang.lihatListBarang();
                    break;
                case 3:
                    System.out.print("Masukkan nama barang yang ingin dihapus: ");
                    String namaBarangHapus = scanner.next();
                    Barang barangHapus = null;
                    for (Barang b : keranjang.keranjang) {
                        if (b.nama.equals(namaBarangHapus)) {
                            barangHapus = b;
                            break;
                        }
                    }
                    if (barangHapus != null) {
                        keranjang.removeBarang(barangHapus);
                        System.out.println("Barang berhasil dihapus dari keranjang.");
                    } else {
                        System.out.println("Barang tidak ditemukan dalam keranjang.");
                    }
                    break;
                case 4:
                    keranjang.checkout();
                    System.out.println("Checkout berhasil. Stok barang telah dikurangi.");
                    break;
                case 5:
                    System.out.println("Kembali ke Menu Utama.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
                    break;
            }
        } while (choice != 5);
    }

    public static void modePenjual(Scanner scanner, WarungMadura warungMadura) {
        int choice;
        do {
            System.out.println("Menu Mode Penjual:");
            System.out.println("1. Histori Transaksi");
            System.out.println("2. Kembali ke Menu Utama");
            System.out.print("Pilihan Anda: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    warungMadura.historiTransaksi();
                    break;
                case 2:
                    System.out.println("Kembali ke Menu Utama.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
                    break;
            }
        } while (choice != 2);
    }
}