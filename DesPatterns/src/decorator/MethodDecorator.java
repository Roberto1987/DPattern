package decorator;

public class MethodDecorator extends AbstractDecorator {

	public void doJob(){
		super.doJob();
		System.out.println("Metodo arricchito tramite decorator");
	}

}
