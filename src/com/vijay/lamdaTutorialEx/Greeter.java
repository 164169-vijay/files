package com.vijay.lamdaTutorialEx;

public class Greeter {

	
	public void greet(Greeting greeting) {
		greeting.perform();
		
		//System.out.println("Hello world");

	}
	public static void main(String[] args) {
		
		Greeter greeter = new Greeter();
		//an instance of greeting interface
		Greeting helloWorldGreeting=new HelloWorldGreeting();
            
		
		Greeting LamdaGreeting=() -> System.out.println("Hello world");
	
		helloWorldGreeting.perform();
		LamdaGreeting.perform();
		
		
		
	//	greeter.greet(helloWorldGreeting);
		
		
		
		
	}
	
}

