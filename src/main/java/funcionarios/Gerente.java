package funcionarios;

import sistemas.Autenticavel;

public class Gerente extends Funcionario implements Autenticavel {

 public Gerente(String nome, String sobreNome, double salario) {
  System.out.println("-------------------------------------");
  System.out.println("Gerente Criado!\n");
  this.setNome(nome);
  this.setSobreNome(sobreNome);
  this.setSalario(salario);
  System.out.println("Nome: " + this.getNome()+"\n");
  System.out.println("Sobrenome: " + this.getSobreNome()+"\n");
  System.out.println("Salário: " + this.getSalario());
  System.out.println("-------------------------------------");
 }

 public boolean autentica(String senha) {
  if (!this.getSenha().equals(senha)) {
   System.out.println("Credenciais inválidas ou insuficientes");
  return false; 
  }
  System.out.println("Autenticado");
  return true;
 }
}