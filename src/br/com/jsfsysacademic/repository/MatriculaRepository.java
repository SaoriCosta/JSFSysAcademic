package br.com.jsfsysacademic.repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import br.com.jsfsysacademic.entidades.Matricula;


public class MatriculaRepository {

	
	private static List<Matricula> matriculas = new ArrayList<>();
	private static int id = 1;
	
	
	public static void delete(Matricula matricula) {
		Iterator<Matricula> iter = matriculas.iterator();
		while(iter.hasNext()){
			Matricula p = iter.next();
			if(p.getId() == matricula.getId()){
				iter.remove();
			}
		}
		
	}

	public static void save(Matricula matricula) {
		matricula.setId(id);
		matriculas.add(matricula);
		id++;
		
	}

	public static void update(Matricula matricula) {
		
		for (Iterator<Matricula> it = matriculas.iterator(); it.hasNext();) {
			Matricula a = it.next();
			if (a.getId() == matricula.getId()) {
				a.setAlunos(matricula.getAlunos());
				a.setDisciplinas(matricula.getDisciplinas());
				System.out.println("Updated: " + matricula);
				return;
			}
}
		
	}

	public static Matricula getById(int id) {
		for(Matricula matricula : matriculas){
			if(id == matricula.getId()){
				return matricula;
			}
		}
		return null;
	}

	public static List<Matricula> getMatriculas() {
		return matriculas;
	}


}
