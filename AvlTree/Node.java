public class Node {
    public int value;
    public Node right;
    public Node left;
    public int height;

    public Node(int value) {
        this.value = value;
        this.right = null;
        this.left = null;
    }
}