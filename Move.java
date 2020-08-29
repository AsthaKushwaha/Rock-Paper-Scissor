import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Move {
	
	String playerName;
	String compMove;
	String pMove;
	int choice;
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	public void setName() throws Exception
	{
	     System.out.println("Please enter your name :");
	   
	     try
	        {
	            playerName = br.readLine();
	        }
	     catch(Exception ex)
	       {}
	}
	
	public String playerMove() throws Exception
	{
		System.out.println("Hey, " + playerName + " Please Enter your move :");
		System.out.println("1.Rock");
		System.out.println("2.Paper");
		System.out.println("3.Scissor");
		try
		{
			 choice = Integer.parseInt(br.readLine());
		}
		catch(Exception ex) {}
	   
	    switch(choice)
	    {
	    case 1: pMove = "ROCK";
	    	    break;
	    	    
	    case 2: pMove = "PAPER";
	    	    break;
	    	    
	    case 3: pMove = "SCISSOR";
	            break;
	            
	    default : System.out.println("Wrong Choice!!!");
	    }
	    return pMove;
	    
	    
	    
	}
	
	public void computerMove()
	{
		Random random = new Random();
		int input = random.nextInt(3)+1;
		if(input == 1)
		{
			compMove = "ROCK";
		}
		
		else if(input == 2)
		{
			compMove = "PAPER";
		}
		
		else
		{
			compMove  = "SCISSOR";
		}
		System.out.println("Computer move is : "+ compMove );
		
		
	}
	

}
