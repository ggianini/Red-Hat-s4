package funcionarios;

import java.util.List;

public abstract class Funcionario {
	//atributos
	protected String nome;
	protected String sobrenome;
	protected String tel;
	protected String cel;
	protected double salario;
	protected List<String> dependentes;
	//metodos
	void aumentaSalario(double quantidade) {
		this.salario	+=	quantidade;
	}
	//gets
	public	String	getnome() {
		return this.nome;
	}
	public	String	getsobrenome() {
		return this.sobrenome;
	}
	public	String	gettel() {
		return this.tel;
	}
	public	String	getcel() {
		return this.cel;
	}
	public	double	getsalario() {
		return this.salario;
	}
	//sets
}
