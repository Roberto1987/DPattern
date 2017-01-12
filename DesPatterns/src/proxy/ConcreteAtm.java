package proxy;

public class ConcreteAtm implements ATM {

	private double money;

	public ConcreteAtm(double money) {
		this.money = money;
		System.out.println("Conto base aperto");
	}


	@Override
	public double estrattoConto() {
		System.out.println("Saldo disponibile: "+money);
		return money;
	}


	@Override
	public void preleva(double prelievo) {
		if(money<prelievo){
			System.out.println("Saldo insufficiente");
		}
		this.money = this.money - prelievo;
		System.out.println("Prelievo di "+ prelievo +" effettuato");

	}

}
