public class BST {
    Node root;

    public BST() {
        root = null;
    }

    public void insert(WarungMadura warungmadura) {
        root = insertRec(root, warungmadura);
    }

    private Node insertRec(Node node, WarungMadura warungmadura) {
        if (node == null) {
            return new Node(warungmadura);
        }

        if (warungmadura.getTotalPendapatan() < node.warungmadura.getTotalPendapatan())
            node.left = insertRec(node.left, warungmadura);
        else if (warungmadura.getTotalPendapatan() > node.warungmadura.getTotalPendapatan())
            node.right = insertRec(node.right, warungmadura);

        return node;
    }

    public void cetakHistoriTransaksi() {
        System.out.println("Laporan Penjualan Warung Madura:");
        cetakHistoriTransaksiRekursif(root);
        System.out.println("Total Pendapatan Toko: Rp " + getTotalPendapatanToko());
    }

    private void cetakHistoriTransaksiRekursif(Node node) {
        if (node != null) {
            cetakHistoriTransaksiRekursif(node.left);
            node.warungmadura.historiTransaksi();
            cetakHistoriTransaksiRekursif(node.right);
        }
    }

    public double getTotalPendapatanToko() {
        return getTotalPendapatanTokoRekursif(root);
    }

    double getTotalPendapatanTokoRekursif(Node node) {
        if (node == null) {
            return 0;
        }

        return getTotalPendapatanTokoRekursif(node.left) +
                getTotalPendapatanTokoRekursif(node.right) +
                (node.warungmadura != null ? node.warungmadura.getTotalPendapatan() : 0);
    }
}
