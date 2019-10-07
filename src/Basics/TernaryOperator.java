package Basics;

public class TernaryOperator {

	public static void main(String[] args) {
     boolean isCar=false;
     boolean wasCar=isCar?true:false;//3 operands 1. Condition,2.first value,3.2nd value
     System.out.println("terenary operator 1st value if given condition is true:"+wasCar);
     
     int age=25;
     boolean isAgeOver=age==20?true:false;
     System.out.println("terenary operator 2nd value if given condition is not true"+ isAgeOver);
	}

}
