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
		
		for (Iterator<Aluno> it = alunos.iterator(); it.hasNext();) {
			Aluno a = it.next();
			if (a.getId() == aluno.getId()) {
				a.setNome(aluno.getNome());
				a.setEmail(aluno.getEmail());
				a.setTelefone(aluno.getTelefone());
				a.setCpf(aluno.getCpf());
				a.setSenha(aluno.getSenha());
				System.out.println("Updated: " + aluno);
				return;
			}
}
		
		
		
		
		
	}
	
	
}
