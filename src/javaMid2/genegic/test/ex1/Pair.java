package javaMid2.genegic.test.ex1;

public class Pair <T,V>{
    private T key;
    private V value;

    public T getFirst() {
        return key;
    }

    public void setFirst(T key) {
        this.key = key;
    }

    public V getSecond() {
        return value;
    }

    public void setSecond(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
