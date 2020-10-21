package controller;

public class NODuplo {
	private Object dado;
	private NODuplo ant;
	private NODuplo prox;
	
	public NODuplo(Object aluno){
		this.dado = aluno;
		this.ant = null;
		this.prox = null;
	}

	public Object getDado() {
		return dado;
	}
	

	public void setDado(Object dado) {
		this.dado = dado;
	}

	public NODuplo getAnt() {
		return ant;
	}

	public void setAnt(NODuplo ant) {
		this.ant = ant;
	}

	public NODuplo getProx() {
		return prox;
	}

	public void setProx(NODuplo prox) {
		this.prox = prox;
	}
}
