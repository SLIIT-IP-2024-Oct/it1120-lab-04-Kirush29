import java .util.Scanner;
public class IT24104106Lab4Q1{
  public static void main(String[]args){
   Scanner input=new Scanner(System.in);
    int number;
	System.out.print("Enter the number :");
	number=input.nextInt();
	if(number>0)
	{
	  System.out.println("The numberis:Positive");
	}
	  if(number<0) 
	  {
	    System.out.println("The number is: Negtive");
	  }
          if(number==0)
	  {
	    System.out.println("The number is: Zero");
	  }

  } 
}    	 