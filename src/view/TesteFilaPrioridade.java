package view;

import controller.Curso;
import controller.FilaPrioridade;

public class TesteFilaPrioridade {

	public static <T> void main(String[] args) {

		FilaPrioridade<T> fila = new FilaPrioridade();
		
		Curso c1 = new Curso(1, "Matematica", "Exatas", 5, 'N');
		Curso c2 = new Curso(2, "Fisica", "Exatas", 5, 'T');
		Curso c3 = new Curso(3, "Prob e Estat", "Exatas", 4, 'N');
		Curso c4 = new Curso(4, "Calculo", "Exatas", 5, 'M');
		
		//O CRITÉRIO PARA SE DEFINIR A POSIÇÃO DE INSERÇÃO SERÁ O ID DO CURSO
		
		fila.inserir((T) c3);
		fila.inserir((T) c1);
		fila.inserir((T) c4);
		fila.inserir((T) c2);
		
		fila.listar();
//				[Curso [id=4, nome=Calculo, area=Exatas, semestres=5, periodo=M]]
//				[Curso [id=3, nome=Prob e Estat, area=Exatas, semestres=4, periodo=N]]
//				[Curso [id=2, nome=Fisica, area=Exatas, semestres=5, periodo=T]]
//				[Curso [id=1, nome=Matematica, area=Exatas, semestres=5, periodo=N]]
//				[]
		
		//A REMOÇÃO OCORRERÁ SEMPRE NO INICIO, POIS É O CURSO COM PRIORIDADE MAIOR
		fila.remover();
		
		fila.listar();
//				[Curso [id=3, nome=Prob e Estat, area=Exatas, semestres=4, periodo=N]]
//				[Curso [id=2, nome=Fisica, area=Exatas, semestres=5, periodo=T]]
//				[Curso [id=1, nome=Matematica, area=Exatas, semestres=5, periodo=N]]
//				[]
		
		Curso c5 = new Curso(6, "Calculo", "Exatas", 5, 'M');
		
		fila.inserir((T) c5);
		fila.listar();
		
//				[Curso [id=6, nome=Calculo, area=Exatas, semestres=5, periodo=M]]
//				[Curso [id=3, nome=Prob e Estat, area=Exatas, semestres=4, periodo=N]]
//				[Curso [id=2, nome=Fisica, area=Exatas, semestres=5, periodo=T]]
//				[Curso [id=1, nome=Matematica, area=Exatas, semestres=5, periodo=N]]
//				[]
		
		System.out.println("fila esta Vazia? --> " + fila.estaVazia());
		System.out.println("Qtde de elementos na fila:  --> " + fila.obterTamanho());
		
		
		
	}

}
