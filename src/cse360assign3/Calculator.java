package cse360assign3;

/**
 * This class consists of a simple set of methods
 * to perform and store the results of basic arithmetic
 * 
 * @author James Daniel Baird PIN: 115 (CSE360 Spring 2016)
 */
public class Calculator {

	/*
	 * Internal state of calculator
	 */
	private int total;
	private StringBuilder history;
	
	
	/*
	 * Initializes Calculator object and current total to zero
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
		history = new StringBuilder("0");
	}
	
	/*
	 * Obtains an the integer of the internal state variable
	 * @return The current running total of the calculator internal state
	 */
	public int getTotal () {
		return this.total;
	}
	
	/*
	 * Adds a value to the internal state
	 * @param value The value to be added to the total
	 */
	public void add (int value) {
		this.total += value;
		this.history.append(" + " + value);
	}
	
	/*
	 * Subtracts a value from the internal state
	 * @param value The value to be subtracted from the total
	 */
	public void subtract (int value) {
		this.total -= value;
		this.history.append(" - " + value);
	}
	
	/*
	 * Multiply the internal state by some value
	 * @param value The value that the internal state should be multiplied by
	 */
	public void multiply (int value) {
		this.total *= value;
		this.history.append(" * " + value);
	}
	
	/*
	 * Divide the internal state by some value
	 * @param value The value that the internal state should be divided by
	 */
	public void divide (int value) {
		this.history.append(" / " + value);
		if(value == 0)
		{
			this.total = 0;
		}
		else
		{
			this.total /= value;
		}

	}
	
	/*
	 * Obtains the history of operations on the calculators internal state
	 * @return A string representation of the Calculator's history
	 */
	public String getHistory () {
		return this.history.toString();
	}
}