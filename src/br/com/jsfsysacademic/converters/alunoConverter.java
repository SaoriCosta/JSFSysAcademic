package br.com.jsfsysacademic.converters;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import br.com.jsfsysacademic.entidades.Aluno;
import br.com.jsfsysacademic.repository.AlunoRepository;



@FacesConverter("alunoConverter")
public class alunoConverter implements Converter{

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2) {
		
		System.out.println(AlunoRepository.getById(Integer.parseInt(arg2)));
		return AlunoRepository.getById(Integer.parseInt(arg2));
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
		Aluno aluno = (Aluno) arg2;
		return String.valueOf(aluno.getId());
	}

}
