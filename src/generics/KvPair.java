package generics;

public class KvPair<T> {
    private T key;
    private T val;

    public KvPair(T key, T val) {
        this.key = key;
        this.val = val;
    }
}
