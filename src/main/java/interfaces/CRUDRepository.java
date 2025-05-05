package interfaces;

import java.util.List;

public interface CRUDRepository<T> {
	public List<T> getAll();
	public boolean add(T t);
	public boolean update(T t);
	public boolean delete(T t);
}
