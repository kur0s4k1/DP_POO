package controle;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import banco.DAOGenerico;
import entidades.Alimento;

@ManagedBean
@ViewScoped
public class AlimentoMB implements Serializable{

	private Alimento alimento = new Alimento();
	private DAOGenerico<Alimento> dao = new DAOGenerico<>(Alimento.class);

	// metodo
	public void salvar() {
		if (alimento.getId() == null) {
			dao.salvar(alimento);
		} else {
		}
		alimento = new Alimento();
	}

	public Alimento getAlimento() {
		return alimento;
	}

	public void setAlimento(Alimento alimento) {
		this.alimento = alimento;
	}

}
