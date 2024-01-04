import java.util.ArrayList;
import java.util.List;
public class KeranjangBelanja {
    ArrayList<Barang> keranjang = new ArrayList<>();
    public String namaBarang;
    public int jumlah;
    public int harga;

    public void tambahBarangKeKeranjang(Barang barang) {
        keranjang.add(barang);
    }

    public void KeranjangBelanja (String namaBarang, int jumlah, int harga) {
        this.namaBarang = namaBarang;
        this.jumlah = jumlah;
        this.harga = harga;
    }

    public List<Barang> getDaftarBarang() {
        return keranjang;
    }

    private int calculateTotal() {
        int totalHarga = 0;
        for (Barang barang : keranjang) {
            totalHarga += barang.getHarga() * barang.getJumlah();
        }
        return totalHarga;
    }
    
    public void checkout(KeranjangBelanja keranjang) {
        for (Barang barang : keranjang.getDaftarBarang()) {
            if (barang.getJumlah() > 0) {
                System.out.println("Checkout berhasil, Terima kasih sudah berbelanja");
                barang.getJumlah();
            } else {
                System.out.println("Jumlah " + barang.getNamaBarang() + " sudah habis");
            }
        }
    }

    public void lihatListBarang() {
        System.out.println("List Barang di Keranjang:");
        for (Barang barang : this.keranjang) {
            System.out.println("Nama: " + barang.getNamaBarang() +
                    ", Jumlah: " + barang.getJumlah() +
                    ", Harga: " + barang.getHarga());
        }
        System.out.println("Total Harga: " + calculateTotal());
    }

    
}


