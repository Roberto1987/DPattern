package factoryMethods;

public class RealCarFactory extends CarFactory {


	@Override
	public Car GetCar(String carModel) throws Exception {
		switch(carModel){

		case "Fiat": return new Fiat();

		case "Renault": return new Renault();

		default: throw new Exception("The model "+carModel+" it's not producted here");

		}

	}

}
