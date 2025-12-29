package one.digitalinnovation.gof;

import one.digitalinnovation.gof.facade.Facade;
import one.digitalinnovation.gof.singleton.Singleton_Apressado;
import one.digitalinnovation.gof.singleton.SingletonPreguiçoso;
import one.digitalinnovation.gof.singleton.SingletonLazyTitular;
import one.digitalinnovation.gof.strategy.Comportamento;
import one.digitalinnovation.gof.strategy.ComportamentoAgressivo;
import one.digitalinnovation.gof.strategy.ComportamentoDefensivo;
import one.digitalinnovation.gof.strategy.ComportamentoNormal;
import one.digitalinnovation.gof.strategy.Robo;

public class Test {

	public static void main(String[] args) {
		
		// Singleton
		
		SingletonPreguiçoso lazy = SingletonPreguiçoso.getInstancia();
		System.out.println(lazy);
		lazy = SingletonPreguiçoso.getInstancia();
		System.out.println(lazy);
		
		Singleton_Apressado eager = Singleton_Apressado.getInstancia();
		System.out.println(eager);
		eager = Singleton_Apressado.getInstancia();
		System.out.println(eager);
		
		SingletonLazyTitular lazyHolder = SingletonLazyTitular.getInstancia();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyTitular.getInstancia();
		System.out.println(lazyHolder);
		
		// Strategy
		
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
		robo.setComportamento(defensivo);
		robo.mover();
		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();
		robo.mover();
		
		// Facade
		
		Facade facade = new Facade();
		facade.migrarCliente("Venilton", "14801788");
	}

}
