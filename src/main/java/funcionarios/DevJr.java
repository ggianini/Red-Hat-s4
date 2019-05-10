package funcionarios;

public class DevJr extends Dev {

 public DevJr(String nome, String sobreNome, double salario) {
  System.out.println("-------------------------------------\nDev Júnior Criado!\n");
  this.setNome(nome);
  this.setSobreNome(sobreNome);
  this.setSalario(salario);
  System.out.println("Nome: " + this.getNome()+"\n");
  System.out.println("Sobrenome: " + this.getSobreNome()+"\n");
  System.out.println("Salário: " + this.getSalario()+"\n-------------------------------------\n");
 }

 public void pedirAjuda(Funcionario fun) {
  if ((fun.ocupado == false) && (this.ocupado == false)) {
   this.ocupado = true;
   fun.ocupado = true;
   fun.setOrientando(this.getNome());
   System.out.println(this.getNome() + " está pedindo ajuda para: " + fun.getNome() + " que estava livre e passou a orientá-lo.");
  } else if ((fun.ocupado = false) && (this.ocupado = true)) {
   System.out.println(this.getNome() + ", você já está ocupado, não pode pedir ajuda.");
  } else if ((fun.ocupado = true) && (this.ocupado = false)) {
   System.out.println(fun.getNome() + " não pode te ajudar, pois já está ocupado.");
  } else if ((fun.ocupado = true) && (this.ocupado = true)) {
   System.out.println(this.getNome() + ", você já está ocupado, além disso " + fun.getNome() + " não pode te ajudar pois já está ocupado.");
  } else {
   System.out.println("test error");
  }
 }

 public void pararAjuda(Funcionario Fun) {
  if ((Fun.ocupado == true) && (this.ocupado == true) && (this.getOrientando() == Fun.getNome())) {
   System.out.println(this.getNome() + " não está mais orientando: " + Fun.getNome());
   this.ocupado = false;
   Fun.ocupado = false;
   this.setOrientando(null);
  } else {
   System.out.println(this.getNome() + ", você não está mais sendo ajudado por " + Fun.getNome());
  }
 }

}