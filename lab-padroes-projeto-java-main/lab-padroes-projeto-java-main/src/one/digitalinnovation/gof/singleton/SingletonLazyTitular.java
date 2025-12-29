package one.digitalinnovation.gof.singleton;

/**
 * Singleton "Lazy Holder".
 * 
 * @see <a href="https://stackoverflow.com/a/24018148">Referencia</a>
 * 
 * @author falvojr
 */
public class SingletonLazyTitular {

	private static class InstanceHolder {
		public static SingletonLazyTitular instancia = new SingletonLazyTitular();
	}
	
	private SingletonLazyTitular() {
		super();
	}
	
	public static SingletonLazyTitular getInstancia() {
		return InstanceHolder.instancia;
	}
}
