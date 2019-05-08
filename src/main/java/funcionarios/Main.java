package funcionarios;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		

	    Scanner input = new Scanner(System.in);
	    
	    System.out.println("\nEsse é o painel do administrador\nSelecione a opção desejada");
        System.out.println("-------------------------------------");
        System.out.println("1 - Criar Funcionário");
        System.out.println("2 - Excluir Funcionário");
        System.out.println("3 - Editar Funcionário");
        System.out.println("4 - Listar Funcionários");
        System.out.println("5 - Sair");
	    
	    int choice = input.nextInt();

	    switch (choice) {
	        case 1:
	            // Perform "original number" case.
	            break;
	        case 2:
	            // Perform "encrypt number" case.
	            break;
	        case 3:
	            // Perform "decrypt number" case.
	            break;
	        case 4:
	            // Perform "quit" case.
	            break;
	        default:
	            // The user input an unexpected choice.
	    }
	}		
}

