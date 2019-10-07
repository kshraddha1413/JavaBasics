package Basics;

public class Operators {

	public static void main(String[] args) {
       //Arithmatic operators
		int var1=300;
		int var2=100;
		
		int sumResult=var1+var2;
		System.out.println("addition"+sumResult);
		
		int subtractResult=var1-var2;
		System.out.println("subtaraction of 2 numbars:"+subtractResult);
		
		int multi=var1*var2;
		System.out.println("multiplication result:"+multi);
		
		float div=var1/var2;
		System.out.println("division result:"+div);
		
		//increment and decrement operator
		int var =1;
		var++;
		System.out.println("after increment"+var);
		var--;
		System.out.println("after decrement"+var);
		
		
		//abbreviating operators
		
		sumResult+=100;
		System.out.println("100 plus in sum result"+sumResult);
		subtractResult-=20;
		System.out.println("20 minus in subtrat result"+subtractResult);
	}

}
