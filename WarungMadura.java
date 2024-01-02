import java.util.ArrayList;
public class WarungMadura {
    BST stokBarang = new BST();
    ArrayList<KeranjangBelanja> historiTransaksi = new ArrayList<>();

    public void tambahStokBarang(Barang barang) {
        stokBarang.insert(barang);
    }

    public void historiTransaksi() {
        int totalBarang = 0;
        int totalHarga = 0;
        for (KeranjangBelanja keranjang : historiTransaksi) {
            totalBarang += keranjang.keranjang.size();
            totalHarga += keranjang.calculateTotal();
        }
        System.out.println("Total Transaksi: " + historiTransaksi.size() +
                ", Total Barang Terjual: " + totalBarang +
                ", Total Pendapatan: " + totalHarga);
    }
}

