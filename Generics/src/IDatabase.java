/**
 * @author Nida Başer
 * March 2024
 */
public interface IDatabase<T> {

    public boolean insert(T data);

    public boolean delete(T data);

    public boolean update(T data);

    public T select();


}
