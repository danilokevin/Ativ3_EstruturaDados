package controller;

public class PilhaSimplesmenteDinamica <T> {
	
	private T[] elementos;
	private NO inicio;
	
	public PilhaSimplesmenteDinamica(int capacidades) {
		this.elementos = (T[]) new Curso[capacidades];
		this.inicio = null;
	}
	
	public void empilhar(T elemento){ 
		NO nova = new NO();
		nova.setElemento(elemento); 
		nova.setProximo(null); 
		
		if (inicio == null){ 
			inicio = nova;
		} else {
			NO aux = inicio; 
			while (aux.getProximo() != null){ 				
				aux = aux.getProximo();
			}
			aux.setProximo(nova); 
		}
		
		
	}
	
	public T desempilhar(){
		T retorno = null;
		
		if (estaVazia()){
			retorno = (T) "Nada a remover, lista vazia";			
		} else if (inicio.getProximo() == null){
			retorno = (T) inicio.getElemento();
			inicio = null;			
		} else {
			NO aux1 = inicio;
			NO aux2 = inicio;
			
			while (aux1.getProximo() != null){
				aux2 = aux1;
				aux1 = aux1.getProximo();
			}
			
			retorno = (T) aux1.getElemento();
			aux2.setProximo(null);
		}
		
		
		return retorno;
	}
	
	public boolean estaVazia(){
		return this.inicio == null;
	}
	
	
	public void percorrer(){
		if (estaVazia()){
			System.out.println("Nada a exibir, lista vazia");			
		} else {
			NO aux = inicio;
			String listaCompleta = "[";
			while (aux != null){
				listaCompleta += aux.getElemento() + "]\n[";
				aux = aux.getProximo();
			}
			listaCompleta += "topo]";
			System.out.println(listaCompleta);
			
		}
		
	}

}
