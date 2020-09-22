package FinalProject;



public class PhillyStore extends FrostyTreatsStore{
	@Override
		public FrostyTreats createIceCream(String type) {
			if(type.contentEquals("vanilla")) {
				return new PhillyVanilla();
			}
			else if(type.contentEquals("strawberry")) {
				return new PhillyStrawBerry();
			}
			else if(type.contentEquals("chocolate")) {
				return new PhillyChocolate();
			}
			else if(type.contentEquals("liberty lime")) {
				return new PhillyLL();
			}
			return null;
		}
		

	}

