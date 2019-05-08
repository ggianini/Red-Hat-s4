package funcionarios;

public class DevJr extends Dev {

	//Construtor
   DevJr(String nome, String sobreNome, double salario){
	    this.nome = nome;
		this.sobreNome = sobreNome;
		this.salario = salario;
	}

	public void pedirAjuda(Funcionario fun) {
		if ((fun.ocupado == false) && (this.ocupado == false)){
			this.ocupado = true;
			fun.ocupado = true;
			fun.orientando = this.nome;
			System.out.println(this.nome+" está pedindo ajuda para: "+fun.nome+" que estava livre e passou a orientá-lo.");
		}
		else if ((fun.ocupado = false) && (this.ocupado = true)) {
			System.out.println(this.nome+", você já está ocupado, não pode pedir ajuda.");
		}
		else if ((fun.ocupado = true) && (this.ocupado = false)) {
			System.out.println(fun.nome+" não pode te ajudar, pois já está ocupado.");
		}
		else if ((fun.ocupado = true) && (this.ocupado = true)) {
			System.out.println(this.nome+", você já está ocupado, além disso "+ fun.nome+" não pode te ajudar pois já está ocupado.");
		}
		else {
			System.out.println("test error");
		}
	}
	
	public void pararAjuda(Funcionario Fun) {
		if ((Fun.ocupado == true) && (this.ocupado == true) && (this.orientando == Fun.nome)){
			System.out.println(this.nome+" não está mais orientando: "+Fun.nome);
			this.ocupado = false;
			Fun.ocupado = false;
			this.orientando = null;
		}
		else {
			System.out.println(this.nome+", você não está mais sendo ajudado por "+Fun.nome);
		}
	}
	
}
