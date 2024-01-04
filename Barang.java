public class Barang {
    String nama;
    int harga;
    int jumlah;

    public Barang(String nama, int harga, int jumlah) {
        this.nama = nama;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    public int getHarga() {
        
        return harga;
    }

    public int getJumlah() {
        return jumlah;
    }

    public String getNamaBarang() {
        return nama;
    }
}