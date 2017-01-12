package decorator;

public class DecoratorPatternTest {

	public static void main(String[] args) {
		AbstractDecorator meth,obj;
		Component com1 = new ConcreteComponent();
		com1.doJob();

		System.out.println();

		meth = new MethodDecorator();
		meth.setComponent(com1);
		meth.doJob();

		System.out.println();

		obj = new ClassDecorator("decoratore oggetti");
		obj.setComponent(com1);
		obj.doJob();

	}

}
