package com.java.TelAssignment;
//5.Guessing Random in game need more implementation
import java.util.Scanner;

class Guessing
{
	int guessNumber()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Please Guess the number and enter here:");
		int guessNumber=sc.nextInt();
		return guessNumber;	
	}

}
class Player
{
	int guessNumber;
	int guesingnumber()
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("Player please guess da number");
	guessNumber=sc.nextInt();
	return guessNumber;
	}
}
class CheckingGuessing
{
	int numFromGueser;
	int numFromPlayer;
	int numFromPlayer1;
	int numFromPlayer2;

	void collectNumberFromGuesser()
	{
		Guessing gc= new Guessing();
		numFromGueser=gc.guessNumber();
	}
	void collectNumberFromPlayer()
	{
		Player pr= new Player();
		numFromPlayer=pr.guesingnumber();
		Player pr1= new Player();
		numFromPlayer1=pr1.guesingnumber();
		Player pr2= new Player();
		numFromPlayer2=pr2.guesingnumber();
	}
	void compare()
	{
		if(numFromGueser==numFromPlayer)
		{
			if(numFromGueser==numFromPlayer1 && numFromGueser==numFromPlayer2 )
			{
			System.out.println("First Player Player1 and Player2 guessed high and game ties");
			}
			else if(numFromGueser==numFromPlayer1)
			{
			System.out.println("Player and Player1 guessed matching number");
			}	
			else if(numFromGueser==numFromPlayer2)
			{
			System.out.println("Player and Player2 guessed correctly");
			}
			else 
			{
				System.out.println("Player2 won the game");
			}
		}
		else if(numFromGueser==numFromPlayer1)
		{
			System.out.println("Second Player won the game");
		}
		else if(numFromGueser==numFromPlayer2)
		{
			System.out.println("Third Player won the game");
		}
		else
		{
			System.out.println("None won the game");
		}
	}	

}
public class RandomNumber5 {

	public static void main(String[] args)
	{
		CheckingGuessing gcc=new CheckingGuessing();
		gcc.collectNumberFromGuesser();
		gcc.collectNumberFromPlayer();
		gcc.compare();
		

	}

}
