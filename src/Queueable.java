public interface Queueable<T> {
    public void enqueue(T data);
    public T dequeue();
}
