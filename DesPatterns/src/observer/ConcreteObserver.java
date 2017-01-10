package observer;

public class ConcreteObserver implements Observer {

	private String nome;

	public ConcreteObserver(String nome){
		this.nome = nome;
	}

	@Override
	public void ricezioneNotifica(String notifica) {

		System.out.println("Osservatore "+nome+": " +notifica);

	}

	public String getNome(){
		return this.nome;
	}

}
