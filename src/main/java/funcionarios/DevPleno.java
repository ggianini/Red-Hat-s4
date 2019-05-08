package funcionarios;

public class DevPleno extends Dev {
	//Construtor

	DevPleno(String nome, String sobreNome, double salario){
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.salario = salario;	
	}
	
	public void orientarJr(DevJr devjr) {
		if ((devjr.ocupado == false) && (this.ocupado == false)){
			this.ocupado = true;
			devjr.ocupado = true;
			this.orientando = devjr.nome;
			System.out.println(this.nome+" está orientando: "+devjr.nome);
		}
		else if ((devjr.ocupado = false) && (this.ocupado = true)) {
			System.out.println(this.nome+", você já está ocupado");
		}
		else if ((devjr.ocupado = true) && (this.ocupado = false)) {
			System.out.println(devjr.nome+" não pode ser orientado pois já está ocupado");
		}
		else if ((devjr.ocupado = true) && (this.ocupado = true)) {
			System.out.println(this.nome+", você já está ocupado, além disso "+ devjr.nome+" não pode ser orientado pois já está ocupado");
		}
		else {
			System.out.println("test error");
		}
	}
	
	public void pararorientarJr(DevJr devjr) {
		if ((devjr.ocupado == true) && (this.ocupado == true) && (this.orientando == devjr.nome)){
			System.out.println(this.nome+" não está mais orientando: "+devjr.nome);
			this.ocupado = false;
			devjr.ocupado = false;
			this.orientando = null;
		}
		else {
			System.out.println(this.nome+", você não está orientando "+devjr.nome);
		}
	}
}
