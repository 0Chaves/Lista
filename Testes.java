import java.util.ArrayList;
import java.util.List;

public class Testes {

	public static void main(String[] args) {
		ListaVetor<Integer> listavetor = new ListaVetor<>();
		
		listavetor.add(5);
		listavetor.add(10);
		listavetor.add(1, 0);
		listavetor.add(2, 1);
		listavetor.add(3, 2);
		listavetor.add(100);
		listavetor.size = 40;
		System.out.println("ListaVetor (Tamanho: "+ listavetor.size()+")");
		for(int i=0; i<listavetor.size(); i++){
			System.out.println(listavetor.getPos(i));
		}
		System.out.println("Apos remover o item: " + listavetor.remove(2));
		for(int i=0; i<listavetor.size(); i++){
			System.out.println(listavetor.getPos(i));
		}
		
		/*Erro! 
		 Chama a função que remove por posição e da invalido */
		
		System.out.println("Removendo o numero 100");
		listavetor.remove(100);
		for(int i=0; i<listavetor.size(); i++){
			System.out.println(listavetor.getPos(i));
		}
				
		ListaEncadeada<String> listaencadeada = new ListaEncadeada<>();
		listaencadeada.add("A");
		listaencadeada.add("B");
		listaencadeada.add("C");
		listaencadeada.add("texto1", 1);
		listaencadeada.add("texto2", 0);
		System.out.print("\n");
		System.out.println("ListaEncadeada (Tamanho: "+ listaencadeada.size()+")");
		for(int i=0; i<listaencadeada.size(); i++){
			System.out.println(listaencadeada.getPos(i));
		}
		System.out.println();
		
		System.out.println("Informação da ultima posição: " + listaencadeada.getPos(listaencadeada.size()-1));
		System.out.println("Tentando encontrar o B: " + listaencadeada.get("B"));
		System.out.println();
		System.out.println("Lista após remover o A e o ultimo item: ");
		listaencadeada.remove("A");
		listaencadeada.remove(listaencadeada.size()-1);
		for(int i=0; i<listaencadeada.size(); i++){
			System.out.println(listaencadeada.getPos(i));
		}
		
	}

}
