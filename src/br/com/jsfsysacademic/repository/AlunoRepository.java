package br.com.jsfsysacademic.repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import br.com.jsfsysacademic.entidades.Aluno;
import br.com.jsfsysacademic.entidades.Professor;

public class AlunoRepository {

	private static List<Aluno> alunos = new ArrayList<>();
	private static int id = 1;
	
	
	public static Aluno getById(int id){
		for(Aluno aluno : alunos){
			if(id == aluno.getId()){
				return aluno;
			}
		}
		return null;
	}
	
	public static void save(Aluno aluno){
		aluno.setId(id);
		alunos.add(aluno);
		id++;
	}
	
	public static List<Aluno> getAlunos(){
		return alunos;
	}
 	
	public static void delete(Aluno aluno){
		Iterator<Aluno> iter = alunos.iterator();
		while(iter.hasNext()){
			Aluno p = iter.next();
			if(p.getId() == aluno.getId()){
				iter.remove();
			}
		}
	}
	
	public static void update(Aluno aluno){
		
		Aluno aluno2 = getById(aluno.getId());
		
		if(aluno2 != null ){
			
			aluno2.setCpf(aluno.getCpf());
			aluno2.setEmail(aluno.getEmail());
			aluno2.setNome(aluno.getNome());
			aluno2.setId(aluno.getId());
			aluno2.setTelefone(aluno.getTelefone());
			int index = 0;
			for(Aluno a : alunos){
				if(a.getId() == aluno2.getId()){
					alunos.remove(index);
					alunos.add(aluno2);
				}
			index++;	
			}
		}
	
		
		
		
		
		
	}
	
	
}
