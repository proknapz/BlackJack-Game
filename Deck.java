//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Omar Khan
//Date - 3/30/2021

import java.util.ArrayList;
import java.util.Collections;

public class Deck
{
	public static final int NUMFACES = 13;
	public static final int NUMSUITS = 4;
	public static final int NUMCARDS = 52;

	public static final String SUITS[] = {"CLUBS","SPADES","DIAMONDS","HEARTS"};
   
   public static final String FACES[] = {"ACE","TWO","THREE","FOUR",
			"FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};

	private int topCardIndex;
   private int cardsUsed;
	
   private Card[] deck;

	public Deck ()
	{
		//initialize data - stackOfCards - topCardIndex
		deck = new Card[52];
      topCardIndex = NUMCARDS - 1;
		
		//loop through suits
			//loop through faces
				//add in a new card
            int cardCount = 0;
            for(int suit = 1; suit < NUMSUITS; suit++){
         for(int value = 0; value < NUMFACES; value++){
         deck[cardCount] = new Card(value,SUITS[suit]);
         cardCount++;
          }
         }
		cardsUsed = 0;
	}

	//modifiers
   public void shuffle ()
	{

    for ( int i = 51; i > 0; i-- ) {
            int rand = (int)(Math.random()*(i+1));
            Card temp = deck[i];
            deck[i] = deck[rand];
            deck[rand] = temp;
        } 
  cardsUsed = 0;
	}

   //accessors
	public int  size ()
	{
		return 0;
	}

	public int numCardsLeft()
	{
		return 52 - cardsUsed;
	}

	public Card nextCard()
	{
   if (cardsUsed == 52)
           shuffle();
        cardsUsed++;
        return deck[cardsUsed - 1];
	}

	public String toString()
	{
		return deck + "   topCardIndex = " + topCardIndex;
	} 
}