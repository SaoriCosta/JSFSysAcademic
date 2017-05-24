package br.com.jsfsysacademic.beans;

import javax.annotation.ManagedBean;

import br.com.jsfsysacademic.entidades.Professor;

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
	
	
}
