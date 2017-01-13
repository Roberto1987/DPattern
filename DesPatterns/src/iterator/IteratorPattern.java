package iterator;

public class IteratorPattern {

	public static void main(String[] args) {

		FoodShelter fs = new FoodShelter();
		Iterator it = fs.getIterator();

		for(int i = 0; i<6; i++){
			System.out.println(it.getCurrent().getName());

			it.next();
			System.out.println();
		}


	}

}
