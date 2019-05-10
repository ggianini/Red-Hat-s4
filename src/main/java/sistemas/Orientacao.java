package sistemas;

import funcionarios.DevJr;

public interface Orientacao {
	public void orientarJr(DevJr devjr);
	public void passarTarefa(DevJr devjr);
	public void aprovarTarefa(DevJr devjr);
}
