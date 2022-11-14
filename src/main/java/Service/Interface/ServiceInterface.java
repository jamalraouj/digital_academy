package Service.Interface;

import java.util.List;

public interface ServiceInterface<T> {
    public void insert(T o);
    public void delete(T o);
    public List<T> findAll();
    public void update(T o);
}
