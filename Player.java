//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Omar Khan
//Date - 3/30/2021

import java.util.*;

public class Player extends Card
{
   private ArrayList<Card> hand;
   private int winCount;
   
   private ArrayList<Integer>hand2 = new ArrayList<Integer>();

   public Player ()
   {
   hand = new ArrayList<Card>();
   winCount = 0;
   }

   public Player (int score)
   {
   winCount = score;
   }

   public void addCardToHand( Card temp )
   {
   hand.add(temp);
   }

   public void resetHand( )
   {
   hand.clear();
   hand = new ArrayList<Card>();
   }

   public  void setWinCount( int numwins )
   {
   winCount = numwins;
   winCount++;
   }

   public int getWinCount() { return winCount; }

   public int getHandSize() { return hand.size(); }

   public int getHandValue()
   {
   int x = 0;
 int total = 0;
       for (int i = 0; i < hand.size(); i++){
           if (hand.get(i).getValue() == x){
               hand2.add(i);  
               x++;             
           }
           else{
               total += hand.get(i).getValue();
           }
       }
       for (int i = 0; i < hand2.size(); i++){
           if (total <= 10){
               total += 11;
           }
           else{
               total += 1;
           }
       }
       hand2.clear();
       return total;
   }

   public  boolean  hit( )
   {
      return false;
   }

   public String toString()
   {
      return "hand = " + hand.toString() + "\n hand Value - " + getHandValue() + " \n Wins - " + winCount;
   }
}