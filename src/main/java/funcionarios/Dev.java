package funcionarios;

import java.util.List;

public abstract class Dev extends Funcionario {
	//atributos
	protected String setor;
	protected String equipe;
	protected List<String> linguagens;
	//gets
	public	String	getSetor() {
		return this.setor;
	}
	public String getEquipe()  {
		return this.equipe;
	}
	//sets
	public	void	getSetor(String setor) {
		this.setor = setor;
	}
	public void getEquipe(String equipe)  {
		this.equipe = equipe;
	}
}
