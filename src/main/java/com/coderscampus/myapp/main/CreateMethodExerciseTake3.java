package com.coderscampus.myapp.main;

public class CreateMethodExerciseTake3 {

	/** NO CODE GOES IN THIS MAIN METHOD */
	public static void main(String[] args) {
//		new App().numberBetween50And300();
		
		System.out.println("You typed in " + numberBetween50And300());
	}


	// I need to first grock how Integer is used correctly, since it isn't a variable.
	
	public static Integer numberBetween50And300() {
		
		
		
		java.util.Scanner typedInput = new java.util.Scanner(System.in);

		System.out.println("Type a number between 50 and 300");

		String userInput = typedInput.nextLine();
		
		Integer numberizedInput = Integer.parseInt(userInput);


//		numberOut = 0;
		

		if (numberizedInput > 50 && numberizedInput < 300) 
		{  
		 	Integer numberOut = numberizedInput;
		}
//		else
//		{
//			numberOut = "null";
//			
//		}
//			 
		integerOut = numberOut;
		return integerOut;
	}

}
