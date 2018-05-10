package com.papazog.simpleproject.verysimple;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class VerySimpleTest {


	@Test
	public void helloWorldTest(){
		String world = VerySimpleClass.helloWorld();
		System.out.println(world);
		assertEquals(world,"Hello World");
	}

	@Test
	public void helloWorldTest2() {
		String world = VerySimpleClass.helloWorld();
		System.out.println(world);
		assertNotEquals(world, "Hell World");
	}

}