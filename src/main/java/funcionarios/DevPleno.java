package funcionarios;

import java.util.List;

import sistemas.Orientacao;

public class DevPleno extends Dev implements Orientacao {
	
	protected List<String> linguagens;

	 public DevPleno(String nome, String sobreNome, double salario) {
		  System.out.println("-------------------------------------");
		  System.out.println("Dev Pleno Criado!\n");
		  this.setNome(nome);
		  this.setSobreNome(sobreNome);
		  this.setSalario(salario);
		  System.out.println("Nome: " + this.getNome()+"\n");
		  System.out.println("Sobrenome: " + this.getSobreNome()+"\n");
		  System.out.println("Salário: " + this.getSalario());
		  System.out.println("-------------------------------------");
		 }


 public void orientarJr(DevJr devjr) {

   System.out.println(this.getNome() + " " +this.getSobreNome()+ " está orientando: " + devjr.getNome() + " " +devjr.getSobreNome());

}
}