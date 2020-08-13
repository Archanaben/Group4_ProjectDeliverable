/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * A concrete class that represents any grouping of cards for a Game.
 * HINT, you might want to subclass this more than once.
 * The group of cards has a maximum size attribute which is flexible for reuse.
 * @author dancye
 */
public class GroupOfCards 
{
   
    //The group of cards, stored in an ArrayList
    private ArrayList <CardRankSuit> cards;
    private int size;//the size of the grouping
    
    GroupOfCards(int givenSize)
    {
        size = givenSize;
        
    }
    
    /**
     * A method that will get the group of cards as an ArrayList
     * @return the group of cards.
     */
    public ArrayList<CardRankSuit> showCards()
    {
        for(int i=0; i<13; i++)
        {
            for(int j=0; j<4; j++)
            {
                cards.add(new CardRankSuit(j, i));
            }
        }
        return cards;
    }
    
    public void shuffle()
    {
        Collections.shuffle(cards, new Random());
    }

    
    /**
     * @return the size of the group of cards
     */
    public int getSize() {
        return size;
    }

    /**
     * @param givenSize the max size for the group of cards
     */
    public void setSize(int givenSize) {
        size = givenSize;
    }
    
}//end class
