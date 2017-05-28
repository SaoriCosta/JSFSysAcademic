package br.com.jsfsysacademic.beans;



import java.util.List;

import javax.faces.bean.ManagedBean;

import br.com.jsfsysacademic.entidades.Aluno;
import br.com.jsfsysacademic.entidades.Professor;
import br.com.jsfsysacademic.repository.AlunoRepository;
import br.com.jsfsysacademic.repository.ProfessorRepository;

@ManagedBean
public class ProfessorBean {

	private Professor professor;
		
	public ProfessorBean() {
		professor = new Professor();
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
	public String remover(Professor professor){
		
		ProfessorRepository.delete(professor);
		setProfessor(new Professor());
		return "/lista-prof.jsf";
	}
	public String salvar(){
		
		if(ProfessorRepository.getById(professor.getId()) == null){
			ProfessorRepository.save(professor);
			setProfessor(new Professor());
			return "/lista-prof.jsf";
		}
		ProfessorRepository.update(professor);
		setProfessor(new Professor());
		return "/lista-prof.jsf";
	}
	public List<Professor> getProfessores(){
		return ProfessorRepository.getProfessores();
	}
}
