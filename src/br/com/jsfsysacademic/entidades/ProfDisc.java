package br.com.jsfsysacademic.entidades;

import java.util.List;

public class ProfDisc {
	
	public List<Disciplina> disciplina;
	public Professor professor;
	public int id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<Disciplina> getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(List<Disciplina> disciplina) {
		this.disciplina = disciplina;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
	
	
}
