package arithmeticFunction;

public class ArithmeticFunction {
	public static void main(String[] args) {
		int result = ArithmeticFunction.arithmeticSwitch(5, 2, "divide");
		System.out.println(result);
	}
	  public static int arithmetic(int a, int b, String operator) {
		  int ergebnis = 0;
		  if(operator.equals("add")){
			  ergebnis = a + b;
		  }if(operator.equals("subtract")){
			  ergebnis = a - b;
		  }if(operator.equals("multiply")){
			  ergebnis = a * b;
		  }if(operator.equals("divide")) {
			  ergebnis = a / b;
		  }
		  return ergebnis; 
	  }
	  
	  public static int arithmeticSwitch(int a, int b, String operator) {
		  switch (operator){
	      case "add": return a + b;
	      case "subtract":return a - b;
	      case "multiply":return a * b;
	      case "divide":return a / b;
	      default:return 0;
	  }
}
}
	  
		
	  
//	  switch (operator){
//      case "add": return a + b;
//      case "subtract":return a - b;
//      case "multiply":return a * b;
//      case "divide":return a / b;
//      default:return null;		 
	 
