package funcionarios;

public class Supervisor extends Funcionario {

	private String setor;
	private String equipe;

	public String getSetor() {
		return setor;
	}
	public String getEquipe() {
		return equipe;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	public void setEquipe(String equipe) {
		this.equipe = equipe;
	}
	
	 public Supervisor(String nome, String sobreNome, double salario) {
		  System.out.println("-------------------------------------");
		  System.out.println("Supervisor Criado!\n");
		  this.setNome(nome);
		  this.setSobreNome(sobreNome);
		  this.setSalario(salario);
		  System.out.println("Nome: " + this.getNome()+"\n");
		  System.out.println("Sobrenome: " + this.getSobreNome()+"\n");
		  System.out.println("Salário: " + this.getSalario());
		  System.out.println("-------------------------------------");
		 }
 public void supervisionar(Dev dev) {
  System.out.println(this.getNome() + " " +this.getSobreNome()+" está supervisionando: " + dev.getNome() + " " +dev.getSobreNome());
 }

}