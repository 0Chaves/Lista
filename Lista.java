
public interface Lista <T>{
	public boolean add(T info);
	public boolean add(T info, int pos);
	public T getPos(int pos);
	public T remove(int pos);
	public boolean remove(T info);
	public int size();
}
