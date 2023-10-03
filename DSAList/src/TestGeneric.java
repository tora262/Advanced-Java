public class TestGeneric<T extends Number, K, V> {
    public void display(T s) {
        System.out.println(s);
    }

    public void doing(K k, V v) {
        System.out.println(k);
        System.out.println(v);
    }
}
