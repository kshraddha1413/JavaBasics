package Basics;



public class LogicalOperators {

	public static void main(String[] args) {
      int marks=60;//single = sign for assingment
      // both condition shouldbe true in logical and operator
      if((marks<100)&&(marks<40)) {
    	  System.out.println("Student passed in exam");
      }else {
    	  System.out.println("Student faild in exam");  
      }
      int mMarks=101;
      //either condition should be true
      if((mMarks<100)||(mMarks>40)) {
    	  System.out.println("Student passed in exam");
      }else {
    	  System.out.println("Student faild in exam");  
      }
      
      boolean var=false;
      //== equalto operator
      if(var==false) {
    	  System.out.println("condition is true");
      }else {
      System.out.println("condition is false");
	}
	}

}
