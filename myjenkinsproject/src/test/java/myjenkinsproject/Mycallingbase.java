package myjenkinsproject;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import myjenkinsproject.MyBase;

public class Mycallingbase {
	
	private MyBase mb;
	
		@BeforeTest
		public void setup() {
			
			System.out.println("inside setUp firing-1");
			mb = new MyBase();
			System.out.println("inside setUp firing-2");
		}
		
		@Test
		public void greetershouldincludetheonebeinggreeted() {
			String someone = "World";
			
			System.out.println("someone" + someone);
			if (mb == null)
				
			{System.out.println("greeter is null"); }
			else
			{String s = mb.greet(someone);
			assertEquals(s, someone); }
			
		}
		
		
	


}
