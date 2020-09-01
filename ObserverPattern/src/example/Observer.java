package example;

/**
 * @param <T> the type of the returned data in {@link #update(Object)}
 */
public interface Observer<T> {
    void update(T data);
}
