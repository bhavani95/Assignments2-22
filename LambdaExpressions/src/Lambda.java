
public class Lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi");
		myLambda funct = () -> System.out.println("Hi this is a lambda function");
		funct.abc();
		
	}
	interface myLambda{
		void abc();
		
	}
}