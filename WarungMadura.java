import java.util.ArrayList;

public class WarungMadura {
    BST stokBarang = new BST();
    ArrayList<KeranjangBelanja> historiTransaksi = new ArrayList<>();
    ArrayList<Barang> keranjang = new ArrayList<>();
    int totalPendapatan;
    
    public void tambahTransaksi(KeranjangBelanja keranjang) {
        historiTransaksi.add(keranjang);
    }

    private int calculateTotal() {
        int totalHarga = 0;
        for (Barang barang : keranjang) {
            totalHarga += barang.getHarga() * barang.getJumlah();
        }
        return totalHarga;
    }

    public void historiTransaksi() {
        System.out.println("Laporan Penjualan Warung Madura:");
        int transaksiCount = 1;
        double totalPendapatanToko = 0;

        for (KeranjangBelanja transaksi : historiTransaksi) {
            System.out.println("Daftar Barang dalam Transaksi pelanggan " + transaksiCount + ":");
            for (Barang barang : transaksi.keranjang) {
                System.out.println("- " + barang.nama + " (x" + barang.jumlah + ", Rp " + barang.harga + ")");
            }
            double totalPendapatanTransaksi = transaksi.calculateTotal();
            System.out.println("Total Pendapatan: Rp " + totalPendapatanTransaksi);
            System.out.println("-----------------------");

            totalPendapatanToko += totalPendapatanTransaksi;
            transaksiCount++;
        }
        totalPendapatan=calculateTotal();
        System.out.println("Total Pendapatan Toko: Rp " + totalPendapatanToko);
    }

    public int getTotalPendapatan(){
        return totalPendapatan;
    }
}
