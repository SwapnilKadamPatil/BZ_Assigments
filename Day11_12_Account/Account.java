package Day11_12_Account;

import java.util.Scanner;

public class Account 
{
  private int ano;
  private String cname;
  private double abal;
  private String city;
  public static int cnt;
  
  static
  {
	  cnt=0;
  }
  
public Account() {
	super();
	ano=cnt++;
}
public Account(String cname, double abal,String city)
{
	super();
	this.ano = cnt++;
	this.cname = cname;
	this.abal = abal;
	this.city=city;
}
public int getAno() {
	return ano;
}
public void setAno(int ano) {
	this.ano = ano;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public double getAbal() {
	return abal;
}
public void setAbal(double abal) {
	this.abal = abal;
}


public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
@Override
public String toString() {
	return "Account [ano=" + ano + ", cname=" + cname + ", abal=" + abal + "]";
}
 public void accept()
 {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Account No:"+ano);
	  System.out.println("Customer Name:");
	  cname=sc.next();
	  System.out.println("Account bal:");
	  abal=sc.nextDouble();
	  System.out.println("Customer city:");
	  city=sc.next();
 }
 public void withdraw(double amt)
 {
	 if(abal>=amt)
		  abal=abal-amt;
	 else
		 System.out.println("Insufficient Balance....!!!");
 }
 
 public void deposit(double amt)
 {
 	  abal=abal+amt;
 }
 
 
 
  public void display()
  {
	System.out.println("ano=" + ano + ", cname=" + cname + ", abal=" + abal);  
  }
  
}// end class
