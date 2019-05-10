package sistemas;

import java.util.ArrayList;

import funcionarios.Gerente;

public class DB {
	
	ArrayList<funcionarios.Gerente> Gerentes = new ArrayList<funcionarios.Gerente>();
	ArrayList<funcionarios.Supervisor> Supervisores = new ArrayList<funcionarios.Supervisor>();
	ArrayList<funcionarios.DevPleno> DevPlenos = new ArrayList<funcionarios.DevPleno>();
	ArrayList<funcionarios.DevJr> DevJrs = new ArrayList<funcionarios.DevJr>();
	
    Gerente gerente = new Gerente("a", "v", 1);
    Gerentes.add(gerente);
	
}
