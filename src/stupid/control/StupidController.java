package stupid.control;

import java.util.Scanner;

public class StupidController 
{
	private String myName;
	private Scanner inputReader;
	
	public StupidController()
	{
		myName = "Matt Powley"; 
		inputReader = new Scanner(System.in);	
	}
	
	public void start()
	{
		System.out.println("this program is less stupid");
		System.out.println(myName);
		askQuestions();
	}
	
	private void askQuestions()
	{
		System.out.println("How was your day?");
		String input = inputReader.nextLine();
		System.out.println("Oh, you said: " + input + " about your day.");
		
		System.out.println("My next question is this: What is the best type of food?");
		String foodInput = inputReader.nextLine();
		System.out.println("OK, you typed this: " + foodInput);
		
		System.out.println("How old are you?");
		int ageInput = inputReader.nextInt();
		System.out.println("Oh you are only " + ageInput + " years old, you are so young."); 
		inputReader.nextLine();
		
		System.out.println("What is your GPA?");
		float gpaInput = inputReader.nextFloat();
		System.out.println("OK you have a " + gpaInput + " grade point average.");
		
		System.out.println("What is your name?");
		String nameInput = inputReader.next();
		System.out.println("OK, your firs name is " + nameInput + ".");
		inputReader.nextLine(); //used to clear out the reader and extra text I do not need.
		
		System.out.println("What School do you go to?");
		String schoolInput = inputReader.nextLine();
		System.out.println("You go to " + schoolInput + ", what a great school!");
		
		
		
		
		
		
		
		
		
		
	}

}
