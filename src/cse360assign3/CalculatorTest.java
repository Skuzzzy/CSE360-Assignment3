package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testCalculator() {
        Calculator calc = new Calculator();
        assertNotNull(calc);
    }

    @Test
    public void testGetTotal() {
		Calculator calc = new Calculator();
		assertEquals(0, calc.getTotal());
    }

    @Test
    public void testAdd() {
    	Calculator calc = new Calculator();
    	assertEquals(0, calc.getTotal());
    	calc.add(25);
    	assertEquals(25, calc.getTotal());
    	calc.add(-30);
    	assertEquals(-5, calc.getTotal());
    }

    @Test
    public void testSubtract() {
    	Calculator calc = new Calculator();
    	assertEquals(0, calc.getTotal());
    	calc.subtract(25);
    	assertEquals(-25, calc.getTotal());
    	calc.subtract(-30);
    	assertEquals(5, calc.getTotal());
    }

    @Test
    public void testMultiply() {
    	Calculator calc = new Calculator();
    	calc.add(1);
    	calc.multiply(25);
    	assertEquals(25, calc.getTotal());
    	calc.multiply(4);
    	assertEquals(100, calc.getTotal());
    	calc.multiply(0);
    	assertEquals(0, calc.getTotal());
    }

    @Test
    public void testDivide() {
    	Calculator calc = new Calculator();
    	calc.add(10);
    	calc.divide(2);
    	assertEquals(5, calc.getTotal());
    	calc.divide(-2);
    	assertEquals(-2, calc.getTotal());
    	calc.divide(0);
    	assertEquals(0, calc.getTotal());
    }

    @Test
    public void testGetHistory() {
    	fail("Not yet implemented");
    }

}