package controller;

public class FilaPrioridade<T> implements Comparable {
	
	private NO inicio;
	private int tamanho;
	
	public FilaPrioridade(){
		this.inicio = null;
		this.tamanho = 0;
	}
	
	public void inserir(T elemento){ 
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
		ordenarLista();
		//O CRITÉRIO PARA SE DEFINIR A PRIORIDADE DE INSERÇÃO SERÁ O ID
	}
	
	
	
	public void ordenarLista(){
		Curso dados[] = new Curso[verificarTamanho()];
		preencherVetor(dados);

	}
	
	private int verificarTamanho() {
		NO aux = inicio;
		int cont = 0;  
		
		while (aux != null){
			cont++;
			aux = aux.getProximo();
		}
		
		return cont;
	}
	
	private void preencherVetor(Curso[] dados) {
		NO aux = inicio;
		
		for(int i = 0; i < dados.length; i++){
			dados[i] = (Curso) aux.getElemento();
			aux = aux.getProximo();
		}
		
		ordenarVetor(dados);
	}

	private void ordenarVetor(Curso[] dados) {
		Curso auxiliar = null;
		
		for (int i = 0; i < dados.length - 1; i++){
			for (int j = i+1; j < dados.length; j++){
				if (dados[i].getId() < (dados[j].getId())){
					auxiliar = dados[i];
					dados[i] = dados[j];
					dados[j] = auxiliar;
				};
			}
		}
		
		NO aux = inicio;
		
		for (int i = 0; i < dados.length; i++){
			aux.setElemento(dados[i]);
			aux = aux.getProximo();
		}
		
	}

	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public T remover(){
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
	
	public int obterTamanho(){
		return this.tamanho;
	}
	

	

	

}
