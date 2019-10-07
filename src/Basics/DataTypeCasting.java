package Basics;

public class DataTypeCasting {

	public static void main(String[] args) {
     int maxIntValue=5095;
     byte maxByteValue=25;
     short maxShortValue=47;
     
     int result1= (maxIntValue/2);
     byte result2=(byte) (maxByteValue/2);//type casting
     short result3=(short)(maxShortValue/2);
     
     System.out.println("Integer result"+result1);
     System.out.println("byte casting value"+result2);
	System.out.println("short casting"+result3);
	}
	

}



