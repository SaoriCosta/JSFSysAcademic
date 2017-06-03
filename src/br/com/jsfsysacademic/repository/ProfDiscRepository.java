package br.com.jsfsysacademic.repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import br.com.jsfsysacademic.entidades.Disciplina;
import br.com.jsfsysacademic.entidades.ProfDisc;

public class ProfDiscRepository {
			
	private static List<ProfDisc> list = new ArrayList();
	private static int id = 1;
	

	public static ProfDisc getById(int id){
	
		for(ProfDisc profDisc : list){
			if(profDisc.getId() == id){
				return profDisc;
			}
		}
		return null;
	}
	
	public static void save(ProfDisc profDisc){
		profDisc.setId(id);
		list.add(profDisc);
		id++;	
	}
	
	public static void update(ProfDisc profDisc){
		for (Iterator<ProfDisc> it = list.iterator(); it.hasNext();) {
			ProfDisc a = it.next();
			if (a.getId() == profDisc.getId()) {
				a.setDisciplina(profDisc.getDisciplina());
				a.setProfessor(profDisc.getProfessor());
				System.out.println("Updated: " + profDisc);
				return;
			}
		}
	}
	
	public static void delete(ProfDisc profDisc){
		Iterator<ProfDisc> iter = list.iterator();
		while(iter.hasNext()){
			ProfDisc p = iter.next();
			if(p.getId() == profDisc.getId()){
				iter.remove();
			}
		}
	}
	
	public static List<ProfDisc> getDisciplina(){
		return list;
	}
	

}
