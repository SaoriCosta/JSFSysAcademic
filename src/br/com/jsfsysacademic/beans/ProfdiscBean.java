package br.com.jsfsysacademic.beans;

import java.util.List;

import javax.faces.bean.ManagedBean;

import br.com.jsfsysacademic.entidades.Disciplina;
import br.com.jsfsysacademic.entidades.ProfDisc;
import br.com.jsfsysacademic.entidades.Professor;
import br.com.jsfsysacademic.repository.DisciplinaRepository;
import br.com.jsfsysacademic.repository.ProfDiscRepository;

@ManagedBean
public class ProfdiscBean {
	
	private ProfDisc profDiscBean;
	
	public ProfdiscBean() {
		profDiscBean = new ProfDisc();
	}


	

	public ProfDisc getProfDiscBean() {
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
	public String salvar(){
		System.out.println("entrou saporra");
		if(ProfDiscRepository.getById(profDiscBean.getId()) == null){
			ProfDiscRepository.save(profDiscBean);
			setProfDiscBean(new ProfDisc());
			return "/prof-disc.jsf";
		}
	
		ProfDiscRepository.update(profDiscBean);
		setProfDiscBean(new ProfDisc());
		return "/prof-disc.jsf";
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
