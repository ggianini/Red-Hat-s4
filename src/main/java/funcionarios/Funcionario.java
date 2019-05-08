package funcionarios;

import java.util.List;

public abstract class Funcionario {
	//atributos
	protected String nome;
	protected String sobreNome;
	protected String endereço;
	protected String tel;
	protected String cel;
	protected double salario;
	protected List<String> dependentes;
	protected boolean ocupado;
	protected String orientando;
	//metodos
	void aumentaSalario(double quantidade) {
		this.salario += quantidade;
	}
	//gets
	public String getNome() {
		return this.nome;
	}
	public String getSobrenome() {
		return this.sobreNome;
	}
	public String getEndereço() {
		return this.endereço;
	}
	public String getTel() {
		return this.tel;
	}
	public String getCel() {
		return this.cel;
	}
	public double getSalario() {
		return this.salario;
	}
	public List<String> getDependentes() {
		return this.dependentes;
	}
	//sets
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}
	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public void setCel(String cel) {
		this.cel = cel;
	}

}
