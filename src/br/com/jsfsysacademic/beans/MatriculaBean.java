package br.com.jsfsysacademic.beans;

import java.util.List;

import javax.faces.bean.ManagedBean;


import br.com.jsfsysacademic.entidades.Matricula;
import br.com.jsfsysacademic.repository.MatriculaRepository;

@ManagedBean
public class MatriculaBean {

	
	private Matricula matricula;

	public MatriculaBean() {
		this.matricula = new Matricula();
	}
	
	
	public Matricula getMatricula() {
		return matricula;
	}

	public void setMatricula(Matricula matricula) {
		this.matricula = matricula;
	}
	
	

	public List<Matricula> getMatriculas(){
		return MatriculaRepository.getMatriculas();
	}
	
	public String remover(Matricula matricula){
		MatriculaRepository.delete(matricula);
		setMatricula(new Matricula());
		return "/matricula";
	}
	
	public String salvar(){
		
		if(MatriculaRepository.getById(matricula.getId())==null){
			System.out.println("Entrou sapoooooorrraaaaaaaaaaaaaaaaaaaaa");
			MatriculaRepository.save(matricula);
			System.out.println(matricula.getId());
			setMatricula(new Matricula());
			return "/matricula";
		}
		
		MatriculaRepository.update(getMatricula());
		setMatricula(new Matricula());
		return "/matricula";
	
	}
	

	public String carregar(Matricula matricula){
		System.out.println("Carregar - " + matricula);
		setMatricula(matricula);
		return "/matricula";
}
	
	

}
