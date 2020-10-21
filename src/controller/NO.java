package controller;

public class NO <T> {
	private T elemento;
	private NO proximo;
	
	
	public T getElemento() {
		return elemento;
	}
	
	public void setElemento(T elemento2) {
		this.elemento = elemento2;
	}
	
	public NO getProximo() {
		return proximo;
	}
	
	public void setProximo(NO proximo) {
		this.proximo = proximo;
	}
	

}
