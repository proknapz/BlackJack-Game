//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Omar Khan
//Date - 3/27/2021

public class BlackJackCard extends Card
{
  	//constructors
   
    public BlackJackCard(int f,String s)
   {
      super(f,s);       
   }

    public BlackJackCard(){}
   
   
   


  	public int getValue()
  	{
  		//enables you to build the value for the game into the card
  		//this makes writing the whole program a little easier

     switch(super.getValue())
     {
     
     case 1: return 11; 
     case 2: return 2; 
     case 3: return 3; 
     case 4: return 4; 
     case 5: return 5; 
     case 6: return 6; 
     case 7: return 7; 
     case 8: return 8; 
     case 9: return 9; 
     case 11: return 9;
     case 12: return 10; 
     
     default: return 0;
     
     
     
     }


		
  	}
   
   public String toString()
   {
     return super.toString();
   }
  	
 }