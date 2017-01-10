package observer;

import java.util.ArrayList;

public class ConcreteSubject implements Subject {

	private ArrayList<Observer> registrati;

	@Override
	public void registra(Observer o) {
		if(registrati==null){
			registrati = new ArrayList<Observer>();
		}
		registrati.add(o);
	}

	@Override
	public void elimina(Observer o) throws NullPointerException {
		registrati.remove(o);
	}

	@Override
	public void notificaRegistrati() {

		String notifica = this.getClass().getName();

		for(Observer o : registrati){
			o.ricezioneNotifica(notifica);
		}

	}



}
