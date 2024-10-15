public class ListaVetor <T> extends ListaAbstrata<T>{
	
	//Elaborar vetor para que altere o tamanho conforme cresce (igual array bruxo em C)
	private T[] itens;
	private int tamanhoVetor;
	
	@SuppressWarnings("unchecked")
	public ListaVetor() {
		super();
		this.tamanhoVetor = 10;
		this.itens = (T[])new Object[tamanhoVetor];
	}

	//Adicionar novo No ao final
	public boolean add(T info) {
		return add(info, size());
	}
	
	//Adicionar novo No na posição
	public boolean add(T info, int pos) {
		if(pos<0 || pos > tamanhoVetor-1)
			throw new IllegalArgumentException("Posição incorreta");
		if(size<tamanhoVetor) {
			if(itens[pos] == null) {
				itens[pos] = info;
				size++;
			}
			else {
				add(itens[pos]);
				itens[pos] = info;
			}
			return true;
		}
		return false;
	}
	
	//Retorna elemento pela posição
	public T getPos(int pos) {
		if(pos<0 || pos>tamanhoVetor - 1 || itens[pos] == null) throw new IllegalArgumentException("Posição inválida ou vazia");
		return itens[pos];
	}
	
	//Remover por posição
	public T remove(int pos) {
		if(pos<0 || pos>tamanhoVetor - 1 || itens[pos] == null) throw new IllegalArgumentException("Posição inválida");
		T item = itens[pos];
		itens[pos] = itens[size-1];
		size--;
		return item;
	}
	
	//Remove pela info
	public boolean remove(T info) {
		for(int i = 0; i<size; i++) {
			if(itens[i]==info) {
				itens[i] = itens[size-1];
				size--;
				return true;
			}
		}
		return false;
	}	
}
