package decorator;

public abstract class AbstractDecorator {

	Component com;

	public void setComponent(Component com){
		this.com = com;
	}

	public void doJob(){
		com.doJob();
	}

}
