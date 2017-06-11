package br.com.jsfsysacademic.converters;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import br.com.jsfsysacademic.entidades.Disciplina;

import br.com.jsfsysacademic.repository.DisciplinaRepository;


@FacesConverter("disciplinaConverter")
public class disciplinaConverter implements Converter{

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2) {
		System.out.println(arg2);
		return DisciplinaRepository.getById(Integer.parseInt(arg2));
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
		Disciplina disciplina = (Disciplina) arg2;
		System.out.println(disciplina.getDisciplina());
		return String.valueOf(disciplina.getId());
	}

}
