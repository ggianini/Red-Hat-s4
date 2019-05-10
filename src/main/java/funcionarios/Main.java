package funcionarios;

import sistemas.Menus;

import java.lang.reflect.Field;

import sistemas.DB;

public class Main {

	public static void main(String[] args) {
		
		//Menus menu = new Menus();
		//menu.menuinicial();
		
		Gerente gerente = new Gerente("a","b",3);
		Field [] attributes = gerente.getClass().getDeclaredFields();
		for (Field field : attributes) {
			System.out.println("ATTRIBUTE NAME: " + field.getName());
		}
		
        }
	}

