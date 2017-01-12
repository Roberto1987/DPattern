package strategy;

public class SumChoice implements Choice {

	@Override
	public void execute(String s1, String s2) {
		System.out.println( Integer.parseInt(s1)+Integer.parseInt(s2));

	}

}
