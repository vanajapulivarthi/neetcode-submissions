class MyHashSet {

    int[] m = new int[1000001];

    public MyHashSet() {
        Arrays.fill(m, -1);
    }

    public void add(int key) {
        m[key] = 1;
    }

    public void remove(int key) {
        m[key] = -1;
    }

    public boolean contains(int key) {
        return m[key] != -1;
    }
}