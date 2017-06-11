package br.com.jsfsysacademic.validadores;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

import br.com.jsfsysacademic.beans.DisciplinaBean;
import br.com.jsfsysacademic.entidades.Disciplina;

@FacesValidator("disciplinaValidator")
public class DisciplinaValidator implements Validator {

	@Override
	public void validate(FacesContext arg0, UIComponent arg1, Object arg2) throws ValidatorException {
		
		String disciplina = (String)arg2;
	
		DisciplinaBean db = new DisciplinaBean();
		
		for (Disciplina i : db.getDisciplinas()) {
			
			if(disciplina.equals(i.getDisciplina())){
				
				FacesMessage msg = new FacesMessage("Disciplina ja existe.",
						"Disciplina ja existe.");
			msg.setSeverity(FacesMessage.SEVERITY_ERROR);
			throw new ValidatorException(msg);
				
			}
		}
		
		
		
	}

}
