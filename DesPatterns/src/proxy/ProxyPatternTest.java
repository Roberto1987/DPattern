package proxy;

public class ProxyPatternTest {

	public static void main(String[] args) {
		ATM proxyAtm = new ProxyAtm();

		proxyAtm.preleva(250);
		proxyAtm.estrattoConto();

	}

}
