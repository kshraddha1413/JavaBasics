package Basics;

public class OperatorPrecedence {

	public static void main(String[] args) {
       double dVar1=20.00d;
       double dVar2=80.00d;
       double rVar=dVar1+dVar2*100;
       System.out.println(rVar);
       double reminder= rVar% 40.00;
       System.out.println("Reminder :"+reminder);
       
       boolean var;
       if(reminder==0) {
    	   var=true;
       }else
       {
    	   var=false;
       }
       System.out.println("boolean variable:"+var);
       if(!var) {
    	   System.out.println("got some reminder");
       }
	
       
       double d1Var=20.00d;
       double d2Var=80.00d;
       double rVar1=(d1Var+d2Var)*100;  //operator precedency
       System.out.println(rVar1);
       double remin= rVar1% 40.00;
       System.out.println(remin);
      boolean bVar;
       if(remin==0) {
    	   bVar=true;
       }else
       {
    	   bVar=false;
       }
       System.out.println("boolean variable:"+var);
       if(!bVar) {
    	   System.out.println("got some reminder");
       }
       
	}

}
