public class Main {
  public static void main(String[] args) {
    AvlTree bst = new AvlTree();
    // Case 1 Test
    bst.add(51);
    bst.add(27);
    bst.add(57);
    bst.add(53);
    bst.add(79);
    bst.add(100);
    
    // Expect:
    // Root 0: 57
    // Node 1: 51
    // Node 2: 79
    // Node 11: 27
    // Node 12: 53
    // Node 22: 100



    // Case 2 Test
    // bst.add(51);
    // bst.add(27);
    // bst.add(74);
    // bst.add(64);
    // bst.add(81);
    // bst.add(63);
    // bst.add(65);

    // Expect:
    // Root 0: 64
    // Node 1: 51
    // Node 2: 74
    // Node 11: 27
    // Node 12: 63
    // Node 21: 65
    // Node 22: 81


    // Rajko's test case
    // int n = 1000000;
    // for (int i = 0; i < n; i++) {
    //   bst.add(i);
    //   bst.add(-i);
    // }
    // for (int i = 0; i < n; i++) {
    //   bst.contains(n - 1);
    //   bst.contains(-n + 1);
    // }

    bst.printTreeInfo();
  }
}
