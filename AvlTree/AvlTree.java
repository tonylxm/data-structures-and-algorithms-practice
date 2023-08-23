// Tony Lim tlim334
// DATE CREATED: 17/08/2023
// AVL Tree implementation & rotation (self-balancing algorithm) for SOFTENG 284

public class AvlTree {
  public Node root;

  public void add(int value) {
    root = addRec(root, value);
  }

  // Checks recursively in the BST where the node appropriately should be added
  public Node addRec(Node root, int value) {
    if (root == null) {
      return new Node(value);
    }

    // if value is less than root, go left
    // if value is greater than root, go right
    // if value is equal to root, return root
    if (value < root.value) {
      root.left = addRec(root.left, value);
    } else if (value > root.value) {
      root.right = addRec(root.right, value);
    } else {
      return root;
    }

    root.height = Math.max(calcHeight(root.right), calcHeight(root.left)) + 1;
    int balance = calcBalance(root);

    // Check & apply ROTATION if necessary each time a new node is added to keep BST 'balanced'

    // Case 1
    // Case 1.1: Left subtree greater height than right subtree
    if (balance > 1 && value < root.left.value) {
      return rightRotate(root);
    }

    // Case 1.2: Right subtree greater height than left subtree
    if (balance < -1 && value > root.right.value) {
      return leftRotate(root); // new root
    }

    // Case 2
    // Case 2.1: 'right-heavy' imbalance in left child's right subtree
    if (balance > 1 && value > root.left.value) {
      root.left = leftRotate(root.left);
      return rightRotate(root); // Fix case 1.1 after
    }

    // Case 2.2 'left-heavy' imbalance in right child's left subtree
    if (balance < -1 && value < root.right.value) {
      root.right = rightRotate(root.right);
      return leftRotate(root); // Fix case 1.2 after
    }

    return root;
  }

  public int calcHeight(Node node) {
    if (node == null) {
      return 0;
    }
    return node.height;
  }

  public int calcBalance(Node node) {
    if (node == null) {
      return 0;
    }
    return calcHeight(node.left) - calcHeight(node.right);
  }

  // Easier to implement using largest node (most high up) as the focus rather than class slides implementation of rotating
  public Node rightRotate(Node node) {
    Node leftChild = node.left;
    Node rightChild = leftChild.right;

    leftChild.right = node;
    node.left = rightChild;

    node.height = Math.max(calcHeight(node.left), calcHeight(node.right)) + 1;
    leftChild.height = Math.max(calcHeight(leftChild.left), calcHeight(leftChild.right)) + 1;

    return leftChild;
  }

  // Easier to implement using largest node (most high up) as the focus rather than class slides implementation of rotating
  public Node leftRotate(Node node) {
    Node rightChild = node.right;
    Node leftChild = rightChild.left;

    rightChild.left = node;
    node.right = leftChild;

    node.height = Math.max(calcHeight(node.left), calcHeight(node.right)) + 1;
    rightChild.height = Math.max(calcHeight(rightChild.left), calcHeight(rightChild.right)) + 1;

    return rightChild;
  }

  public boolean contains(int value) {
    return containsRec(root, value);
}

private boolean containsRec(Node root, int value) {
    if (root == null) {
        return false;
    }

    if (value == root.value) {
        return true;
    } else if (value < root.value) {
        return containsRec(root.left, value);
    } else {
        return containsRec(root.right, value);
    }
}

  // My binary search tree indexing
  //      0
  //    /   \
  //   1      2
  //  / \    / \
  // 11 12  21 22

  // Testing purposes
  public void printTreeInfo() {
    if (root != null) System.out.println("Root 0: " + root.value);
    if (root.left != null) System.out.println("Node 1: " + root.left.value);
    if (root.right != null) System.out.println("Node 2: " + root.right.value);
    if (root.left.left != null) System.out.println("Node 11: " + root.left.left.value);
    if (root .left.right != null) System.out.println("Node 12: " + root.left.right.value);
    if (root.right.left != null) System.out.println("Node 21: " + root.right.left.value);
    if (root.right.right != null) System.out.println("Node 22: " + root.right.right.value);
  }
}
