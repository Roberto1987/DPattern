package proxy;

public class ProxyAtm implements ATM {

	private ATM atm;


	@Override
	public void preleva(double prelievo) {
		if(atm==null){
			atm = new ConcreteAtm(1000);
		}
		atm.preleva(prelievo);
	}

	@Override
	public double estrattoConto() {
		if(atm==null){
			atm = new ConcreteAtm(1000);
		}
		return atm.estrattoConto();
	}

}
