package decorator;

public class ClassDecorator extends AbstractDecorator {

	String name;

	public ClassDecorator(String name){
		super();
		this.name = name;
		System.out.println("Classe arricchita dell'attributo \"name\" tramite classDecorator");
		System.out.println("Name assegnato: "+name);
	}



}
