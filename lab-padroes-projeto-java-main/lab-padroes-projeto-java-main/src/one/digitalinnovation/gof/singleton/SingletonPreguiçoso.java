package one.digitalinnovation.gof.singleton;

/*
Objetivo: garantir que uma classe tenha apenas uma instância e fornecer um ponto global de acesso a ela.
 */

public class SingletonPreguiçoso {

	private static SingletonPreguiçoso instancia;
	
	private SingletonPreguiçoso() {
		super();
	}
	
	public static SingletonPreguiçoso getInstancia() {
		if (instancia == null) {
			instancia = new SingletonPreguiçoso();
		}
		return instancia;
	}
}
