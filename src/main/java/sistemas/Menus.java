package sistemas;

import sistemas.DB;
import java.util.Scanner;
import funcionarios.DevJr;
import funcionarios.DevPleno;
import funcionarios.Gerente;
import funcionarios.Supervisor;

public class Menus {

 public Scanner scan = new Scanner(System.in);

 public void menuinicial() {

  System.out.println("\nEsse é o painel do administrador\nSelecione a opção desejada");
  System.out.println("-------------------------------------");
  System.out.println("1 - Criar Funcionário");
  System.out.println("2 - Excluir Funcionário");
  System.out.println("3 - Editar Funcionário");
  System.out.println("4 - Listar Funcionários");
  System.out.println("5 - Menu inicial");
  System.out.println("9 - Sair");

  String menuinicial = scan.nextLine();
  do {
   switch (menuinicial) {
    case "1":
     this.painelcriar();
     this.menucriar();
     this.menuinicial();
     break;
    case "2":
     this.paineldeletar();
     this.menudeletar();
     this.menuinicial();
     break;
    case "3":
     this.paineleditar();
     this.menueditar();
     this.menuinicial();
     break;
    case "4":
     this.painellistar();
     this.menulistar();
     break;
    case "5":
     this.menuinicial();
     break;
   }
  }
  while (menuinicial != "9");
  System.out.println("Obrigado por usar o nosso sistema!...\n\n Saindo...");
  scan.close();
 }


 public void painelcriar() {

  System.out.println("Qual o cargo do Funcionário?");
  System.out.println("1 - Criar Gerente");
  System.out.println("2 - Criar Supervisor");
  System.out.println("3 - Criar Dev Pleno");
  System.out.println("4 - Criar Dev Júnior");
  System.out.println("9 - Voltar");
 }
 public void menucriar() {
  String menucriar = scan.nextLine();
  
   switch (menucriar) {
    case "1":

     System.out.println("Nome do Gerente: ");
     String gerentenome = scan.nextLine();

     System.out.println("Sobrenome do Gerente: ");
     String gerentesobrenome = scan.nextLine();

     System.out.println("Salário do Gerente: ");
     double gerentesalario = scan.nextDouble();
     scan.nextLine();
     
     Gerente gerente = new Gerente(gerentenome, gerentesobrenome, gerentesalario);
     gerentes.add(gerente);
     
     break;

    case "2":
     System.out.println("Nome do Supervisor: ");
     String supervisornome = scan.nextLine();

     System.out.println("Sobrenome do Supervisor: ");
     String supervisorsobrenome = scan.nextLine();

     System.out.println("Salário do Supervisor: ");
     double supervisorsalario = scan.nextDouble();
     scan.nextLine();
     Supervisor supervisor = new Supervisor(supervisornome, supervisorsobrenome, supervisorsalario);

     System.out.println("Nome: " + supervisor.getNome());
     System.out.println("Sobrenome: " + supervisor.getSobreNome());
     System.out.println("Salário: " + supervisor.getSalario());

     break;
    case "3":
     System.out.println("Nome do Dev Pleno: ");
     String devplenonome = scan.nextLine();

     System.out.println("Sobrenome do Dev Pleno: ");
     String devplenosobrenome = scan.nextLine();

     System.out.println("Salário do Dev Pleno: ");
     double devplenosalario = scan.nextDouble();
     scan.nextLine();
     DevPleno devpleno = new DevPleno(devplenonome, devplenosobrenome, devplenosalario);

     System.out.println("Nome: " + devpleno.getNome());
     System.out.println("Sobrenome: " + devpleno.getSobreNome());
     System.out.println("Salário: " + devpleno.getSalario());
     break;

    case "4":
     System.out.println("Nome do Dev Pleno: ");
     String devjrnome = scan.nextLine();

     System.out.println("Sobrenome do Supervisor: ");
     String devjrsobrenome = scan.nextLine();

     System.out.println("Salário do Supervisor: ");
     double devjrsalario = scan.nextDouble();
     scan.nextLine();
     DevJr devjr = new DevJr(devjrnome, devjrsobrenome, devjrsalario);

     System.out.println("Nome: " + devjr.getNome());
     System.out.println("Sobrenome: " + devjr.getSobreNome());
     System.out.println("Salário: " + devjr.getSalario());
     break;
   }
 }

 public void paineldeletar() {
  System.out.println("Qual o cargo do Funcionário?");
  System.out.println("1 - Deletar Gerente");
  System.out.println("2 - Deletar Supervisor");
  System.out.println("3 - Deletar Dev Pleno");
  System.out.println("4 - Deletar Dev Júnior");
  System.out.println("9 - Voltar");
 }
 public void menudeletar() {

 }

 public void paineleditar() {
  System.out.println("Qual o cargo do Funcionário?");
  System.out.println("1 - Editar Gerente");
  System.out.println("2 - Editar Supervisor");
  System.out.println("3 - Editar Dev Pleno");
  System.out.println("4 - Editar Dev Júnior");
  System.out.println("9 - Voltar");
 }
 public void menueditar() {}


 public void painellistar() {
  System.out.println("Qual o cargo do Funcionário?");
  System.out.println("1 - Listar Gerentes");
  System.out.println("2 - Listar Supervisores");
  System.out.println("3 - Listar Dev Pleno");
  System.out.println("4 - Listar Dev Júnior");
  System.out.println("9 - Voltar");
 }

 public void menulistar() {}
}