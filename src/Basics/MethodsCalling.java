package Basics;

public class MethodsCalling {

	public static void main(String[] args) {
		sum();
		multiplication(20,30);//parameterised method calling
		int reminder=modulus(30,2);//method returning values
		System.out.println("reminder:"+reminder);
	}
	public static int sum() {
		   int num1=50;
	       int num2=100;
	       int sum=num1+num2;
	    	System.out.println("sum of number:"+sum);
	    	return sum;
	}
	
	public static double multiplication(double num1,double num2) {
		double result=num1*num2;
		System.out.println("multiplication of two numbers:"+result);
		return result;
	}
	
	public static int modulus(int num1,int num2)
	{
		int mod=num1%num2;
		return mod;
	}

}
