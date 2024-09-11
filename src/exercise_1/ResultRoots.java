package exercise_1;

public class ResultRoots<K, V> {
    private K firstRoot;
    private V secondRoot;

    public K getFirstRoot() {
        return firstRoot;
    }

    public V getSecondRoot() {
        return secondRoot;
    }

    public ResultRoots(K firstRoot, V secondRoot) {
        this.firstRoot = firstRoot;
        this.secondRoot = secondRoot;
    }
}
