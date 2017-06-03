package br.com.jsfsysacademic.repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import br.com.jsfsysacademic.entidades.Aluno;
import br.com.jsfsysacademic.entidades.Disciplina;
import br.com.jsfsysacademic.entidades.Professor;

public class DisciplinaRepository {

	private static List<Disciplina> disciplinas = new ArrayList<>();
	private static int id = 1;
	
	public static Disciplina getById(int id){
	
		for(Disciplina disciplina : disciplinas){
			if(disciplina.getId() == id){
				return disciplina;
			}
		}
		return null;
	}
	
	public static void save(Disciplina disciplina){
		
		disciplina.setId(id);
		disciplinas.add(disciplina);
		id++;
	}
	
	public static void update(Disciplina disciplina){
		for (Iterator<Disciplina> it = disciplinas.iterator(); it.hasNext();) {
			Disciplina a = it.next();
			if (a.getId() == disciplina.getId()) {
				a.setCodigo(disciplina.getCodigo());
				a.setCredito(disciplina.getCredito());
				a.setDisciplina(disciplina.getDisciplina());
				a.setPeriodo(disciplina.getPeriodo());
				System.out.println("Updated: " + disciplina);
				return;
			}
		}
	}
	
	public static void delete(Disciplina disciplina){
		Iterator<Disciplina> iter = disciplinas.iterator();
		while(iter.hasNext()){
			Disciplina p = iter.next();
			if(p.getId() == disciplina.getId()){
				iter.remove();
			}
		}
	}
	
	public static List<Disciplina> getDisciplina(){
		return disciplinas;
	}
}
