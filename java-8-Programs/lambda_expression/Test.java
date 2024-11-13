package lambda_expression;

interface Interf {

	public void methodOne() {
		
	}

	public class Test {
		public static void main(String[] args) {
			Interf i = () -> System.out.println("sandyyyy");
			i.methodOne();
		}
	}
}
