
public class Calculator {
	private double results;
	private double OpOne;
	private double OpTwo;
	private char operator;
	
	public Calculator() {
		
	}
	
	public void setOpOne(double input) {
		this.OpOne = input;
	}
	
	public void setOpTwo(double input) {
		this.OpTwo = input;
	}
	
	public void setOperator(char input) {
		this.operator = input;
	}
	
	public void performOperation() {
		if(this.operator == '+') {
			results = (OpOne) + (OpTwo);
		}
		if(this.operator == '-' ) {
			results = (OpOne) - (OpTwo);
		}
	}
	public void getResults() {
		System.out.println(results);
	}
}
