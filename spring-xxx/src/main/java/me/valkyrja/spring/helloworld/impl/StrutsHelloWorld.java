package me.valkyrja.spring.helloworld.impl;

import me.valkyrja.spring.helloworld.HelloWorld;

public class StrutsHelloWorld implements HelloWorld {

	@Override
	public void sayHello() {
		System.out.println("Struts Say Hello!");
	}

}
