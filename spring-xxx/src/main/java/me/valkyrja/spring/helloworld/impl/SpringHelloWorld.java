package me.valkyrja.spring.helloworld.impl;

import me.valkyrja.spring.helloworld.HelloWorld;

public class SpringHelloWorld implements HelloWorld {

	@Override
	public void sayHello() {
		System.out.println("Spring Say Hello!");
	}

}
