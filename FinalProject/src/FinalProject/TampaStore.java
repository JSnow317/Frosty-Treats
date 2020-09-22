package FinalProject;



public class TampaStore extends FrostyTreatsStore{

	@Override
	public FrostyTreats createIceCream(String type) {
		if(type.equals("vanilla")) {
			return new TampaVanilla();
		}
		else if(type.contentEquals("strawberry")) {
			return new TampaStrawBerry();
		}
		else if(type.contentEquals("chocolate")) {
			return new TampaChocolate();
		}
		else if(type.contentEquals("tropical tangerine")) {
			return new TampaTropical();
		}
		return null;
	}
	

}