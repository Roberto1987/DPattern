package iterator;

public class Food implements Item {

	private String name;

	public Food(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

}
