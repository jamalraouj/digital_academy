package Service.Interface;

import Entity.Participation;

import java.util.List;

public interface ServiceInterface<T> {
    public T insert(T o);
    public void delete(T o);
    public List<T> findAll();
    public void update(T o);
    public T findById(long t);
}
