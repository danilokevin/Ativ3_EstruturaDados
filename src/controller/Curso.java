package controller;

public class Curso {
	
	private int id;
	private String nome;
	private String area;
	private int semestres;
	private char periodo;
	
	
	public Curso(int id, String nome, String area, int semestres, char periodo) {
		super();
		this.id = id;
		this.nome = nome;
		this.area = area;
		this.semestres = semestres;
		this.periodo = periodo;
	}


	@Override
	public String toString() {
		return "Curso [id=" + id + ", nome=" + nome + ", area=" + area + ", semestres=" + semestres + ", periodo="
				+ periodo + "]";
	}


	public String getNome() {
		return nome;
	}


	
	
	
	

}
