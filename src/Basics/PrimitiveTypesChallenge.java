package Basics;

public class PrimitiveTypesChallenge {

	public static void main(String[] args) {
             byte byteVar=49;
             short shortVar=37;
             int intVar=20;
             long longVar=50000+10*(byteVar+shortVar+intVar);
             System.out.println("result "+longVar);
             
             
             short shortResult=(short) (1000+10*(byteVar+shortVar+intVar));//type casting
             
	}

}
