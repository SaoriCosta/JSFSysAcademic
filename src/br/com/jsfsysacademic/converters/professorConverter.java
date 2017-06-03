package br.com.jsfsysacademic.converters;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import br.com.jsfsysacademic.entidades.Professor;
import br.com.jsfsysacademic.repository.ProfessorRepository;
@FacesConverter("professorConverter")
public class professorConverter implements Converter{

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2) {
		// TODO Auto-generated method stub
		return ProfessorRepository.getById(Integer.parseInt(arg2));
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
		Professor professor = (Professor) arg2;
		return String.valueOf(professor.getId());
	}


}
