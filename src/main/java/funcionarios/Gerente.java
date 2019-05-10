package funcionarios;

import sistemas.Autenticavel;

public class Gerente extends Funcionario implements Autenticavel {

 public Gerente(String nome, String sobreNome, double salario) {
  System.out.println("-------------------------------------\nGerente Criado!\n");
  this.setNome(nome);
  this.setSobreNome(sobreNome);
  this.setSalario(salario);
  System.out.println("Nome: " + this.getNome()+"\n");
  System.out.println("Sobrenome: " + this.getSobreNome()+"\n");
  System.out.println("Salário: " + this.getSalario()+"\n-------------------------------------\n");
 }

 public boolean autentica(String senha) {
  if ((getSenhadegestao() != senha) || (this.getSenha() != senha)) {
   System.out.println("Credenciais inválidas ou insuficientes");
   return false;
  }
  this.setAuth(true);
  System.out.println("OK");
  return true;
 }
}