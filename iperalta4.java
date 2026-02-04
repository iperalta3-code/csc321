//Ivan Peralta
//Code Work for lab #4 that is a menu of 4 options.

import java.util.Scanner;
public class iperalta4
{
	public static void main(String[] args)
	{
		System.out.println("Howdy, welcome the the start menu of this program!!!");
		System.out.println("Please enter a number that corresponds with one of the following choices.\n");

		System.out.println("1) Count to 10.");
		System.out.println("2) Type out the word 'The' in caps.");
		System.out.println("3) Tell you the capitol of California.");
		System.out.println("4) Why did the chicken cross the road?");

		Scanner keyboard = new Scanner(System.in);

		int input = keyboard.nextInt();

		while(input < 0 || input > 4)
		{
			System.out.println("Sorry but the number you typed didnt work. PLEASE try again!!!");
			input = keyboard.nextInt();
		}

		if(input == 1)
		{
			for(int i = 1; i < 11; i++)
			{
				System.out.println(i);
			}
		}
		else if(input == 2)
		{
			System.out.println("THE");
		}
		else if(input == 3)
		{
			System.out.println("The capitol of California is Sacramento");
		}
		else if(input == 4)
		{
			System.out.println("it was to get to the other side");
		}
	}
}
