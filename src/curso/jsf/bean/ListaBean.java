package curso.jsf.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name= "listaBean")
@SessionScoped
public class ListaBean implements Serializable{

	private String item;
	
	private List<String> itens = new ArrayList<String>();
	
	public String adicionar() {
		itens.add(item);
		item = null;
		return null;
		
	}
	
	public String removerTudo() {
		itens.clear();
		
		return null;
		
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public List<String> getItens() {
		return itens;
	}

	public void setItens(List<String> itens) {
		this.itens = itens;
	}
		
	
}
