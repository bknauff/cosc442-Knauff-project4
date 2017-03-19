package edu.towson.cis.cosc442.project4.coffeemaker;

import junit.framework.TestCase;

/**
 *
 */
public class CoffeeMakerTest extends TestCase {
	private CoffeeMaker cm;
	private Inventory i;
	private Recipe r1;

	public void setUp() {
		cm = new CoffeeMaker();
		i = cm.checkInventory();

		r1 = new Recipe();
		r1.setName("Coffee");
		r1.setPrice(50);
		r1.setAmtCoffee(6);
		r1.setAmtMilk(1);
		r1.setAmtSugar(1);
		r1.setAmtChocolate(1);
	}
	
	public void testAddRecipe1() {
		assertTrue(cm.addRecipe(r1));
		assertFalse(cm.addRecipe(r1));
	}
	
	public void testDeleteRecipe1() {
		cm.addRecipe(r1);
		assertTrue(cm.deleteRecipe(r1));
	}
	
	public void testEditRecipe1() {
		cm.addRecipe(r1);
		Recipe newRecipe = new Recipe();
		newRecipe = r1;
		newRecipe.setAmtSugar(2);
		assertTrue(cm.editRecipe(r1, newRecipe));
	}
	
	public void testAddInventory1(){
		boolean addInv = cm.addInventory(1, 1, 1, 1);
		assertTrue(addInv);
		assertEquals(16,i.getCoffee());
		assertEquals(16,i.getChocolate());
		assertEquals(16,i.getSugar());
		assertEquals(16,i.getMilk());
		
		boolean addInv2 = cm.addInventory(0, 0, 0, 0);
		assertTrue(addInv2);
		
	}
	
	public void testcheckInventory(){
		assertNotNull(cm.checkInventory());
	}
	
	public void testPurchaseBeverage1(){
		cm.addRecipe(r1);
		assertEquals(50,cm.makeCoffee(r1, 100));
		assertEquals(9,i.getCoffee());
		assertEquals(14,i.getMilk());
		assertEquals(14,i.getSugar());
		assertEquals(14,i.getChocolate());
		
		assertEquals(45,cm.makeCoffee(r1, 45));
	}
	
	
	public void testGetRecipeForName() {
		cm.addRecipe(r1);
		assertEquals("Coffee", cm.getRecipeForName("Coffee").getName());
	}
}