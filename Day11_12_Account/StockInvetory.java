package Day11_12_Stock;

import java.util.Scanner;

public class StockInvetory 
{
	private static final int INVENTORY_SIZE = 12;
	private static Stock[] stocks;

	public StockInvetory() 
	{
		stocks = new Stock[INVENTORY_SIZE];

	}

	private static void StockInventory() 
	{
	       for (int i = 0; i<INVENTORY_SIZE; i++)
	       {
	    	   
	         Scanner sc = new Scanner(System.in);

	         System.out.println ("Stock's name:");
	         String stockName = sc.next();

	         System.out.println ("Stock's price:");
	         int stockPrice = sc.nextInt();

	         System.out.println ("Numbers of shares: ");
	         int numberShares= sc.nextInt();

	         stocks [i]= new Stock(stockName, stockPrice, numberShares);
	       }
	    }

	public static void main (String [] args)
	{
	    StockInventory();

	    

	}
	
}
