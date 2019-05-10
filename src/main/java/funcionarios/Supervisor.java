package funcionarios;

public class Supervisor extends Funcionario {

	 public Supervisor(String nome, String sobreNome, double salario) {
		  System.out.println("-------------------------------------\nSupervisor Criado!\n");
		  this.setNome(nome);
		  this.setSobreNome(sobreNome);
		  this.setSalario(salario);
		  System.out.println("Nome: " + this.getNome()+"\n");
		  System.out.println("Sobrenome: " + this.getSobreNome()+"\n");
		  System.out.println("Salário: " + this.getSalario()+"\n-------------------------------------\n");
		 }
 public void supervisionar(Dev dev) {
  System.out.println(this.getNome() + " está supervisionando: " + dev.getNome());
 }

}