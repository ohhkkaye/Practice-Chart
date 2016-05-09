// interactive practice chart
// get student have a log in
// have student keep their account with their information and number.
import java.util.ArrayList;
import java.util.*;
import java.io.Console;
import java.util.Scanner;
import java.lang.Math;

class Student {	
	
	ArrayList<Integer> minutes = new ArrayList<>();
	ArrayList<String> days = new ArrayList<>();


	public void createStudent() {

		String s;

		Scanner in = new Scanner(System.in);

		System.out.println("Enter your name: ");
      	s = in.nextLine();

		// Console console = System.console();
		// String input = console.readLine();
	
	}

	public void enterData() {

		//String day;
		//String mins;
		String answer;

		Scanner number = new Scanner(System.in);
		Scanner input = new Scanner(System.in);
		System.out.println("Did you practice?");
		answer = input.nextLine();

		boolean t = true;

		while (answer.contains("y")|| answer.contains("Y")) {

			System.out.println("Enter the day you practiced: ");
	      	String day = input.nextLine();		// Console newConsole = System.console();				String day = console.readLine("Enter day: ");
			
			days.add(day);

			//Scanner numbers = new Scanner(System.in);

			System.out.println("Enter how many minutes you practiced (just the number):  ");
	      	int mins = number.nextInt();
	      	System.out.println("You entered this many minutes: "+ mins);

			minutes.add(mins);

			System.out.println("Did you practice any more days?");
			answer = input.nextLine();

		}
		System.out.println("You practiced on these days: " + days );
		//System.out.println("So you practiced on " + day + " for " + mins + " minutes.");
	}

	public void addSum() {
		int sum = 0;
		for (Integer i: minutes) {
			sum = sum + i;
		}
		System.out.println("You practiced a total of " + sum + " minutes");
		if (sum > 100) {
			System.out.println("Whoa that's a lot!");
		}
		if (sum < 21) {
			System.out.println("You need to practice some more!!");
		}
		if (sum > 20 && sum < 100) {
			System.out.println("Good job!");
		}

	}

}


public class PracticeChart {

	public static void main(String[] args){

		Student student1 = new Student(); 

		student1.createStudent();
		student1.enterData();
		student1.addSum();

	}
}
