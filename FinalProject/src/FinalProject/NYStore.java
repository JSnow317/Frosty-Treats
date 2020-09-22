package FinalProject;


public class NYStore extends FrostyTreatsStore{

	@Override
	public FrostyTreats createIceCream(String type) {
		if(type.contentEquals("vanilla")) {
			return new NYVanilla();
		}
		else if(type.contentEquals("strawberry")) {
			return new NYStrawBerry();
		}
		else if(type.contentEquals("chocolate")) {
			return new NYChocolate();
		}
		else if(type.contentEquals("broadway blueberry")) {
			return new NYBB();
		}
		return null;
	}
	

}