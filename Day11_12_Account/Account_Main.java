package Day11_12_Account;

import java.util.*;
public class Account_Main
{
 public static void main(String[] args)
 {
   Account acc[]=new Account[100];
   int count=0;
   int ch;
   Scanner sc=new Scanner(System.in);
   do
   {
	 System.out.println("\n1)Create Account"); 
	 System.out.println("2)Display All Account Deatils");  
	 System.out.println("3)Withdraw");
	 System.out.println("4)Deposit");  
	 System.out.println("Enter your choice:");
	 ch=sc.nextInt();
	 switch(ch)
	 {
	   case 1:
		       acc[count]= new Account();
		       acc[count].accept();
		       count++;
		       break;
	   case 2:
		       for(int i=0;i<count;i++)
		       {
		        acc[i].display();	   
		       }
		       break;
	   case 3:
		      System.out.println("Enter the Account No:");
		      int accno=sc.nextInt();
              System.out.println("Enter the amount to be withdraw:");
              double amt=sc.nextDouble();
              int flag=0;
              for(int i=0;i<count;i++)
              {
            	 if(acc[i].getAno()==accno)
            	 { 
            		 flag=1;
            		 acc[i].withdraw(amt);
            	 }
              }
              if(flag==0)
            	  System.out.println("Invalid Account number");
		      break;
	   case 4:
		      System.out.println("Enter the Account No:");
		      accno=sc.nextInt();
           System.out.println("Enter the amount to be deposit:");
           amt=sc.nextDouble();
           flag=0;
           for(int i=0;i<count;i++)
           {
         	 if(acc[i].getAno()==accno)
         	 { 
         		 flag=1;
         		 acc[i].deposit(amt);
         	 }
           }
           if(flag==0)
         	  System.out.println("Invalid Account number");
		      break;	      
	   case 5:		   
		      
	 } 
   }while(ch!=8);
 }
}
