/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList; 
/**
 *
 * Group 4 - Aug 12, 2020
 */
public class PlayGame extends Game
{
    public PlayGame(int givenSize,
            String givenName)
    {
        super(givenSize, givenName);
        
    }
    
    public void PlayWar()
    {
        ArrayList<CardRankSuit> cards = new ArrayList<CardRankSuit>();
        for(int i=0; i<13; i++)
        {
            for(int j=0; j<4; j++)
            {
                cards.add(new CardRankSuit(j, i));
            }
        }
        LinkedList<CardRankSuit> deck1 = new LinkedList<CardRankSuit>();
        LinkedList<CardRankSuit> deck2 = new LinkedList<CardRankSuit>();

        deck1.addAll(cards.subList(0, 25));       
        deck2.addAll(cards.subList(26, 51));
        
        while(true)
        {
            CardRankSuit player1 = deck1.pop();
            CardRankSuit player2 = deck2.pop();
            
            System.out.println("Player1: "+player1.toString());
            System.out.println("Player1: "+player2.toString());
            
            if(player1.getRank() > player2.getRank())
            {
                deck1.addLast(player1);
                deck1.addLast(player2);
                System.out.println("Player1 wins this round");
            }
            
            else if(player2.getRank() > player1.getRank())
            {
                deck2.addLast(player1);
                deck2.addLast(player2);
                System.out.println("Player2 wins this round");
            }
            
            else
            {
                System.out.println("Both the rank of cards is same,"
                        + "\nso this is War Round");
                ArrayList<CardRankSuit> p1 = new ArrayList<CardRankSuit>();
                ArrayList<CardRankSuit> p2 = new ArrayList<CardRankSuit>();
                
                for (int i = 0; i < 3; i++) {
                    if(deck1.size() == 0 || deck2.size() == 0 ){
                        break;
                    }
                    p1.add(deck1.pop());
                    p2.add(deck2.pop());
                    System.out.println("Player1: war card "+i);
                    System.out.println("Player2: war card "+i);
                    
                }
                if(p1.size() == 3 && p2.size() == 3)
                {
                    
                    System.out.println("player1 war card "+p1.get(0).toString());
                    System.out.println("player2 war card "+p2.get(0).toString());
                    if(p1.get(2).getRank() > p2.get(2).getRank())
                    {
                        System.out.println("Player1 wins this war round");
                        deck1.addAll(p1);
                    }
                    else
                    {
                        System.out.println("Player2 wins this war round");
                        deck1.addAll(p1);
                    }
                }
               
            }
            
            if(deck1.size() == 0 ){
                System.out.println("Player 1 wins this game");
                break;
            }
            else if(deck2.size() == 0){
                System.out.println("Player 2 wins this game");
                break;
            }
            
        }
    }
    
}
