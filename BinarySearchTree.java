class TreeNode {
    String key;
    String data;
    TreeNode left;
    TreeNode right;
    public TreeNode(String key_, String data_, TreeNode left_, TreeNode right_) {
        this.key = key_;
        this.data = data_;
        this.left = left_;
        this.right = right_;
    }
}

public class BinarySearchTree {
    public static TreeNode root;
    public BinarySearchTree() {
        this.root = root;
    }
    public static TreeNode insert_(TreeNode root, String key, String data) {
        if (root == null) {
            root = new TreeNode(key, data, null, null);
        }
        else if (key.compareTo(root.key) == 0) 
            throw new IllegalAccessError("No");
        else if (key.compareTo(root.key) < 0) {
            root.left = insert_(root.left, key, data);
        }
        else if (key.compareTo(root.data) > 0) {
            root.right = insert_(root.right, key, data);
        }
        return root;
    }

    public static void insert(String key, String data) {
        root = insert_(root, key, data);
    }

    public static String get_department(TreeNode root, String key) {
        if (root == null) 
            throw new IllegalAccessError("Person does not exist");
        else if (key.compareTo(root.key) == 0) {
            return root.data;
        }
        else if (key.compareTo(root.key) > 0) {
            return get_department(root.right, key);
        }
        else 
            return get_department(root.left, key);
    }
}