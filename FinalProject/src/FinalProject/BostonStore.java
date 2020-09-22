package FinalProject;


public class BostonStore extends FrostyTreatsStore{

	@Override
	public FrostyTreats createIceCream(String type) {
		if(type.equals("vanilla")) {
			return new BostonVanilla();
		}
		else if(type.contentEquals("strawberry")) {
			return new BostonStrawBerry();
		}
		else if(type.contentEquals("chocolate")) {
			return new BostonChocolate();
		}
		else if(type.contentEquals("patriot pistachio")) {
			return new BostonPistachio();
		}
		return null;
	}
	

}
