package controller;

public class ListaEstatica <T> {
	
	protected T[] elementos;
	protected int tamanho;
	
	public ListaEstatica(int capacidades) {
		this.elementos = (T[]) new Curso[capacidades];
		this.tamanho = 0;
	}
	
	public void adicionaInicio(T elemento){
		if (this.tamanho < this.elementos.length){
			for(int i=this.tamanho;i>0;i--){
				this.elementos[i] = this.elementos[i-1];
			}
			this.elementos[0] = elemento;
			this.tamanho++;			
			
		} else {
			System.out.println("Vetor cheio. Não é possível adicionar um novo elemento");
		}
	}
	
	public void adicionaQualquer(T novo, int pos){
		if (!(pos >= 0 && pos < this.tamanho)){
			System.out.println("Posição Inválida");
		} else {
			for (int i=this.tamanho-1;i>= pos; i--){
				this.elementos[i+1] = this.elementos[i];
			}

			this.elementos[pos] = novo;
			this.tamanho++;
		}
	}
	
	public void adicionaFinal(T elemento) {
		if (this.tamanho < this.elementos.length){
			this.elementos[this.tamanho] = elemento; 
			this.tamanho++;
			
		} else {
			System.out.println("Lista cheia!");
		}
	}
	
	public T removeUltimo(){
		T retorno = null;
		
		if (estaVazia()){
			retorno = (T) "Lista vazia";
		} else {
			retorno = this.elementos[this.tamanho - 1];
			this.tamanho--;
		}
		
		return retorno;
		
	}
	
	public T removeQualquer(int pos){
		if (!(pos >= 0 && pos < this.tamanho)){
			throw new IllegalArgumentException("Posição Inexistente");
		}
		T retorno = this.elementos[pos];
		
		for (int i=pos; i<this.tamanho-1;i++){
			this.elementos[i] = this.elementos[i+1];
		}
		
		this.tamanho--;
		
		return retorno;
	}
	
	public T removeInicio(){
		T retorno = null;
		
		if (estaVazia()){
			retorno = (T) "Lista vazia";
		} else {
			retorno = this.elementos[0];
			
			this.tamanho--;
			
			for (int i = 0; i < this.tamanho - 1; i++){
				this.elementos[i] = this.elementos[i++];
			}
		}
		
		return retorno;
	}
	
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("[");
		for (int i=0; i<this.tamanho-1;i++){
			s.append(this.elementos[i]);
			s.append("\n ");
		}

		if (this.tamanho > 0){
			s.append(this.elementos[this.tamanho-1]);
		}

		s.append("]");
		return s.toString();
	}
	
	public boolean estaVazia(){
		return this.tamanho == 0;
	}

}
