package observer;

public class ObserverPatternTest {

	public static void main(String[] args) throws InterruptedException {
		//CREAZIONE OGGETTI--------------------------------------------------
		Observer obs1 = new ConcreteObserver(Observer.class.getName()+"1");
		Observer obs2 = new ConcreteObserver(Observer.class.getName()+"2");
		Subject subj = new ConcreteSubject();
		//-------------------------------------------------------------------
		subj.registra(obs1);
		subj.notificaRegistrati();
		Thread.sleep(1000);
		subj.registra(obs2);
		subj.notificaRegistrati();
		Thread.sleep(1000);
		subj.elimina(obs2);
		subj.notificaRegistrati();
		Thread.sleep(1000);


	}

}
