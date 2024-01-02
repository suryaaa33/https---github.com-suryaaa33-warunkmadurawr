public class BST {
    Node root;

    public BST() {
        root = null;
    }

    public void insert(Barang barang) {
        root = insertRec(root, barang);
    }

    private Node insertRec(Node root, Barang barang) {
        if (root == null) {
            root = new Node(barang);
            return root;
        }

        if (barang.harga < root.barang.harga)
            root.left = insertRec(root.left, barang);
        else if (barang.harga > root.barang.harga)
            root.right = insertRec(root.right, barang);

        return root;
    }

    public void inOrder() {
        inOrderRec(root);
    }

    private void inOrderRec(Node root) {
        if (root != null) {
            inOrderRec(root.left);
            System.out.println("Nama: " + root.barang.nama + ", Harga: " + root.barang.harga + ", Stok: " + root.barang.stok);
            inOrderRec(root.right);
        }
    }
}
