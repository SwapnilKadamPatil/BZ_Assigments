package Day11_12_Stock;

public class Stock 
{

	private String stockName;
	private int price;
	private int numberOfShares;
	
	public Stock(String companyName, int price, int numberOfShares) 
	{
		super();
		this.stockName = stockName;
		this.price = price;
		this.numberOfShares = numberOfShares;
	}

	public String getCompanyName() 
	{
		return stockName;
	}

	public void setCompanyName(String companyName) 
	{
		this.stockName = companyName;
	}

	public int getPrice() 
	{
		return price;
	}

	public void setPrice(int price) 
	{
		this.price = price;
	}

	public int getNumberOfShares() 
	{
		return numberOfShares;
	}

	public void setNumberOfShares(int numberOfShares) 
	{
		this.numberOfShares = numberOfShares;
	}

	
}