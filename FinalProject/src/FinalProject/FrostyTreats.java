package FinalProject;

import java.util.ArrayList;

public abstract class FrostyTreats {
	
	protected String name;
	protected String cones;
	protected String texture;
	
	public void buildIceCream() {
		System.out.println("One " + getName() + " coming right up!");
		System.out.println("Getting cone. ");
		System.out.println("Adding scoops...");

	}
	
	public String getName() {
		return name;
	}
	
	

	public String toString() {
		String s = "";
		s = "A " + texture + " " + name + " in a " + cones + ".";
		
		return s;
	}

}
