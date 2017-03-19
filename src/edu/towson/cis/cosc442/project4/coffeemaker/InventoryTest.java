package edu.towson.cis.cosc442.project4.coffeemaker;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class InventoryTest {
	private Inventory i;

	@Before
	public void setUp() throws Exception {
		i = new Inventory();
	}	

	@Test
	public void testSetChocolate() {
		i.setChocolate(1);
		assertEquals(1, i.getChocolate());
	}
	
	@Test
	public void testSetChocolate2() {
		i.setChocolate(0);
		assertEquals(0, i.getChocolate());
	}
	
	@Test
	public void setNegativeChocolate(){
		i.setChocolate(-1);
		assertEquals(0,i.getChocolate());
	}

	@Test
	public void testSetCoffee() {
		i.setCoffee(1);
		assertEquals(1, i.getCoffee());
	}
	
	@Test
	public void testSetCoffee2() {
		i.setCoffee(0);
		assertEquals(0, i.getCoffee());
	}
	
	@Test
	public void setNegativeCoffee(){
		i.setCoffee(-1);
		assertEquals(0,i.getCoffee());
	}

	@Test
	public void testSetMilk() {
		i.setMilk(1);
		assertEquals(1, i.getMilk());
	}
	
	@Test
	public void testSetMilk2() {
		i.setMilk(0);
		assertEquals(0, i.getMilk());
	}
	
	@Test
	public void setNegativeMilk(){
		i.setMilk(-1);
		assertEquals(0,i.getMilk());
	}

	@Test
	public void testSetSugar() {
		i.setSugar(1);
		assertEquals(1, i.getSugar());
	}
	
	@Test
	public void testSetSugar2() {
		i.setSugar(0);
		assertEquals(0, i.getSugar());
	}
	
	@Test
	public void setNegativeSugar(){
		i.setSugar(-1);
		assertEquals(0,i.getSugar());
	}

	@Test
	public void testInsufficientCoffee() {
		final Recipe r1 = new Recipe();
		r1.setName("Coffee");
		r1.setPrice(50);
		r1.setAmtCoffee(16);
		r1.setAmtMilk(1);
		r1.setAmtSugar(1);
		r1.setAmtChocolate(0);
		assertFalse(i.enoughIngredients(r1));
	}
	
	@Test
	public void testInsufficientCoffee2() {
		final Recipe r1 = new Recipe();
		r1.setName("Coffee");
		r1.setPrice(50);
		r1.setAmtCoffee(15);
		r1.setAmtMilk(1);
		r1.setAmtSugar(1);
		r1.setAmtChocolate(0);
		i.enoughIngredients(r1);
		assertTrue(i.enoughIngredients(r1));
	}
	
	@Test
	public void testInsufficientMilk() {
		final Recipe r1 = new Recipe();
		r1.setName("Coffee");
		r1.setPrice(50);
		r1.setAmtCoffee(6);
		r1.setAmtMilk(16);
		r1.setAmtSugar(1);
		r1.setAmtChocolate(0);
		assertFalse(i.enoughIngredients(r1));
	}
	
	@Test
	public void testInsufficientMilk2() {
		final Recipe r1 = new Recipe();
		r1.setName("Coffee");
		r1.setPrice(50);
		r1.setAmtCoffee(6);
		r1.setAmtMilk(15);
		r1.setAmtSugar(1);
		r1.setAmtChocolate(0);
		assertTrue(i.enoughIngredients(r1));
	}
	
	@Test
	public void testInsufficientSugar() {
		final Recipe r1 = new Recipe();
		r1.setName("Coffee");
		r1.setPrice(50);
		r1.setAmtCoffee(6);
		r1.setAmtMilk(1);
		r1.setAmtSugar(16);
		r1.setAmtChocolate(0);
		assertFalse(i.enoughIngredients(r1));
	}
	
	@Test
	public void testInsufficientSugar2() {
		final Recipe r1 = new Recipe();
		r1.setName("Coffee");
		r1.setPrice(50);
		r1.setAmtCoffee(6);
		r1.setAmtMilk(1);
		r1.setAmtSugar(15);
		r1.setAmtChocolate(0);
		assertTrue(i.enoughIngredients(r1));
	}
	
	@Test
	public void testInsufficientChocolate() {
		final Recipe r1 = new Recipe();
		r1.setName("Coffee");
		r1.setPrice(50);
		r1.setAmtCoffee(6);
		r1.setAmtMilk(1);
		r1.setAmtSugar(1);
		r1.setAmtChocolate(16);
		assertFalse(i.enoughIngredients(r1));
	}
	
	@Test
	public void testInsufficientChocolate2() {
		final Recipe r1 = new Recipe();
		r1.setName("Coffee");
		r1.setPrice(50);
		r1.setAmtCoffee(6);
		r1.setAmtMilk(1);
		r1.setAmtSugar(1);
		r1.setAmtChocolate(15);
		assertTrue(i.enoughIngredients(r1));
	}
	
	@Test
	public void testToString() {
		final String expectedMessage = "Coffee: " + 15 + System.getProperty("line.separator") +
				"Milk: " + 15 + System.getProperty("line.separator") +
				"Sugar: " + 15 + System.getProperty("line.separator") +
				"Chocolate: " + 15 + System.getProperty("line.separator");
		assertEquals("toString messages not the same", expectedMessage, i.toString());
	}
	
	@After
	public void tearDown() throws Exception {
		i = null;
	}
}
