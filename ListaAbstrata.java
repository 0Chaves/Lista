
public abstract class ListaAbstrata<T> implements Lista<T>{
	int size;
	
	protected ListaAbstrata() {
		this.size=0;
	}
	
	public abstract boolean add(T info);
	public abstract boolean add(T info, int pos);
	public abstract T getPos(int pos);
	public abstract T remove(int pos);
	public abstract boolean remove(T info);
	public int size() {
		return this.size;
	}
	
}