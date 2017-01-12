package strategy;

public class ConcatChoice implements Choice{

	@Override
	public void execute(String s1, String s2) {
		System.out.println(s1+s2);
	}

}
