package funcionarios;

import Sistemas.Autenticavel;

public class Gerente extends Funcionario implements Autenticavel{
	
	public	boolean	autentica(String senha) {
		if((getSenhadegestao() != senha) || (this.getSenha() != senha)){
			System.out.println("Credenciais inválidas ou insuficientes");
			return false;
		}
		this.setAuth(true);
		System.out.println("OK");
		return true;
	}
}
