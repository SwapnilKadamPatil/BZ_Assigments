package com.Day04_Snake_Ladders;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;


public class SnakeNLadderTest 
{

	public static void main(String[] args) 
	{
		SnakeNLadder s = new SnakeNLadder();
		s.startGame();
	}
}

class SnakeNLadder
{

	final static int WINPOINT = 100;

	//UC- 07 = Play the game with 2 Player. In this case if a Player gets a Ladder then plays again.Finally report which Player won the game

	static Map<Integer,Integer> snake = new HashMap<Integer,Integer>();
	static Map<Integer,Integer> ladder = new HashMap<Integer,Integer>();

	{
		snake.put(99,54);
		snake.put(70,55);
		snake.put(52,42);
		snake.put(25,2);
		snake.put(95,72);

		ladder.put(6,25);
		ladder.put(11,40);
		ladder.put(60,85);
		ladder.put(46,90);
		ladder.put(17,69);
	}


	//Uc_2 = The Player rolls the die to get a number between 1 to 6.	

	public int rollDice()
	{
		int n = 0;
		Random r = new Random();
		n=r.nextInt(7);
		return (n==0 ? 1:n);
	}

	//Uc_01 = Snake and Ladder game played with single player at start position 0	

	public void startGame()
	{
		int player1 =0, player2=0;
		int currentPlayer=-1;
		Scanner s = new Scanner(System.in);
		String str;
		int diceValue =0;

		do
		{
			System.out.println(currentPlayer==-1 ?"\n\nFIRST PLAYER TURN":"\n\nSECOND PLAYER TURN");
			System.out.println("Press r to roll Dice");
			str = s.next();
			diceValue = rollDice();


			if(currentPlayer == -1)
			{
				player1 = calculatePlayerValue(player1,diceValue);
				System.out.println("First Player :: " + player1);
				System.out.println("Second Player :: " + player2);
				System.out.println("------------------");

				if(isWin(player1))
				{
					System.out.println("First player wins");
					return;
				}
			}
			else
			{
				player2 = calculatePlayerValue(player2,diceValue);
				System.out.println("First Player :: " + player1);
				System.out.println("Second Player :: " + player2);
				System.out.println("------------------");

				if(isWin(player2))
				{
					System.out.println("Second player wins");
					return;
				}
			}
			currentPlayer= -currentPlayer;
			
		}while("r".equals(str));
	}

//Uc-05 = Ensure the player gets to exact winning position 100

	public int calculatePlayerValue(int player, int diceValue)
	{
		player = player + diceValue;

		if(player > WINPOINT)
		{
			player = player - diceValue;
			return player;
		}

		return player;
	}

	public boolean isWin(int player)
	{
		return WINPOINT == player;
	}

}

