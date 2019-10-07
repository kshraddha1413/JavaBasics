package Basics;

public class IfElseStatement {

	public static void main(String[] args) {
//Conditional Statement
		int var=100;
		boolean val=false;
		if(var>=100) //check condition and returns true or false
			System.out.println("If Statement is true");
		
		if(var>100) 
			System.out.println("if statement is false");
			System.out.println("2nd statemnt not in block");
		
		if (val) {
			System.out.println("value of boolean variable"+val);
		}else {
			System.out.println("value of boolean variable"+val);
		}
		
	}

}
