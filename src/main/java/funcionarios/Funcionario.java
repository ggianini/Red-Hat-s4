package funcionarios;

import java.util.List;

public abstract class Funcionario {
	
	private String nome;
	private String sobreNome;
	private double salario;
	private String endereço;
	private boolean auth;
	private String tel;
	private String cel;
	private String senha;
	protected List<String> dependentes;

	public String getNome() {
		return this.nome;
	}
	public String getSobreNome() {
		return sobreNome;
	}
	public String getEndereço() {
		return this.endereço;
	}
	public boolean isAuth() {
		return auth;
	}
	public String getTel() {
		return this.tel;
	}
	public String getCel() {
		return this.cel;
	}
	public String getSenha() {
		return this.senha;
	}
	public double getSalario() {
		return this.salario;
	}
	public List<String> getDependentes() {
		return dependentes;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}
	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
	public void setAuth(boolean auth) {
		this.auth = auth;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public void setCel(String cel) {
		this.cel = cel;
	}
	public void setSenha(String senha) {
		this.senha = senha;
		System.out.println("email: 'Obrigado por confirmar seus dados, sua senha foi alterada para: "+this.senha+ "'");	
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public void setDependentes(List<String> gerentedpendentesList) {
		this.dependentes = gerentedpendentesList;
	}
}
