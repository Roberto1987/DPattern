package observer;

public interface Subject {

	public void registra(Observer o);

	public void elimina(Observer o);

	public void notificaRegistrati();

}
