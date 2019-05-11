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
	private static String senhadegestao = "secret";
	protected List<String> dependentes;
	protected boolean ocupado;
	private String orientando;
	private String atarefando;

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
	public static String getSenhadegestao() {
		return senhadegestao;
	}
	public double getSalario() {
		return this.salario;
	}
	public String getOrientando() {
		return this.orientando;
	}
	public String getAtarefando() {
		return this.atarefando;
	}
	public boolean isOcupado() {
		return ocupado;
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
	public void setOrientando(String orientando) {
		this.orientando = orientando;
	}
	public void setAtarefando(String atarefando) {
		this.atarefando = atarefando;
	}
	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}
	public void setDependentes(List<String> gerentedpendentesList) {
		this.dependentes = gerentedpendentesList;
	}
}
