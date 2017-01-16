package factoryMethods;

public class FactoryMethodPatternTest {

	public static void main(String[] args) throws Exception{
		CarFactory factory = new RealCarFactory();
		Car megane = factory.GetCar("Renault");
		Car punto = factory.GetCar("Fiat");

		megane.getType();
		punto.getType();
		System.out.println();

		Car s900 = factory.GetCar("Mercedes");
	}


}
