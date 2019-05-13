package sistemas;

import java.util.Scanner;

import funcionarios.Funcionario;

public class SistemaInterno {

	private boolean ok = false;

	public void login(Autenticavel aut) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Insira sua senha; ");

		String senha = scan.nextLine();
		boolean ok = aut.autentica(senha);
		if(ok == true){
			System.out.println("Você está logado");
			scan.close();
			this.ok = true;
		}
		else {
			System.out.println("Não foi possível realizar login");
		}
	}
	public void setSalario(Funcionario Fun, double salario) {
		if(ok == true) {
			System.out.println("Salário alterado");
			Fun.setSalario(salario);
		}
		else {
			System.out.println("Você não fez login()");
		}
	}
	public void aumentaSalario(Funcionario fun, double aumento) {
		if(ok == true) {
			double atual = fun.getSalario();
			double novo = (atual += aumento);
			System.out.println("Aumento de: "+aumento+" concedido! Salário de "+fun.getNome()+" "+fun.getSobreNome()+" alterado de: "+fun.getSalario()+" para: "+novo);
			fun.setSalario(novo);
		}
		else {
			System.out.println("Não é possivel aumentar o salário de: "+fun.getNome()+" "+fun.getSobreNome()+" pois você não fez login()");
		}
	}

	public void concedeBonus(Funcionario fun, double bonus) {
		if(ok == true) {
			double atual = fun.getSalario();
			double novo = (atual +(atual * 0.01 * bonus));
			System.out.println("Bônus de: "+bonus+"% concedido! Salário de "+fun.getNome()+" "+fun.getSobreNome()+" alterado de: "+fun.getSalario()+" para: "+novo);
			fun.setSalario(novo);
		}
		else {
			System.out.println("Não é possivel gerar bônus para: "+fun.getNome()+" "+fun.getSobreNome()+" pois você não fez login()");
		}

	}
}