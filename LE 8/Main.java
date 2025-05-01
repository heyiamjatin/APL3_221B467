/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		
		Crow crow=new IndianCrow();
		CrowAdaptor crowadaptor = new CrowAdaptor(crow);
		client(crowadaptor);
	}
	public static void client(Swan swan){
	    swan.eat();
	    swan.swim();
	    swan.sing();
	    
	}
}