public class Map<K, V> {
    private K key;
    private V value;

    public Element<K, V> element;

    public Map() {

    }

    public Map(K key, V value) {
        this.key = key;
        this.value = value;
    }

}
