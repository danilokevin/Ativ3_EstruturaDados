package view;

import controller.Curso;
import controller.ListaLigada;

public class TesteListaLigada {

	public static <T> void main(String[] args) {
		
		ListaLigada<T> lista = new ListaLigada();
		
		Curso c1 = new Curso(1, "Matematica", "Exatas", 5, 'N');
		Curso c2 = new Curso(2, "Fisica", "Exatas", 5, 'T');
		Curso c3 = new Curso(3, "Prob e Estat", "Exatas", 4, 'N');
		Curso c4 = new Curso(4, "Calculo", "Exatas", 5, 'M');
		
		//System.out.println(lista.estaVazia());
//				true
		
		lista.inserirInicio((T) c1);
		//lista.listar();
//				[Curso [id=1, nome=Matematica, area=Exatas, semestres=5, periodo=N]][]
		
		lista.inserirInicio((T) c2);
		//lista.listar();
//				[Curso [id=2, nome=Fisica, area=Exatas, semestres=5, periodo=T]]
//				[Curso [id=1, nome=Matematica, area=Exatas, semestres=5, periodo=N]]
//				[]
		
		lista.inserirFinal((T) c3);
		//lista.listar();
//				[Curso [id=2, nome=Fisica, area=Exatas, semestres=5, periodo=T]]
//				[Curso [id=1, nome=Matematica, area=Exatas, semestres=5, periodo=N]]
//				[Curso [id=3, nome=Prob e Estat, area=Exatas, semestres=4, periodo=N]]
//				[]
		
		lista.inserirPosicao(2, (T) c4);
		//lista.listar();
//				[Curso [id=2, nome=Fisica, area=Exatas, semestres=5, periodo=T]]
//				[Curso [id=1, nome=Matematica, area=Exatas, semestres=5, periodo=N]]
//				[Curso [id=4, nome=Calculo, area=Exatas, semestres=5, periodo=M]]
//				[Curso [id=3, nome=Prob e Estat, area=Exatas, semestres=4, periodo=N]]
//				[]
		
		//System.out.println(lista.estaVazia());
//				false
		
		lista.removeInicio();
		//lista.listar();
//				[Curso [id=1, nome=Matematica, area=Exatas, semestres=5, periodo=N]]
//				[Curso [id=4, nome=Calculo, area=Exatas, semestres=5, periodo=M]]
//				[Curso [id=3, nome=Prob e Estat, area=Exatas, semestres=4, periodo=N]]
//				[]
		
		lista.removePosicao(1);
		//lista.listar();
//				[Curso [id=1, nome=Matematica, area=Exatas, semestres=5, periodo=N]]
//				[Curso [id=3, nome=Prob e Estat, area=Exatas, semestres=4, periodo=N]]
//				[]

		lista.removeFinal();
		//lista.listar();
//				[Curso [id=1, nome=Matematica, area=Exatas, semestres=5, periodo=N]]
//				[]


	}

}
