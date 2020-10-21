package view;

import controller.Curso;
import controller.ListaDuplamEncadeadaRecursiva;

public class TesteListaDuplaEncadeadaRecursiva {

	public static void main(String[] args) {
		ListaDuplamEncadeadaRecursiva lista = new ListaDuplamEncadeadaRecursiva();
		
		Curso c1 = new Curso(1, "Matematica", "Exatas", 5, 'N');
		Curso c2 = new Curso(2, "Fisica", "Exatas", 5, 'T');
		Curso c3 = new Curso(3, "Prob e Estat", "Exatas", 4, 'N');
		Curso c4 = new Curso(4, "Calculo", "Exatas", 5, 'M');
		
		//System.out.println(lista.ListaVazia());
//				true
		
		lista.AdicionaFinal(c1);
		//lista.exibir();
//				Curso [id=1, nome=Matematica, area=Exatas, semestres=5, periodo=N]
		
		lista.AdicionaFinal(c2);
		//lista.exibir();
//				Curso [id=1, nome=Matematica, area=Exatas, semestres=5, periodo=N]
//				Curso [id=2, nome=Fisica, area=Exatas, semestres=5, periodo=T]
		
		lista.AdicionaInicio(c3);
		//lista.exibir();
//				Curso [id=3, nome=Prob e Estat, area=Exatas, semestres=4, periodo=N]
//				Curso [id=1, nome=Matematica, area=Exatas, semestres=5, periodo=N]
//				Curso [id=2, nome=Fisica, area=Exatas, semestres=5, periodo=T]
		
		lista.AdicionaInicio(c4);
		//lista.exibir();
//				Curso [id=4, nome=Calculo, area=Exatas, semestres=5, periodo=M]
//				Curso [id=3, nome=Prob e Estat, area=Exatas, semestres=4, periodo=N]
//				Curso [id=1, nome=Matematica, area=Exatas, semestres=5, periodo=N]
//				Curso [id=2, nome=Fisica, area=Exatas, semestres=5, periodo=T]
		
		lista.ordenarLista();
		//lista.exibir();
//				Curso [id=4, nome=Calculo, area=Exatas, semestres=5, periodo=M]
//				Curso [id=2, nome=Fisica, area=Exatas, semestres=5, periodo=T]
//				Curso [id=1, nome=Matematica, area=Exatas, semestres=5, periodo=N]
//				Curso [id=3, nome=Prob e Estat, area=Exatas, semestres=4, periodo=N]
		
		lista.removeInicio();
		//lista.exibir();
//			Elemento removido: 
//			Curso [id=4, nome=Calculo, area=Exatas, semestres=5, periodo=M]
//					
//							Curso [id=2, nome=Fisica, area=Exatas, semestres=5, periodo=T]
//							Curso [id=1, nome=Matematica, area=Exatas, semestres=5, periodo=N]
//							Curso [id=3, nome=Prob e Estat, area=Exatas, semestres=4, periodo=N]
		
		lista.removeUltimo();
		lista.exibir();
//			Elemento removido: 
//			Curso [id=3, nome=Prob e Estat, area=Exatas, semestres=4, periodo=N]
		
//							Curso [id=2, nome=Fisica, area=Exatas, semestres=5, periodo=T]
//							Curso [id=1, nome=Matematica, area=Exatas, semestres=5, periodo=N]

					
	}

}
