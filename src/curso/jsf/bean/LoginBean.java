package curso.jsf.bean;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;



@ManagedBean(name = "loginBean")
@RequestScoped
public class LoginBean implements Serializable {

	private String name; 
	private String password;	
	
	public String doLogin() {
		if("abc".equals(name)&& "123".equals(password)) {
			return "sucess";			
		}
		FacesContext.getCurrentInstance().addMessage("form:button", new FacesMessage("Login inválido!"));
		return null;		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Bean Criado");	
	
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Bean Destruído");
	}
	
}
