package FinalProject;

public abstract class FrostyTreatsStore {
	
	abstract FrostyTreats createIceCream(String item);
	
	public FrostyTreats orderIceCream(String type) {
		
		FrostyTreats treat = createIceCream(type);
		System.out.println("Can we get a " + treat.getName() + "!");
		treat.buildIceCream();
		return treat;
	}

}
