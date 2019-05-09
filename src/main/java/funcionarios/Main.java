package funcionarios;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		

	    Scanner scan = new Scanner(System.in);
	    
	    System.out.println("\nEsse é o painel do administrador\nSelecione a opção desejada");
        System.out.println("-------------------------------------");
        System.out.println("1 - Criar Funcionário");
        System.out.println("2 - Excluir Funcionário");
        System.out.println("3 - Editar Funcionário");
        System.out.println("4 - Listar Funcionários");
        System.out.println("5 - Menu");
        System.out.println("9 - Sair");
	
	    int choice = scan.nextInt();
	    
	    do {
	    switch (choice) {
	        case 1: 
	            System.out.println("Qual o cargo do Funcionário?");
	            System.out.println("1 - Criar Gerente");
	            System.out.println("2 - Criar Supervisor");
	            System.out.println("3 - Criar Dev Pleno");
	            System.out.println("4 - Criar Dev Júnior");
	            System.out.println("9 - Voltar");
	            do {
	            	switch (choice) {
	            	case 1:
	                    System.out.println("Qual nome do funcionário?: ");
	                    String word1 = scan.nextLine();
	            	break;
	            	case 2:
	            	break;
	            	case 3:
	            	break;
	            	case 4:
	            	break;
	            }
	            }
	            while(choice != 9);
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

	    while(choice != 9);
	    scan.close();
}
}

