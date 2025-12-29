package one.digitalinnovation.gof.singleton;

/*
//Objetivo: garantir que uma classe tenha apenas uma instância e fornecer um ponto global de acesso a ela.
 */
public class Singleton_Apressado {

	private static Singleton_Apressado instancia = new Singleton_Apressado();
	
	private Singleton_Apressado() {
		super();
	}
	
	public static Singleton_Apressado getInstancia() {
		return instancia;
	}
}
