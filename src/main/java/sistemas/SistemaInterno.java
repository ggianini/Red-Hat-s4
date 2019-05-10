package sistemas;

import funcionarios.Funcionario;

public class SistemaInterno {
		
		private boolean ok = false;
		
		public void login(Autenticavel aut) {
			String senha = null;
			boolean ok = aut.autentica(senha);
			if(ok == true){
				System.out.println("Login Successful - OK");
				ok = true;
			}
			else {
				System.out.println("Invalid Credentials");
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
		public void aumentaSalario(Funcionario Fun, double aumento) {
			if(ok == true) {
			double atual = Fun.getSalario();
			Fun.setSalario(atual += aumento);
			System.out.println("Salário alterado");
			}
			else {
				System.out.println("Você não fez login()");
			}
		}
}
