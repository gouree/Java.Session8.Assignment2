import java.util.*;

//prime class implements runnable interface
class Prime implements Runnable
{
	int n;
	
	//pass the console input as parameter to constructor
    public Prime(int num)
    {
		    n=num;
	}

	public void run()
    {
                
          int i;
          boolean isPrime = true;

 
          //logic for prime numbers
          //if number is divisible by any number -->not prime
          
          for(i = 2; i <= n / 2; ++i)
          {
        	  if(n % i == 0)
        	  {
        		  isPrime = false;
        		  break;
        	  }
          }
          
          if (isPrime)
        	   System.out.println("Number is prime");
          else
        	   System.out.println("Number is not prime");

      }
}     
        
class ThreadPrime
{
    public static void main(String args[])
    {
        try
        {
           
            int num;
            
            //console input
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a number:");
            num= input.nextInt();
            
            //create object of class prime
            Prime p1=new Prime(num);
            
            //create a thread t1 for object p1 
            Thread t1=new Thread(p1);
            t1.start();
        }
        catch(Exception e1)
        {
        	System.out.println("Exception occured");
        }
    }
}