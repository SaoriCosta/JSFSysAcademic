package br.com.jsfsysacademic.beans;

import java.util.List;

import br.com.jsfsysacademic.entidades.Disciplina;
import br.com.jsfsysacademic.entidades.ProfDisc;
import br.com.jsfsysacademic.entidades.Professor;
import br.com.jsfsysacademic.repository.DisciplinaRepository;
import br.com.jsfsysacademic.repository.ProfDiscRepository;

public class ProfDiscBean {
	
	private ProfDisc profDiscBean;
	
	public ProfDiscBean() {
		profDiscBean = new ProfDisc();
	}

	public ProfDisc getProfDisc() {
		return profDiscBean;
	}

	public void setProfDiscBean(ProfDisc profDiscBean) {
		this.profDiscBean = profDiscBean;
	}
	

	public String remover(Disciplina disciplina){
		
		DisciplinaRepository.delete(disciplina);
		setProfDiscBean(new ProfDisc());
		return "/lista-disciplina.jsf";
	}
	public String salvar(List<Disciplina> d,Professor p){
		
		if(ProfDiscRepository.getById(profDiscBean.getId()) == null){
			profDiscBean.setDisciplina(d);
			profDiscBean.setProfessor(p);
			ProfDiscRepository.save(profDiscBean);
			setProfDiscBean(new ProfDisc());
			return "/lista-disciplina.jsf";
		}
		profDiscBean.setDisciplina(d);
		profDiscBean.setProfessor(p);
		ProfDiscRepository.update(profDiscBean);
		setProfDiscBean(new ProfDisc());
		return "/lista-disciplina.jsf";
	}
	
	public List<ProfDisc> getProfDisciplinas(){
		return ProfDiscRepository.getDisciplina();
	}
	
	public String carregar(Disciplina disciplina){
		System.out.println("Carregar - " + disciplina);
		setProfDiscBean(profDiscBean);
		return "/disciplina.jsf";
}
	
	
	
}
