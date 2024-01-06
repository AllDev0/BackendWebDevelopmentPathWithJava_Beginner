class Node {
    int key;
    Node left, right;
 
    public Node(int item) {
        key = item;
        left = right = null;
    }
}
 
class BinarySearchTree {
    Node root;
 
    BinarySearchTree() {
        root = null;
    }

    Node insert(Node node, int key) {
        if (node == null) {
            node = new Node(key);
            return node;
        }
 
        if (key < node.key)
            node.left = insert(node.left, key);
        else if (key > node.key)
            node.right = insert(node.right, key);
        return node;
    }
 
    Node search(Node root, int key) {
        if (root == null || root.key == key)
            return root;
        if (root.key < key)
            return search(root.right, key);
        return search(root.left, key);
    }
 
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        tree.root = tree.insert(tree.root, 7);
        tree.insert(tree.root, 5);
        tree.insert(tree.root, 1);
        tree.insert(tree.root, 8);
        tree.insert(tree.root, 3);
        tree.insert(tree.root, 6);
        tree.insert(tree.root, 0);
        tree.insert(tree.root, 9);
        tree.insert(tree.root, 4);
        tree.insert(tree.root, 2);
 
        int key = 6;
 
        if (tree.search(tree.root, key) == null)
            System.out.println(key + " not found");
        else
            System.out.println(key + " found");
 
        key = -1;
 
        if (tree.search(tree.root, key) == null)
            System.out.println(key + " not found");
        else
            System.out.println(key + " found");
    }
}