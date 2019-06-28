package controle;

import banco.DAOGenerico;
import entidades.Alimento;

public class AlimentoMB {

	private Alimento alimento = new Alimento();
	private DAOGenerico<Alimento> dao = new DAOGenerico<>(Alimento.class);

	public void salvar() {
		if (alimento.getId() == null) {
			dao.salvar(alimento);
		} else {

		}
		alimento = new Alimento();
	}

}