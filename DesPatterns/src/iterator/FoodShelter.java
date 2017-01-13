package iterator;

public class FoodShelter {

	private Item[] foodList;
	private Iterator it;


	public FoodShelter() {

		foodList = new Food[4];

		foodList[0] = new Food("Meat");
		foodList[1] = new Food("Water Melon");
		foodList[2] = new Food("Carrots");
		foodList[3] = new Food("Chocolate");

	}

	public Iterator getIterator(){
		if(it==null){

			 it = new FoodIterator();

		}
		return it;
	}

	private class FoodIterator implements Iterator{

		private int index;

		public FoodIterator() {

			this.index = 0;

		}

		@Override
		public void next() {
			if(index<foodList.length-1){
				index++;
			}
			else{
				System.out.println("List ended");
			}

		}

		@Override
		public Item getCurrent() {
			return foodList[index];
		}

	}

}
