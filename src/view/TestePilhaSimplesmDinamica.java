package view;

import controller.Curso;
import controller.PilhaSimplesmenteDinamica;

public class TestePilhaSimplesmDinamica {

	public static <T> void main(String[] args) {
		PilhaSimplesmenteDinamica<T> pilha = new PilhaSimplesmenteDinamica(3);
		
		Curso c1 = new Curso(1, "Matematica", "Exatas", 5, 'N');
		Curso c2 = new Curso(2, "Fisica", "Exatas", 5, 'T');
		Curso c3 = new Curso(3, "Prob e Estat", "Exatas", 4, 'N');
		Curso c4 = new Curso(4, "Calculo", "Exatas", 5, 'M');
		
		//System.out.println(pilha.estaVazia());
				//true
		
		//System.out.println(pilha.desempilhar());
				//Nada a remover, lista vazia
		
		pilha.empilhar((T) c1);
		//pilha.percorrer();
//				[Curso [id=1, nome=Matematica, area=Exatas, semestres=5, periodo=N]]
//				[topo]
		
		pilha.empilhar((T) c2);
		//pilha.percorrer();
//				[Curso [id=1, nome=Matematica, area=Exatas, semestres=5, periodo=N]]
//				[Curso [id=2, nome=Fisica, area=Exatas, semestres=5, periodo=T]]
//				[topo]
		
		pilha.empilhar((T) c3);
		//pilha.percorrer();
//				[Curso [id=1, nome=Matematica, area=Exatas, semestres=5, periodo=N]]
//				[Curso [id=2, nome=Fisica, area=Exatas, semestres=5, periodo=T]]
//				[Curso [id=3, nome=Prob e Estat, area=Exatas, semestres=4, periodo=N]]
//				[topo]
		
		//pilha.empilhar((T) c4);
//				Pilha cheia!
		
		pilha.desempilhar();
		//pilha.percorrer();
//				[Curso [id=1, nome=Matematica, area=Exatas, semestres=5, periodo=N]]
//				[Curso [id=2, nome=Fisica, area=Exatas, semestres=5, periodo=T]]
//				[topo]
		
		pilha.desempilhar();
		//pilha.percorrer();
//				[Curso [id=1, nome=Matematica, area=Exatas, semestres=5, periodo=N]]
//				[topo]
		
		//System.out.println(pilha.estaVazia());
//				false
		


	}

}
