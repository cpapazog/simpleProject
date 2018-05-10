package com.papazog.simpleproject.verysimple;

import static org.junit.Assert.assertEquals;

public class VerySimpleTest {


	@org.junit.Test
	public void helloWorldTest(){
		String world = com.papazog.simpleproject.verysimple.VerySimpleClass.helloWorld();

		System.out.println(world);

		assertEquals(world,"Hello World");

	}

}