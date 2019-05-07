package funcionarios;

import java.util.List;

public abstract class Dev extends Funcionario {
	protected String setor;
	protected String equipe;
	protected List<String> linguagens;
	
	public	String	getSetor() {
		return this.setor;
	}
	public String getEquipe()  {
		return this.equipe;
	}
}
