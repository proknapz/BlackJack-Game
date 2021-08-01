//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Omar Khan
//Date - 4/3/2021
import java.util.*;
import static java.lang.System.*;
import java.awt.Color;

public class Dealer extends Player
{
	//define a deck of cards
private Deck deckOfCards;

	public Dealer() {
   deckOfCards = new Deck();
	}

	public void  shuffle()
	{
      deckOfCards.shuffle();
	}

	public Card  deal(){
	   return deckOfCards.nextCard();
	}
	
	public int numCardsLeftInDeck()
	{
		return deckOfCards.size();
	}

	public boolean hit()
	{
	   return false;
    }
}








