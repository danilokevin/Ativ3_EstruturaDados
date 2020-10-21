package controller;

public class ListaDuplamEncadeadaRecursiva implements Comparable {
	
	private NODuplo inicio;
	
	public ListaDuplamEncadeadaRecursiva(){
		this.inicio = null;
	}
	
	public boolean ListaVazia(){
		return this.inicio == null;
	}
	
	public void AdicionaInicio(Object novo){
		NODuplo n = new NODuplo(novo);
		
		if (this.inicio == null){
			this.inicio = n;
		} else {
			n.setProx(inicio);
			inicio.setAnt(n);
			inicio = n;
		}
		
		
	}
	
	public void AdicionaFinal(Object novo){
		NODuplo n = new NODuplo(novo);
		
		if (this.inicio == null){
			this.inicio = n;
		} else {
			NODuplo aux = inicio;
			
			buscarUltimo(aux, n);
			
		}
		
	}
	
	private void buscarUltimo(NODuplo aux, NODuplo n) {
		if (aux.getProx() != null){
			aux = aux.getProx();
			buscarUltimo(aux, n);
		} else {
			aux.setProx(n);
			n.setAnt(aux);
			n.setProx(null);
		}
		
	}
	
	public void removeUltimo(){
		Object retorno = null;
		
		if (ListaVazia()){
			System.out.println("Lista Vazia");
		} else {
			if (inicio.getProx() == null){
				retorno = inicio;
				inicio = null;
				System.out.println("Elemento removido: \n " + retorno);
			} else {
				NODuplo aux = inicio;
				NODuplo aux2;
				aux2 = localizaDado(aux, aux);
				retorno = aux2.getProx().getDado();
				aux2.setProx(null);
				System.out.println("Elemento removido: \n " + retorno);
			}
		}
	}

	private NODuplo localizaDado(NODuplo aux1, NODuplo aux2) {
		if (aux1.getProx() != null){
			aux2 = aux1;
			aux1 = aux1.getProx();
			return localizaDado(aux1, aux2);
		} 
		
		return aux2;
	}
	
	public void removeInicio(){
		Object retorno = null;
		
		if (ListaVazia()){
			System.out.println("Lista vazia!");
		} else {
			retorno = inicio.getDado();
			inicio = inicio.getProx();
			
			if (inicio != null){
				inicio.setAnt(null);
			}
			
			System.out.println("Elemento removido: \n" + retorno);
		}
	}

	public void exibir(){
		String e = "";
		NODuplo aux = this.inicio;
		
		e = percorrerLista(e, aux);
		
		System.out.println(e);
	}
	
	public String percorrerLista(String msg, NODuplo aux){
		if (aux != null){
			msg += aux.getDado() + "\n";
			aux = aux.getProx();
			return percorrerLista(msg, aux);
		}
		
		return msg;
	}
	
	public void ordenarLista(){
		Curso dados[] = new Curso[verificarTamanho()];
		preencherVetor(dados);

	}
	
	private int verificarTamanho() {
		NODuplo aux = inicio;
		int cont = 0;  
		
		while (aux != null){
			cont++;
			aux = aux.getProx();
		}
		
		return cont;
	}
	
	private void preencherVetor(Curso[] dados) {
		NODuplo aux = inicio;
		
		for(int i = 0; i < dados.length; i++){
			dados[i] = (Curso) aux.getDado();
			aux = aux.getProx();
		}
		
		ordenarVetor(dados);
	}

	private void ordenarVetor(Curso[] dados) {
		Curso auxiliar = null;
		
		for (int i = 0; i < dados.length - 1; i++){
			for (int j = i+1; j < dados.length; j++){
				if (dados[i].getNome().compareTo(dados[j].getNome()) > 0){
					auxiliar = dados[i];
					dados[i] = dados[j];
					dados[j] = auxiliar;
				};
			}
		}
		
		NODuplo aux = inicio;
		
		for (int i = 0; i < dados.length; i++){
			aux.setDado(dados[i]);
			aux = aux.getProx();
		}
		
	}
	

	@Override
	public int compareTo(Object arg0) {
		
		return 0;
	}

	

	public void buscaSequencial(String elemento){
		NODuplo aux = inicio;
		int pos = 1;
		
		busca(aux, pos, elemento);		
	}

	private void busca(NODuplo aux, int pos, String elemento) {
		if (aux != null){
			if (aux.getDado().toString().contains(elemento)){
				System.out.println("Elemento encontrado na posição " + pos + " da lista");
				System.out.println(aux.getDado());
			} else {
				aux = aux.getProx();
				pos++;
				busca(aux, pos, elemento);
				
			}
		} else {
			System.out.println("Elemento NÃO encontrado");
		}
		
	}

	

}
