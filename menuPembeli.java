public class menuPembeli{
private static void menuPembeli(Scanner scanner, List<String> keranjang) {
        int innerPilihan;
        do {
            System.out.println("Selamat datang di mode pembeli, silahkan pilih :");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Lihat keranjang");
            System.out.println("3. Hapus Barang");
            System.out.println("4. Hapus Keranjang");
            System.out.println("5. Checkout");
            System.out.println("6. Kembali");

            innerPilihan = scanner.nextInt();

            switch (innerPilihan) {
                case 1:
                    // Tambah Barang
                    System.out.println("Masukkan nama barang yang ingin ditambahkan:");
                    String barangBaru = scanner.next();
                    keranjang.add(barangBaru);
                    System.out.println(barangBaru + " ditambahkan ke keranjang.");
                    break;
                case 2:
                    // Lihat Keranjang
                    if (keranjang.isEmpty()) {
                        System.out.println("Keranjang belanja kosong.");
                    } else {
                        System.out.println("Isi keranjang:");
                        for (String barang : keranjang) {
                            System.out.println("- " + barang);
                        }
                    }
                    break;
                case 3:
                    // Hapus Barang
                    if (keranjang.isEmpty()) {
                        System.out.println("Keranjang belanja kosong.");
                    } else {
                        System.out.println("Masukkan nama barang yang ingin dihapus:");
                        String barangHapus = scanner.next();
                        if (keranjang.remove(barangHapus)) {
                            System.out.println(barangHapus + " dihapus dari keranjang.");
                        } else {
                            System.out.println(barangHapus + " tidak ditemukan dalam keranjang.");
                        }
                    }
                    break;
                case 4:
                    // Hapus Keranjang
                    keranjang.clear();
                    System.out.println("Keranjang belanja berhasil dihapus.");
                    break;
                case 5:
                    // Checkout
                    if (keranjang.isEmpty()) {
                        System.out.println("Keranjang belanja kosong. Tidak dapat checkout.");
                    } else {
                        System.out.println("Checkout berhasil. Terima kasih!");
                        keranjang.clear();
                    }
                    break;
                case 6:
                    // Kembali
                    System.out.println("Kembali ke menu utama.");
                    break;
                default:
                    System.out.println("Pilihan hanya tidak valid!");
                    break;
            }
        } while (innerPilihan != 6);
    }
}