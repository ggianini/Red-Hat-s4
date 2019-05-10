package funcionarios;

import java.util.List;

public abstract class Dev extends Funcionario {

	private String setor;
	private String equipe;
	private List<String> linguagens;
	public String getSetor() {
		return setor;
	}
	public String getEquipe() {
		return equipe;
	}
	public List<String> getLinguagens() {
		return linguagens;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	public void setEquipe(String equipe) {
		this.equipe = equipe;
	}
	public void setLinguagens(List<String> linguagens) {
		this.linguagens = linguagens;
	}
}

