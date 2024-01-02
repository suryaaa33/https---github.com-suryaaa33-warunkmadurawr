public class Node {
    Barang barang;
    Node left, right;

    public Node(Barang barang) {
        this.barang = barang;
        left = right = null;
    }
}