package funcionarios;
import sistemas.Menus;
import sistemas.SistemaInterno;


public class Main {

	public static void main(String[] args) {
		//Menus menu = new Menus();
		//menu.menuinicial();
		
		SistemaInterno sys = new SistemaInterno();
		Gerente gerente1 = new Gerente("Neymar", "Jr", 12000);
		Supervisor sup1 = new Supervisor("Cristiano", "Ronaldo", 7000);
		DevPleno devpleno1 = new DevPleno("Luis", "Suárez", 5000);
		DevPleno devpleno2 = new DevPleno("Kevin-Prince", "Boateng", 4000);
		DevJr devjr1 = new DevJr("Lionel","Messi", 2000);
		DevJr devjr2 = new DevJr("Gareth","Bale", 3000);
		gerente1.setSenha("psg");

		
		sys.aumentaSalario(devjr1, 300);
		sys.login(gerente1);
		sys.aumentaSalario(devjr1, 300);
		System.out.println(devjr1.getSalario());
		devjr1.pedirAjuda(gerente1);
		sup1.supervisionar(devjr1);
		sup1.supervisionar(devpleno1);
		
	}
	}

