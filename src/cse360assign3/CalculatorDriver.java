public class CalculatorDriver {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.add(5).subtract(2).multiply(6).divide(4);
		System.out.println(cal);
	}
}
