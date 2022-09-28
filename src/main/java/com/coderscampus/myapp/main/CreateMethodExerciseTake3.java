package com.coderscampus.myapp.main;

public class CreateMethodExerciseTake3 {

	/** NO CODE GOES IN THIS MAIN METHOD */
	public static void main(String[] args) {
//		new App().numberBetween50And300();
		
		System.out.println("You typed in " + numberBetween50And300());
	}


	
	public static int numberBetween50And300() {
		
		
		
		java.util.Scanner typedInput = new java.util.Scanner(System.in);

		System.out.println("Type a number between 50 and 300");

		String userInput = typedInput.nextLine();
		
		Integer numberizedInput = Integer.parseInt(userInput);

//		int numberOut;
		int numberOut = 0;
		

		if (numberizedInput > 50 && numberizedInput < 300) 
		{  
		 	numberOut = numberizedInput;
		}
//		else
//		{
//			numberOut = numberizedInput;
//			// adding this to have the variable declared
//		}
			 
		return numberOut;
	}

}
