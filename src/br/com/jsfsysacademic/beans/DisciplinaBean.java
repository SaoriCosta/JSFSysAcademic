package br.com.jsfsysacademic.beans;

import javax.annotation.ManagedBean;

import br.com.jsfsysacademic.entidades.Disciplina;

@ManagedBean
public class DisciplinaBean {

	private Disciplina disciplina;
	
	public DisciplinaBean(){
		disciplina =  new Disciplina();
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	
	
	
}
