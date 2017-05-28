package br.com.jsfsysacademic.beans;



import java.util.List;

import javax.faces.bean.ManagedBean;

import br.com.jsfsysacademic.entidades.Disciplina;
import br.com.jsfsysacademic.entidades.Professor;
import br.com.jsfsysacademic.repository.DisciplinaRepository;
import br.com.jsfsysacademic.repository.ProfessorRepository;

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
	
	public String remover(Disciplina disciplina){
		
		DisciplinaRepository.delete(disciplina);
		setDisciplina(new Disciplina());
		return "/lista-disciplina.jsf";
	}
	public String salvar(){
		
		if(DisciplinaRepository.getById(disciplina.getId()) == null){
			DisciplinaRepository.save(disciplina);
			setDisciplina(new Disciplina());
			return "/lista-disciplina.jsf";
		}
		DisciplinaRepository.update(disciplina);
		setDisciplina(new Disciplina());
		return "/lista-disciplina.jsf";
	}
	
	public List<Disciplina> getDisciplinas(){
		return DisciplinaRepository.getDisciplina();
	}
	
	public String update(Disciplina disciplina){
		setDisciplina(disciplina);
		return salvar();
	}
	
	
}
