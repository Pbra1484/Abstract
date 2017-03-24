package abs.controller;

import abs.model.SubThing;



public class Controller 
{
	
	SubThing thing;
	
	public Controller()
	{
		thing = new SubThing();
		
	}
	
	
	
	public void start() 
	{
		System.out.println("currently thing's info is " + thing.getInfo());
		thing.setInfo("Stuff");
		System.out.println("now it is " + thing.getInfo());
		
	}

}
