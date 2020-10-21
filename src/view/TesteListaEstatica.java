package view;

import controller.Curso;
import controller.ListaEstatica;

public class TesteListaEstatica {

	public static <T> void main(String[] args) {
		
		ListaEstatica<T> lista = new ListaEstatica(4);
		
		Curso c1 = new Curso(1, "Matematica", "Exatas", 5, 'N');
		Curso c2 = new Curso(2, "Fisica", "Exatas", 5, 'T');
		Curso c3 = new Curso(3, "Prob e Estat", "Exatas", 4, 'N');
		Curso c4 = new Curso(4, "Calculo", "Exatas", 5, 'M');
		
		System.out.println("Lista vazia: " + lista.estaVazia()); 
				//true
		
		lista.adicionaInicio((T) c1);
		//System.out.println(lista);
		
		lista.adicionaInicio((T) c2);
		//System.out.println(lista);
//				[Curso [id=2, nome=Fisica, area=Exatas, semestres=5, periodo=T]
//		 		Curso [id=1, nome=Matematica, area=Exatas, semestres=5, periodo=N]]
		
		lista.adicionaFinal((T) c3);
		//System.out.println(lista);
//				[Curso [id=2, nome=Fisica, area=Exatas, semestres=5, periodo=T]
//				 Curso [id=1, nome=Matematica, area=Exatas, semestres=5, periodo=N]
//				 Curso [id=3, nome=Prob e Estat, area=Exatas, semestres=4, periodo=N]]
		
		lista.adicionaQualquer((T) c4, 2);
		//System.out.println(lista);
//				[Curso [id=2, nome=Fisica, area=Exatas, semestres=5, periodo=T]
//				 Curso [id=1, nome=Matematica, area=Exatas, semestres=5, periodo=N]
//				 Curso [id=4, nome=Calculo, area=Exatas, semestres=5, periodo=M]
//				 Curso [id=3, nome=Prob e Estat, area=Exatas, semestres=4, periodo=N]]
		
		lista.adicionaFinal((T) c3);
//				Lista cheia!
		
		lista.removeQualquer(1);
		//System.out.println(lista);
//				[Curso [id=2, nome=Fisica, area=Exatas, semestres=5, periodo=T]
//				 Curso [id=4, nome=Calculo, area=Exatas, semestres=5, periodo=M]
//				 Curso [id=3, nome=Prob e Estat, area=Exatas, semestres=4, periodo=N]]
		
		lista.removeUltimo();
		//System.out.println(lista);
//				[Curso [id=2, nome=Fisica, area=Exatas, semestres=5, periodo=T]
//				 Curso [id=4, nome=Calculo, area=Exatas, semestres=5, periodo=M]]


		lista.removeUltimo();
		//System.out.println(lista);
//				[Curso [id=2, nome=Fisica, area=Exatas, semestres=5, periodo=T]]


	}

}
