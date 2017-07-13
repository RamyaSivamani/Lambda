package com.kgfsl.Lambda;
public class Greeter {
public void greet(Greeting greeting)
{
	greeting.say();
}

public static void main(String[] args)
 {
	Greeter greeter=new Greeter();
	HelloGreeting helloGreeting=new HelloGreeting();
	greeter.greet(helloGreeting);
}
}