
public class Program {

	public static void main(String[] args) {
		Calculator math = new Calculator();
		math.setOpOne(10.5);
		math.setOpTwo(5.2);
		math.setOperator('+');
		math.performOperation();
		math.getResults();
	}
}

