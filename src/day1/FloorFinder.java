package day1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FloorFinder {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input;
		try {
			input = new Scanner(new File("input.txt"));
			
			String myInput = input.nextLine();
			System.out.println("My input size: "+ myInput.length());
			int floor = 0;
			for(int i = 0; i < myInput.length(); i++)
			{
				if(myInput.charAt(i)=='(')
				{
					floor++;
				}
				else if (myInput.charAt(i)==')')
				{
					floor--;	
				}
			}//end for
			System.out.println("Santa should be on floor: " + floor);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
