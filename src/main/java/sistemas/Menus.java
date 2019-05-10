package sistemas;

import java.util.Iterator;
import java.util.Scanner;
import sistemas.DB;
import funcionarios.DevJr;
import funcionarios.DevPleno;
import funcionarios.Gerente;
import funcionarios.Supervisor;

public class Menus {
 DB db = new DB();


 Scanner scan = new Scanner(System.in);

 public void menuinicial() {
  this.painelinicial();
  String menuinicial = scan.nextLine();

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
    this.menuinicial();
    break;
   case "9":
    System.out.println("Obrigado por usar o nosso sistema!...\n\n Saindo...");
    System.exit(0);
   default:
    System.out.println("\nVALOR DIGITADO É INVÁLIDO!!\nTENTE NOVAMENTE\n");
    this.menuinicial();
  }
 }

 public void painelinicial() {

  System.out.println("\nEsse é o painel do administrador\nSelecione a opção desejada");
  System.out.println("-------------------------------------");
  System.out.println("1 - Criar Funcionário");
  System.out.println("2 - Deletar Funcionário");
  System.out.println("3 - Editar Funcionário");
  System.out.println("4 - Listar Funcionários");
  System.out.println("9 - Sair");
 }

 public void painelcriar() {
  System.out.println("Qual o cargo do Funcionário?");
  System.out.println("1 - Criar Gerente");
  System.out.println("2 - Criar Supervisor");
  System.out.println("3 - Criar Dev Pleno");
  System.out.println("4 - Criar Dev Júnior");
  System.out.println("9 - Voltar");
 }

 public void paineldeletar() {
  System.out.println("Qual o cargo do Funcionário?");
  System.out.println("1 - Deletar Gerente");
  System.out.println("2 - Deletar Supervisor");
  System.out.println("3 - Deletar Dev Pleno");
  System.out.println("4 - Deletar Dev Júnior");
  System.out.println("9 - Voltar");
 }

 public void paineleditar() {
  System.out.println("Qual o cargo do Funcionário?");
  System.out.println("1 - Editar Gerente");
  System.out.println("2 - Editar Supervisor");
  System.out.println("3 - Editar Dev Pleno");
  System.out.println("4 - Editar Dev Júnior");
  System.out.println("9 - Voltar");
 }

 public void painellistar() {
  System.out.println("Qual o cargo do Funcionário?");
  System.out.println("1 - Listar Gerentes");
  System.out.println("2 - Listar Supervisores");
  System.out.println("3 - Listar Dev Pleno");
  System.out.println("4 - Listar Dev Júnior");
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
    db.gerenteList.add(gerente);

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
    db.supervisorList.add(supervisor);

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
    db.devplenoList.add(devpleno);

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
    db.devjrList.add(devjr);
    break;
   case "9":
    this.menuinicial();
   default:
    System.out.println("\nVALOR DIGITADO É INVÁLIDO!!\nTENTE NOVAMENTE\n");
    this.painelcriar();
    this.menucriar();
  }
 }

 public void menudeletar() {
  String menudeletar = scan.nextLine();
  switch (menudeletar) {
   case "1":
    System.out.println("Nome do Gerente a ser deletado: ");
    String gerentenome = scan.nextLine();

    for (int i = 0; i < db.gerenteList.size(); i++) {
     if (db.gerenteList.get(i).getNome().equals(gerentenome)) {
      db.gerenteList.remove(i);
      break;
     }
    }

    break;

   case "2":
    System.out.println("Nome do Supervisor a ser deletado: ");
    String supervisornome = scan.nextLine();

    for (int i = 0; i < db.supervisorList.size(); i++) {
     if (db.supervisorList.get(i).getNome().equals(supervisornome)) {
      db.supervisorList.remove(i);
      break;
     }
    }

    break;

   case "3":
    System.out.println("Nome do Dev Pleno a ser deletado: ");
    String devplenonome = scan.nextLine();

    for (int i = 0; i < db.devplenoList.size(); i++) {
     if (db.devplenoList.get(i).getNome().equals(devplenonome)) {
      db.devplenoList.remove(i);
      break;
     }
    }

    break;

   case "4":
    System.out.println("Nome do Dev Júnior a ser deletado: ");
    String devjrnome = scan.nextLine();

    for (int i = 0; i < db.devjrList.size(); i++) {
     if (db.devjrList.get(i).getNome().equals(devjrnome)) {
      db.devjrList.remove(i);
      break;

     }
    }
    break;
   case "9":
    this.menuinicial();
   default:
    System.out.println("\nVALOR DIGITADO É INVÁLIDO!!\nTENTE NOVAMENTE\n");
    this.paineldeletar();
    this.menudeletar();
  }
 }

 public void menueditar() {
  String menueditar = scan.nextLine();
  switch (menueditar) {
   case "1":
    System.out.println("Nome do Gerente a ser editado: ");
    String gerentenome = scan.nextLine();
    System.out.println("Atributo do Gerente a ser editado: ");
    String gerenteatributo = scan.nextLine();
    System.out.println("Novo valor para "+gerenteatributo+": ");
    String gerentevaloratributo = scan.nextLine();

    for (int i = 0; i < db.gerenteList.size(); i++) {
     if (db.gerenteList.get(i).getNome().equals(gerentenome)) {
      db.gerenteList.remove(i);
      break;
     }
    }

    break;

   case "2":
    System.out.println("Nome do Supervisor a ser deletado: ");
    String supervisornome = scan.nextLine();

    for (int i = 0; i < db.supervisorList.size(); i++) {
     if (db.supervisorList.get(i).getNome().equals(supervisornome)) {
      db.supervisorList.remove(i);
      break;
     }
    }

    break;

   case "3":
    System.out.println("Nome do Dev Pleno a ser deletado: ");
    String devplenonome = scan.nextLine();

    for (int i = 0; i < db.devplenoList.size(); i++) {
     if (db.devplenoList.get(i).getNome().equals(devplenonome)) {
      db.devplenoList.remove(i);
      break;
     }
    }

    break;

   case "4":
    System.out.println("Nome do Dev Júnior a ser deletado: ");
    String devjrnome = scan.nextLine();

    for (int i = 0; i < db.devjrList.size(); i++) {
     if (db.devjrList.get(i).getNome().equals(devjrnome)) {
      db.devjrList.remove(i);
      break;

     }
    }
    break;
   case "9":
    this.menuinicial();
   default:
    System.out.println("\nVALOR DIGITADO É INVÁLIDO!!\nTENTE NOVAMENTE\n");
    this.paineleditar();
    this.menueditar();
  }
 }

 public void menulistar() {
  Iterator gerenteitr = db.gerenteList.iterator();
  Iterator supervisoritr = db.supervisorList.iterator();
  Iterator devplenoitr = db.devplenoList.iterator();
  Iterator devjritr = db.devjrList.iterator();
  String menulistar = scan.nextLine();
  switch (menulistar) {

   case "1":
    while (gerenteitr.hasNext()) {
     Gerente gerente = (Gerente) gerenteitr.next();
     System.out.println("-------------------------------------\nNome: " + gerente.getNome() + " " + gerente.getSobreNome() + "\nSalário: " + gerente.getSalario() + "\n-------------------------------------");
    }
   break;
   case "2":
    while (supervisoritr.hasNext()) {
     Supervisor supervisor = (Supervisor) supervisoritr.next();
     System.out.println("-------------------------------------\nNome: " + supervisor.getNome() + " " + supervisor.getSobreNome() + "\nSalário: " + supervisor.getSalario() + "\n-------------------------------------");
    }
   break;
   case "3":
    while (devplenoitr.hasNext()) {
     DevPleno devpleno = (DevPleno) devplenoitr.next();
     System.out.println("-------------------------------------\nNome: " + devpleno.getNome() + " " + devpleno.getSobreNome() + "\nSalário: " + devpleno.getSalario() + "\n-------------------------------------");
    }
    break;
   case "4":
    while (devjritr.hasNext()) {
     DevJr devjr = (DevJr) devjritr.next();
     System.out.println("-------------------------------------\nNome: " + devjr.getNome() + " " + devjr.getSobreNome() + "\nSalário: " + devjr.getSalario() + "\n-------------------------------------");  
    }
  break;
  }
 }
}