
public class ListaEncadeada <T> extends ListaAbstrata<T>{
	private No inicio;
	private No fim;
	
	private class No{
		T info;
		No prox;
		No(T informacao){
			this.info = informacao;
			this.prox = null;
		}
	}
	
	public ListaEncadeada() {
		super();
		this.inicio = null;
		this.fim = null;
	}
	
	//Adicionar novo No ao final
	public boolean add(T info) {
		return add(info, size());
	}
	
	//Adicionar novo No na posição
	public boolean add(T info, int pos) {
		if(pos<0 || pos > size)
			throw new IllegalArgumentException("Posição incorreta");
		No novoNo = new No(info);
		
		if(size == 0) {
			this.inicio = novoNo;
			this.fim = novoNo;
			size++;
			return true;
		}
		else {
			
			if(pos == 0) {
				novoNo.prox = this.inicio;
				this.inicio = novoNo;
				size++;
				return true;
			}
			else if(pos == size) {
				this.fim.prox = novoNo;
				this.fim = novoNo;
				size++;
				return true;
			}
			else {
				int count = 0;
				No atual = this.inicio;
				No ant = null;
				while(count != pos) {
					ant = atual;
					atual = atual.prox;
					count++;
				}
				ant.prox = novoNo;
				novoNo.prox = atual;
				size++;
				return true;
			}	
		}
	}
	
	//Retorna elemento pela informação
	public T get(T informacao) {
		No aux = this.inicio;
		while(aux != null) {
			if(aux.info == informacao) {
				return aux.info;
			}
			aux = aux.prox;
		}
		return null;
	}
	
	//Retorna elemento pela posição
	public T getPos(int pos) {
		if(pos<0 || pos>this.size-1) throw new IllegalArgumentException("Posição inválida");
		No aux = this.inicio;
		int count = 0;
		while(aux != null && count != pos) {
			count++;
			aux = aux.prox;
		}
		return aux.info;
	}
	
	//Remover por posição
	public T remove(int pos) {
		if(pos<0 || pos>this.size-1) throw new IllegalArgumentException("Posição inválida");
		No aux = this.inicio;
		if(pos == 0) {
			this.inicio = this.inicio.prox;
		}
		else {
			int count = 0;
			No ant = null;
			while(count < pos) {
				count++;
				ant = aux;
				aux = aux.prox;
			}
			if(pos == this.size - 1) {
				this.fim = ant;
				this.fim.prox = null;
			}
			else {
				ant.prox = aux.prox;
			}
		}
		size--;
		aux.prox = null;
		return aux.info;
	}
	
	//Remove pela info
	public boolean remove(T info) {
		No atual = this.inicio;
		No ant = atual;
		if(atual.info.equals(info)) {
			this.inicio = this.inicio.prox;
		}
		while(atual != null && !atual.info.equals(info)) {
			ant = atual;
			atual = atual.prox;
		}
		if(atual.info.equals(info)) {
			ant.prox = atual.prox;
			size--;
			return true;
		}
		else {
			return false;
		}
	}
}
