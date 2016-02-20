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
	private double total;
	private StringBuilder history;
	
	/*
	 * Initializes Calculator object and current total to zero
	 */
	public Calculator() {
		this.total = 0; // not needed - included for clarity
		this.history = new StringBuilder("0");
	}
	
	/*
	 * Obtains an the integer of the internal state variable
	 * @return The current running total of the calculator internal state
	 */
	public double getTotal() {
		return this.total;
	}
	
	/*
	 * Adds a value to the internal state
	 * @param value The value to be added to the total
	 * @return This (the current object), for method chaining.
	 */
	public Calculator add(double value) {
		this.total += value;
		this.history.append(" + " + value);
		return this;
	}
	
	/*
	 * Subtracts a value from the internal state
	 * @param value The value to be subtracted from the total
	 * @return This (the current object), for method chaining.
	 */
	public Calculator subtract(double value) {
		this.total -= value;
		this.history.append(" - " + value);
		return this;
	}
	
	/*
	 * Multiply the internal state by some value
	 * @param value The value that the internal state should be multiplied by
	 * @return This (the current object), for method chaining.
	 */
	public Calculator multiply(double value) {
		this.total *= value;
		this.history.append(" * " + value);
		return this;
	}
	
	/*
	 * Divide the internal state by some value
	 * @param value The value that the internal state should be divided by
	 * @return This (the current object), for method chaining.
	 */
	public Calculator divide(double value) {
		this.total = (value == 0) ? value : this.total / value;
		this.history.append(" / " + value);
		return this;
	}
	
	/*
	 * Obtains the history of operations on the calculators internal state
	 * @return A string representation of the Calculator's history
	 */
	public String getHistory() {
		return this.history.toString();
	}
	/*
	 * Override the toString method to provide useful information
	 * @return A String representation of the Calculator's data
	 */
	public String toString() {
		return "History: " + this.getHistory() + "\nTotal: " + this.total;
	}

}
