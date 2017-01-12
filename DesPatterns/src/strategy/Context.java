package strategy;

public class Context {

	private Choice choice;

    public void setChoice(Choice choice){
    	this.choice = choice;
    }

	public void showChoice(String s1, String s2){
		this.choice.execute(s1, s2);
	}

}
