package sistemas;

public interface Autenticavel {
	final String SENHAGERENCIA = "secret";
	boolean	autentica(String senha);
}
