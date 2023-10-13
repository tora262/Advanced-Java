public class Adder<T extends Number> {
    public int addInteger(T i1, T i2) {
        return i1.intValue() + i2.intValue();
    }

    public Clone<? super T> getClone() {
        return new Clone<>();
    }
}
