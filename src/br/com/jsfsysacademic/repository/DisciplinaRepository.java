package br.com.jsfsysacademic.repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import br.com.jsfsysacademic.entidades.Aluno;
import br.com.jsfsysacademic.entidades.Disciplina;

public class DisciplinaRepository {

	private static List<Disciplina> disciplinas = new ArrayList<>();
	private static int id = 0;
	
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
		Disciplina dis = getById(disciplina.getId());
		
		if(dis != null){
			dis.setCodigo(disciplina.getCodigo());
			dis.setCredito(disciplina.getCredito());
			dis.setDisciplina(disciplina.getDisciplina());
			dis.setId(disciplina.getId());
			dis.setPeriodo(dis.getPeriodo());
			
			int index = 0;
			for(Disciplina d : disciplinas){
				if(d.getId() == dis.getId()){
					disciplinas.remove(index);
					disciplinas.add(dis);
				}
			index++;	
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
