public class Eagle<T> implements Bird<T> {
    @Override
    public void display(T s) {
        System.out.println(s);
    }
}
