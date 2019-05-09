package funcionarios;

public class Supervisor extends Funcionario {
	
	public void supervisionar(Dev dev) {
		System.out.println(this.getNome()+" está supervisionando: "+dev.getNome());
	}

}
