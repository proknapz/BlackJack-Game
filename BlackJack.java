//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Omar Khan
//Date - 4/4/2021

import static java.lang.System.*;
import java.util.Scanner;

public class BlackJack
{
	//add in Player instance variable
	//add in Dealer instance variable
   private Dealer dealer;
   private Player player;

	public BlackJack()
	{
   dealer = new Dealer();
   player = new Player();
	}

	public void playGame()
	{
       
		Scanner keyboard = new Scanner(System.in);
		String choice = "";
      dealer.shuffle();
      do{
      
    ///* 
      dealer.shuffle();
		
		player.addCardToHand(dealer.deal());
		dealer.addCardToHand(dealer.deal());
		player.addCardToHand(dealer.deal());
		dealer.addCardToHand(dealer.deal());
		
		int playerTotal = player.getHandValue();
		int dealerTotal = dealer.getHandValue();
		
		out.println("\nPLAYER ");
		out.println("Hand Value :: " + playerTotal );
		out.println("Hand Size :: " + player.getHandSize() );
		out.println("Cards in Hand :: " + player.toString() );
		out.println("\nDEALER ");
		out.println("Hand Value :: " + dealerTotal );
		out.println("Hand Size :: " + dealer.getHandSize() );
		out.println("Cards in Hand :: " + dealer.toString() );
		
		if(playerTotal>21&&dealerTotal<=21)
		{
		   out.println("\nDealer wins - Player busted!");
		}
		else if(playerTotal<=21&&dealerTotal>21)
		{
		   out.println("\nPlayer wins - Dealer busted!");
		}
		else if(playerTotal>21&&dealerTotal>21){
		   out.println("Both players bust!");
		}
		else if(playerTotal<dealerTotal){
		   out.println("\nDealer has bigger hand value!");
		}
		else{
		   out.println("\nPlayer has bigger hand value!");
		}	
      
      //*/
		      
      System.out.print("Another game? -->  ");
      choice = keyboard.nextLine();
      }while(choice.equals("y") || choice.equals("Y"));
      
	}
	
	public static void main(String[] args)
	{
		BlackJack game = new BlackJack();
		game.playGame();
      
	}
}