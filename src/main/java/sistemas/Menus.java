package sistemas;

import java.util.Iterator;
import java.util.Scanner;
import sistemas.DB;
import funcionarios.DevJr;
import funcionarios.DevPleno;
import funcionarios.Gerente;
import funcionarios.Supervisor;

public class Menus {
 public DB db = new DB();


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
    double gerentesalario = Double.parseDouble(scan.nextLine());

    Gerente gerente = new Gerente(gerentenome, gerentesobrenome, gerentesalario);
    db.gerenteList.add(gerente);

    break;

   case "2":

    System.out.println("Nome do Supervisor: ");
    String supervisornome = scan.nextLine();

    System.out.println("Sobrenome do Supervisor: ");
    String supervisorsobrenome = scan.nextLine();

    System.out.println("Salário do Supervisor: ");
    double supervisorsalario = Double.parseDouble(scan.nextLine());

    Supervisor supervisor = new Supervisor(supervisornome, supervisorsobrenome, supervisorsalario);
    db.supervisorList.add(supervisor);

    break;

   case "3":

    System.out.println("Nome do Dev Pleno: ");
    String devplenonome = scan.nextLine();

    System.out.println("Sobrenome do Dev Pleno: ");
    String devplenosobrenome = scan.nextLine();

    System.out.println("Salário do Dev Pleno: ");
    double devplenosalario = Double.parseDouble(scan.nextLine());

    DevPleno devpleno = new DevPleno(devplenonome, devplenosobrenome, devplenosalario);
    db.devplenoList.add(devpleno);

    break;

   case "4":

    System.out.println("Nome do Dev Pleno: ");
    String devjrnome = scan.nextLine();

    System.out.println("Sobrenome do Supervisor: ");
    String devjrsobrenome = scan.nextLine();

    System.out.println("Salário do Supervisor: ");
    double devjrsalario = Double.parseDouble(scan.nextLine());

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
    System.out.println("Novo valor para " + gerenteatributo + ": ");
    String gerentevaloratributo = scan.nextLine();


    for (int i = 0; i < db.gerenteList.size(); i++) {
     if (db.gerenteList.get(i).getNome().equals(gerentenome)) {
      if (gerenteatributo.equals("nome")) {
       db.gerenteList.get(i).setNome(gerentevaloratributo);
      } else if (gerenteatributo.equals("sobrenome")) {
       db.gerenteList.get(i).setSobreNome(gerentevaloratributo);
      } else if (gerenteatributo.equals("salario")) {
       db.gerenteList.get(i).setSalario(Double.parseDouble(gerentevaloratributo));
      } else if (gerenteatributo.equals("endereço")) {
       db.gerenteList.get(i).setEndereço(gerentevaloratributo);
      } else if (gerenteatributo.equals("tel")) {
       db.gerenteList.get(i).setTel(gerentevaloratributo);
      } else if (gerenteatributo.equals("cel")) {
       db.gerenteList.get(i).setCel(gerentevaloratributo);
      } else if (gerenteatributo.equals("senha")) {
       db.gerenteList.get(i).setSenha(gerentevaloratributo);
      } else if (gerenteatributo.equals("cel")) {
       db.gerenteList.get(i).setCel(gerentevaloratributo);
      } else if (gerenteatributo.equals("dependentes")) {
       //db.gerenteList.get(i).setDependentes(gerentevaloratributo);
      }
     }
    }
    break;

   case "2":
    System.out.println("Nome do Supervisor a ser editado: ");
    String supervisornome = scan.nextLine();
    System.out.println("Atributo do Supervisor a ser editado: ");
    String supervisoratributo = scan.nextLine();
    System.out.println("Novo valor para " + supervisoratributo + ": ");
    String supervisorvaloratributo = scan.nextLine();


    for (int i = 0; i < db.supervisorList.size(); i++) {
     if (db.supervisorList.get(i).getNome().equals(supervisornome)) {
      if (supervisoratributo.equals("nome")) {
       db.supervisorList.get(i).setNome(supervisorvaloratributo);
      } else if (supervisoratributo.equals("sobrenome")) {
       db.supervisorList.get(i).setSobreNome(supervisorvaloratributo);
      } else if (supervisoratributo.equals("salario")) {
       db.supervisorList.get(i).setSalario(Double.parseDouble(supervisorvaloratributo));
      } else if (supervisoratributo.equals("endereço")) {
       db.supervisorList.get(i).setEndereço(supervisorvaloratributo);
      } else if (supervisoratributo.equals("tel")) {
       db.supervisorList.get(i).setTel(supervisorvaloratributo);
      } else if (supervisoratributo.equals("cel")) {
       db.supervisorList.get(i).setCel(supervisorvaloratributo);
      } else if (supervisoratributo.equals("senha")) {
       db.supervisorList.get(i).setSenha(supervisorvaloratributo);
      } else if (supervisoratributo.equals("cel")) {
       db.supervisorList.get(i).setCel(supervisorvaloratributo);
      }
     }
    }
    break;
   case "3":
    System.out.println("Nome do Dev Pleno a ser editado: ");
    String devplenonome = scan.nextLine();
    System.out.println("Atributo do Dev Pleno a ser editado: ");
    String devplenoatributo = scan.nextLine();
    System.out.println("Novo valor para " + devplenoatributo + ": ");
    String devplenovaloratributo = scan.nextLine();


    for (int i = 0; i < db.devplenoList.size(); i++) {
     if (db.devplenoList.get(i).getNome().equals(devplenonome)) {
      if (devplenoatributo.equals("nome")) {
       db.devplenoList.get(i).setNome(devplenovaloratributo);
      } else if (devplenoatributo.equals("sobrenome")) {
       db.devplenoList.get(i).setSobreNome(devplenovaloratributo);
      } else if (devplenoatributo.equals("salario")) {
       db.devplenoList.get(i).setSalario(Double.parseDouble(devplenovaloratributo));
      } else if (devplenoatributo.equals("endereço")) {
       db.devplenoList.get(i).setEndereço(devplenovaloratributo);
      } else if (devplenoatributo.equals("tel")) {
       db.devplenoList.get(i).setTel(devplenovaloratributo);
      } else if (devplenoatributo.equals("cel")) {
       db.devplenoList.get(i).setCel(devplenovaloratributo);
      } else if (devplenoatributo.equals("senha")) {
       db.devplenoList.get(i).setSenha(devplenovaloratributo);
      } else if (devplenoatributo.equals("cel")) {
       db.devplenoList.get(i).setCel(devplenovaloratributo);
      }
     }
    }
    break;

   case "4":
    System.out.println("Nome do Dev Júnior a ser editado: ");
    String devjrnome = scan.nextLine();
    System.out.println("Atributo do Dev Júnior a ser editado: ");
    String devjratributo = scan.nextLine();
    System.out.println("Novo valor para " + devjratributo + ": ");
    String devjrvaloratributo = scan.nextLine();


    for (int i = 0; i < db.devjrList.size(); i++) {
     if (db.devjrList.get(i).getNome().equals(devjrnome)) {
      if (devjratributo.equals("nome")) {
       db.devjrList.get(i).setNome(devjrvaloratributo);
      } else if (devjratributo.equals("sobrenome")) {
       db.devjrList.get(i).setSobreNome(devjrvaloratributo);
      } else if (devjratributo.equals("salario")) {
       db.devjrList.get(i).setSalario(Double.parseDouble(devjrvaloratributo));
      } else if (devjratributo.equals("endereço")) {
       db.devjrList.get(i).setEndereço(devjrvaloratributo);
      } else if (devjratributo.equals("tel")) {
       db.devjrList.get(i).setTel(devjrvaloratributo);
      } else if (devjratributo.equals("cel")) {
       db.devjrList.get(i).setCel(devjrvaloratributo);
      } else if (devjratributo.equals("senha")) {
       db.devjrList.get(i).setSenha(devjrvaloratributo);
      } else if (devjratributo.equals("cel")) {
       db.devjrList.get(i).setCel(devjrvaloratributo);
      }
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
     Gerente showgerente = (Gerente) gerenteitr.next();
     System.out.println("-------------------------------------\nNome: " + showgerente.getNome() + " " + showgerente.getSobreNome() + "\nSalário: " + showgerente.getSalario() + "\n-------------------------------------");
    }
    break;
   case "2":
    while (supervisoritr.hasNext()) {
     Supervisor showsupervisor = (Supervisor) supervisoritr.next();
     System.out.println("-------------------------------------\nNome: " + showsupervisor.getNome() + " " + showsupervisor.getSobreNome() + "\nSalário: " + showsupervisor.getSalario() + "\n-------------------------------------");
    }
    break;
   case "3":
    while (devplenoitr.hasNext()) {
     DevPleno showdevpleno = (DevPleno) devplenoitr.next();
     System.out.println("-------------------------------------\nNome: " + showdevpleno.getNome() + " " + showdevpleno.getSobreNome() + "\nSalário: " + showdevpleno.getSalario() + "\n-------------------------------------");
    }
    break;
   case "4":
    while (devjritr.hasNext()) {
     DevJr showdevjr = (DevJr) devjritr.next();
     System.out.println("-------------------------------------\nNome: " + showdevjr.getNome() + " " + showdevjr.getSobreNome() + "\nSalário: " + showdevjr.getSalario() + "\n-------------------------------------");
    }
    break;
  }
 }
}