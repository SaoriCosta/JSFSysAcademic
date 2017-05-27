package br.com.jsfsysacademic.beans;



import javax.faces.bean.ManagedBean;

import br.com.jsfsysacademic.entidades.Disciplina;
import br.com.jsfsysacademic.entidades.Professor;
import br.com.jsfsysacademic.repository.DisciplinaRepository;
import br.com.jsfsysacademic.repository.DisciplinaRepositoryy;

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
		return "/disciplina";
	}
	public String salvar(){
		
		if(DisciplinaRepository.getById(disciplina.getId()) == null){
			DisciplinaRepository.save(disciplina);
			setDisciplina(new Disciplina());
			return "/disciplina";
		}
		DisciplinaRepository.update(disciplina);
		setDisciplina(new Disciplina());
		return "/disciplina";
	}
	
	
	
	
}
