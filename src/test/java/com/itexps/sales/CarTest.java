package com.itexps.sales;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CarTest {
	
	Car car;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		
		car = new Car();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testVin() {
		car.setVin(123);
		
		assertEquals(123,  car.getVin());
	}
	
	@Test
	public void testColor() {
		car.setColor("Black");
		
		assertEquals("Black",  car.getColor());
	}
	
	@Test
	public void testMake() {
		car.setMake("Honda");
		
		assertEquals("Honda",  car.getMake());
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testPrice() {
		car.setPrice(10500);
		
		
	}

}
