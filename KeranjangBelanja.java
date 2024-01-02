import java.util.ArrayList;
public class KeranjangBelanja {
     ArrayList<Barang> keranjang = new ArrayList<>();

    public void addBarang(Barang barang) {
        keranjang.add(barang);
    }

    public void removeBarang(Barang barang) {
        keranjang.remove(barang);
    }

    public int calculateTotal() {
        int total = 0;
        for (Barang barang : keranjang) {
            total += barang.harga;
        }
        return total;
    }

    public void checkout() {
        for (Barang barang : keranjang) {
            barang.stok--;
        }
        keranjang.clear();
    }

    public void lihatListBarang() {
        for (Barang barang : keranjang) {
            System.out.println("Nama: " + barang.nama + ", Harga: " + barang.harga);
        }
        System.out.println("Total Harga: " + calculateTotal());
    }
}
