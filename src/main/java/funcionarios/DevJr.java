package funcionarios;

import java.util.List;

public class DevJr extends Dev {

	protected List<String> linguagens;
	
	public List<String> getLinguagens() {
		return linguagens;
	}

	public void setLinguagens(List<String> linguagens) {
		this.linguagens = linguagens;
	}
	
	
 public DevJr(String nome, String sobreNome, double salario) {
  System.out.println("-------------------------------------");
  System.out.println("Dev Júnior Criado!\n");
  this.setNome(nome);
  this.setSobreNome(sobreNome);
  this.setSalario(salario);
  System.out.println("Nome: " + this.getNome()+"\n");
  System.out.println("Sobrenome: " + this.getSobreNome()+"\n");
  System.out.println("Salário: " + this.getSalario());
  System.out.println("-------------------------------------");
 }

 public void pedirAjuda(Funcionario fun) {
   System.out.println(this.getNome() + " " +this.getSobreNome() + " está pedindo ajuda para: " + fun.getNome() + " " +fun.getSobreNome());
 }

}