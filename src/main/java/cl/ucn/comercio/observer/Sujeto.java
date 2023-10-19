package cl.ucn.comercio.observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Sujeto {

	private List<Observador> observadores = new ArrayList<Observador>();
	
	public void subscribe(Observador observador) {
		observadores.add(observador);
	  }
	  
	  public void remueve(Observador observador) {
		  observadores.remove(observador);
	  }
	  
	  public void notificarObservadores() {
	    Iterator<Observador> it = observadores.iterator();
	    while (it.hasNext()) {
	    	Observador obs= (Observador) it.next();
	      obs.update(this); 
	    }
	  }
	
}
