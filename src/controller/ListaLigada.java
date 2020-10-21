package controller;

public class ListaLigada<T> {
	
	private NO inicio;
	private int tamanho;
	
	public ListaLigada(){
		this.inicio = null;
		this.tamanho = 0;
	}
	
	public void inserirInicio(T e){
		NO nova = new NO();
		nova.setElemento(e);
		
		if (inicio != null){
			nova.setProximo(inicio);
			inicio.setProximo(null);
		} else {
			nova.setProximo(null);
		}
		
		inicio = nova;
		
		this.tamanho++;
		
	}
	
	public void inserirPosicao(int pos, T e){
		if (pos < this.tamanho){ 
			NO nova = new NO();
			nova.setElemento(e);
			
			NO aux1 = null;
			NO aux2 = null;
			
			for(int i = 0; i < pos; i++){ 
				if (i == 0){
					aux1 = inicio;
				} else {
					aux1 = aux1.getProximo();
				}
			}
			aux2 = aux1.getProximo();
			aux1.setProximo(nova);
			nova.setProximo(aux2);
			this.tamanho++;
		} else {
			System.out.println("Posição inválida!");
		}
		
	}
	
	public void inserirFinal(T elemento){ 
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
		
		this.tamanho++;
	}
	
	public T removeInicio(){
		T elemento = null; 
		if (estaVazia()){
			System.out.println("Nada a exibir, lista vazia");
		} else {
			NO aux = inicio; 
			elemento = (T) aux.getElemento(); 
			inicio = aux.getProximo(); 
		}
		this.tamanho--;
		return elemento;
		
	}
	
	public T removePosicao(int pos){
		T retorno = null;
		int i = 0;
		NO aux1 = inicio;
		NO aux2 = inicio;
		
		if (estaVazia()){
			System.out.println("Nada a remover, lista vazia");			
		} else{
			while (i < pos){
				aux2 = aux1;
				aux1 = aux1.getProximo();
				i++;
			}
			retorno = (T) aux1.getElemento();
			aux2.setProximo(aux1.getProximo());
		}
		this.tamanho--;
		return retorno;
	}
	
	public T removeFinal(){
		T retorno = null;
		if (estaVazia()){
			System.out.println("Nada a remover, lista vazia");			
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
		this.tamanho--;
		return retorno;
	}
	
	public boolean estaVazia(){
		return this.inicio == null;
	}
	
	public void listar(){
		if (estaVazia()){
			System.out.println("Nada a exibir, lista vazia");			
		} else {
			NO aux = inicio;
			String listaCompleta = "[";
			while (aux != null){
				listaCompleta += aux.getElemento() + "]\n[";
				aux = aux.getProximo();
			}
			listaCompleta += "]";
			System.out.println(listaCompleta);
		}
		
	}
	

}
