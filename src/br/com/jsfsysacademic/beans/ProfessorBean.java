package br.com.jsfsysacademic.beans;



import javax.faces.bean.ManagedBean;

import br.com.jsfsysacademic.entidades.Professor;
import br.com.jsfsysacademic.repository.DisciplinaRepositoryy;

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
		
		DisciplinaRepositoryy.delete(professor);
		setProfessor(new Professor());
		return "/professor";
	}
	public String salvar(){
		
		if(DisciplinaRepositoryy.getById(professor.getId()) == null){
			DisciplinaRepositoryy.save(professor);
			setProfessor(new Professor());
			return "/professor";
		}
		DisciplinaRepositoryy.update(professor);
		setProfessor(new Professor());
		return "/professor";
	}
}
