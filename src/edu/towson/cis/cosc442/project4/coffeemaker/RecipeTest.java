package edu.towson.cis.cosc442.project4.coffeemaker;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RecipeTest {
	Recipe r;

	@Before
	public void setUp() throws Exception {
		r = new Recipe();
	}

	@Test
	public void testSetAmtChocolate() {
		r.setAmtChocolate(5);
		assertEquals(5,r.getAmtChocolate());
	}
	
	@Test
	public void testSetNegativeChocolate(){
		r.setAmtChocolate(-5);
		assertEquals(0,r.getAmtChocolate());
	}

	@Test
	public void testSetAmtCoffee() {
		r.setAmtCoffee(5);
		assertEquals(5,r.getAmtCoffee());
	}
	
	@Test
	public void testSetNegativeCoffee(){
		r.setAmtCoffee(-5);
		assertEquals(0,r.getAmtCoffee());
	}

	@Test
	public void testSetAmtMilk() {
		r.setAmtMilk(5);
		assertEquals(5,r.getAmtMilk());
	}
	
	@Test
	public void testSetNegativeMilk(){
		r.setAmtMilk(-5);
		assertEquals(0,r.getAmtMilk());
	}

	@Test
	public void testSetAmtSugar() {
		r.setAmtSugar(5);
		assertEquals(5,r.getAmtSugar());
	}
	
	@Test
	public void testSetNegative(){
		r.setAmtSugar(-5);
		assertEquals(0,r.getAmtSugar());
	}
	
	@Test
	public void testSetPrice(){
		r.setPrice(50);
		assertEquals(50,r.getPrice());
	}

	@Test
	public void testSetNegativePrice() {
		r.setPrice(-10);
		assertEquals(0,r.getPrice());
	}

	@Test
	public void testEqualsRecipe() {
		r.setName("Coffee");
		final Recipe r1 = new Recipe();
		r1.setName("Coffee");
		assertTrue(r.equals(r1));
	}
	
	@Test
	public void testEqualsWithOtherNull() {
		r.setName("Coffee");
		final Recipe r2 = new Recipe();
		assertFalse(r.equals(r2));
	}
	
	@Test
	public void testEqualsWithThisNull() {
		final Recipe r2 = new Recipe();
		r2.setName("Latte");
		assertFalse(r.equals(r2));
	}
	
	@Test
	public void testEqualsWithDiffName() {
		final Recipe r2 = new Recipe();
		r.setName("Coffee");
		r2.setName("Latte");
		assertFalse(r.equals(r2));
	}

	@Test
	public void testToString() {
		r.setName("Coffee");
		assertEquals("Coffee", r.toString());
	}

	@After
	public void tearDown() throws Exception {
		r = null;
	}
}
