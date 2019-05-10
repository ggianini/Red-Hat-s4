package funcionarios;

public class Supervisor extends Funcionario {

 public Supervisor(String nome, String sobreNome, double salario) {
  System.out.println("Supervisor Criado!");
  this.setNome(nome);
  this.setSobreNome(sobreNome);
  this.setSalario(salario);
 }
 public void supervisionar(Dev dev) {
  System.out.println(this.getNome() + " está supervisionando: " + dev.getNome());
 }

}