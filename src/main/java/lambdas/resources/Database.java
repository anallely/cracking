package lambdas.resources;

public interface Database<T> {
    void add(T employee);

    T findById(int id);
}
