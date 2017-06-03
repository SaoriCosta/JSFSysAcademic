package br.com.jsfsysacademic.repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import br.com.jsfsysacademic.entidades.Aluno;
import br.com.jsfsysacademic.entidades.Professor;

public class ProfessorRepository {
	
	private static List<Professor> professores = new ArrayList<>();
	private static int id = 1;
	
	public static Professor getById(int id){
		for (Iterator<Professor> it = professores.iterator(); it.hasNext();) {
			Professor professor = it.next();
			if (professor.getId() == id) {
				return professor;
			}		
		}
		return null;
	}
	public static void save(Professor professor){
		
		professor.setId(id);
		professores.add(professor);
		id++;
		
	}
	public static void update(Professor professor){
		
		for (Iterator<Professor> it = professores.iterator(); it.hasNext();) {
			Professor a = it.next();
			if (a.getId() == professor.getId()) {
				a.setNome(professor.getNome());
				a.setCpf(professor.getCpf());
				System.out.println("Updated: " + professor);
				return;
			}
		}
	}
	public static void delete(Professor professor){
		
		Iterator<Professor> iter = professores.iterator();
		while(iter.hasNext()){
			Professor p = iter.next();
			if(p.getId() == professor.getId()){
				iter.remove();
			}
		}
	
	}
	public static List<Professor> getProfessores(){
		return professores;
	}
}
