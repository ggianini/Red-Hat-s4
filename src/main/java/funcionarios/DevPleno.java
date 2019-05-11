package funcionarios;

import java.util.List;

import sistemas.Orientacao;

public class DevPleno extends Dev implements Orientacao {
	
	protected List<String> linguagens;

	 public DevPleno(String nome, String sobreNome, double salario) {
		  System.out.println("-------------------------------------\nDev Pleno Criado!\n");
		  this.setNome(nome);
		  this.setSobreNome(sobreNome);
		  this.setSalario(salario);
		  System.out.println("Nome: " + this.getNome()+"\n");
		  System.out.println("Sobrenome: " + this.getSobreNome()+"\n");
		  System.out.println("Salário: " + this.getSalario()+"\n-------------------------------------\n");
		 }

 public void passarTarefa(DevJr devjr) {
  if ((devjr.ocupado == false) && (this.ocupado == false)) {
   this.ocupado = true;
   devjr.ocupado = true;
   this.setAtarefando(devjr.getNome());
   System.out.println(devjr.getNome() + " Agora está ocupado realizando tarefa passada por" + this.getNome());
  } else if ((devjr.ocupado = false) && (this.ocupado = true)) {
   System.out.println(this.getNome() + ", você não pode passar uma terafa pois está ocupado");
  } else if ((devjr.ocupado = true) && (this.ocupado = false)) {
   System.out.println(devjr.getNome() + " não pode receber tarefa pois já está ocupado");
  } else if ((devjr.ocupado = true) && (this.ocupado = true)) {
   System.out.println(this.getNome() + ", você já está ocupado, além disso " + devjr.getNome() + " não pode receber tarefa pois já está ocupado");
  }
 }
 public void aprovarTarefa(DevJr devjr) {
  if (this.getAtarefando() == devjr.getNome()) {
   System.out.println(this.getNome() + " Aprovou a tarefa executada por " + devjr.getNome());
  }
  this.ocupado = false;
  devjr.ocupado = false;
  this.setAtarefando(null);
 }

 public void orientarJr(DevJr devjr) {
  if ((devjr.ocupado == false) && (this.ocupado == false)) {
   this.ocupado = true;
   devjr.ocupado = true;
   this.setOrientando(devjr.getNome());
   System.out.println(this.getNome() + " está orientando: " + devjr.getNome());
  } else if ((devjr.ocupado = false) && (this.ocupado = true)) {
   System.out.println(this.getNome() + ", você já está ocupado");
  } else if ((devjr.ocupado = true) && (this.ocupado = false)) {
   System.out.println(devjr.getNome() + " não pode ser orientado pois já está ocupado");
  } else if ((devjr.ocupado = true) && (this.ocupado = true)) {
   System.out.println(this.getNome() + ", você já está ocupado, além disso " + devjr.getNome() + " não pode ser orientado pois já está ocupado");
  }
 }

 public void pararorientarJr(DevJr devjr) {
  if ((devjr.ocupado == true) && (this.ocupado == true) && (this.getOrientando() == devjr.getNome())) {
   System.out.println(this.getNome() + " não está mais orientando: " + devjr.getNome());
   this.ocupado = false;
   devjr.ocupado = false;
   this.setOrientando(null);
  } else {
   System.out.println(this.getNome() + ", você não está orientando " + devjr.getNome());
  }
 }
}