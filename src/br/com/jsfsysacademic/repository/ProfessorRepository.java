package br.com.jsfsysacademic.repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import br.com.jsfsysacademic.entidades.Professor;

public class ProfessorRepository {
	
	private static List<Professor> professores = new ArrayList<>();
	private static int id = 0;
	
	public static Professor getById(int id){
		
		for(Professor professor : professores){
				if(professor.getId() == id){
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
		
		Professor p = getById(professor.getId());
		
		if(p != null){
			
			p.setCpf(professor.getCpf());
			p.setId(professor.getId());
			p.setNome(professor.getNome());
			
		}
		int index = 0;
		for(Professor pf : professores){
			
			if(p.getId() == pf.getId()){
				
				professores.remove(index);
				professores.add(p);
			}
			index++;
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