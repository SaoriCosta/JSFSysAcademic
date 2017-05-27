package br.com.jsfsysacademic.beans;


import java.util.List;

import javax.faces.bean.ManagedBean;

import br.com.jsfsysacademic.entidades.Aluno;
import br.com.jsfsysacademic.repository.AlunoRepository;

@ManagedBean
public class AlunoBean {
	
	private Aluno aluno;
	
	public AlunoBean() {
		aluno =  new Aluno();
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	
	public List<Aluno> getAlunos(){
		return AlunoRepository.getAlunos();
	}
	
	public String remover(Aluno aluno){
		AlunoRepository.delete(aluno);
		setAluno(new Aluno());
		return "/aluno";
	}
	
	public String salvar(){
		
		if(AlunoRepository.getById(aluno.getId())==null){
			AlunoRepository.save(aluno);
			setAluno(new Aluno());
			return "/index.jsf";
		}
		
		AlunoRepository.update(getAluno());
		setAluno(new Aluno());
		return "/aluno";
	
	}
	
	}
	
	
