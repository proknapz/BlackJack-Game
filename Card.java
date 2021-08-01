//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Omar Khan
//Date - 3/27/2021

public class Card
{
	public static final String FACES[] = {"ZERO","ACE","TWO","THREE","FOUR",
			"FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};
         
	

	private String suit;
	private int face;

  	//constructors
   public Card(int f,String s)
   {
   face = f;
   suit = s;
   }
   
   public Card(){}
	//modifiers
   

  	//accessors

  	public int getValue()
  	{
  		return face;
  	}
   
   public String getSuit()
   {
      return suit;
   }

	public boolean equals(Object obj)
	{
     Card other = (Card)obj;
     if(getValue() == other.getValue() && getSuit() == other.getSuit())
           return true;
	  return false;
	}

  	//toString
   
   public String toString()
   {
     return FACES[face] + " of " + getSuit() + " | value = " + getValue();
   }

  	
 }