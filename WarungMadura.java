import java.util.ArrayList;
import java.util.List;

public class WarungMadura {
    BST jumlahBarang = new BST();
    ArrayList<KeranjangBelanja> historiTransaksi = new ArrayList<>();
    ArrayList<Barang> keranjang = new ArrayList<>();
    int totalPendapatan;
    
    public void tambahTransaksi(KeranjangBelanja keranjang) {
        historiTransaksi.add(keranjang);
    }

    public void historiTransaksi() {
        System.out.println("Laporan Penjualan Warung Madura:");
        int transaksiCount = 1;
        double totalPendapatanToko = 0;
    
        for (KeranjangBelanja transaksi : historiTransaksi) {
            System.out.println("Daftar Barang dalam Transaksi pelanggan " + transaksiCount + ":");
            
            List<Barang> daftarBarangTransaksi = transaksi.getDaftarBarang();
            for (Barang barang : daftarBarangTransaksi) {
                System.out.println("- " + barang.getNamaBarang() + " (x" + barang.getJumlah() + ", Rp " + barang.getHarga() + ")");
            }
    
            double totalPendapatanTransaksi = 0.0;
            for (Barang barang : daftarBarangTransaksi) {
                totalPendapatanTransaksi += (double) (barang.getHarga() * barang.getJumlah());
            }
    
            System.out.println("Total Pendapatan: Rp " + totalPendapatanTransaksi);
            System.out.println("-----------------------");
    
            totalPendapatanToko += totalPendapatanTransaksi;
            transaksiCount++;
        }
        totalPendapatan = (int) totalPendapatanToko; 
        System.out.println("Total Pendapatan Toko: Rp " + totalPendapatanToko);
    }
    
    public int getTotalPendapatan(){
        return totalPendapatan;
    }
}
