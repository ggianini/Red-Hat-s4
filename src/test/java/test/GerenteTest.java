/**
 * 
 */
package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import funcionarios.DevJr;
import funcionarios.Gerente;


/**
 * @author ggianini
 *
 */
class GerenteTest {
	
	DevJr devjrtest = new DevJr("devjrtestnome", "devjrtestsobrenome", 666);
	ArrayList<Gerente> gerenteList = new ArrayList<Gerente>();

	@Test
	void testGerente() {
		Gerente gertest = new Gerente("gertestnome", "gertestsobrenome", 777);
		gerenteList.add(gertest);
		assertEquals(1, gerenteList.size());
	}

	/**
	 * Test method for {@link funcionarios.Gerente#autentica(java.lang.String)}.
	 */
	@Test
	void testAutentica() {
		Gerente gertest = new Gerente("gertestnome", "gertestsobrenome", 777);
		gertest.setSenha("secret");
		assertEquals(true, gertest.autentica("secret"));
	}

}
