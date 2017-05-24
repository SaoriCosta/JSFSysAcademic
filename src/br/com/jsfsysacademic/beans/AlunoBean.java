package br.com.jsfsysacademic.beans;

import javax.annotation.ManagedBean;

import br.com.jsfsysacademic.entidades.Aluno;

@ManagedBean
public class AlunoBean {
	
	private Aluno aluno;
	
	private AlunoBean() {
		aluno =  new Aluno();
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	
	
	
}
