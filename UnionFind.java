public class UnionFind {
    private int parent[];

    public UnionFind(int n) {
        for (int i = 0; i < n; i++) {
            parent[i] = -1;
        }
    }

    public int findRep(int x) {
        while (parent[x] != -1) {
            x = parent[x];
        }
        return x; 
    }

    public boolean isSameBag(int a, int b) {
        return findRep(a) == findRep(b);
    }

    public void mergeBags(int a, int b) {
        parent[findRep(b)] = findRep(a);
    }

}
