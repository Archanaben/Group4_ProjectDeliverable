/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

/**
 *
 * @author harsh
 */
public class CardRankSuit extends Card
{
    CardRankSuit(int suit, int rank)
    {
        super(suit, rank);
    }
    
    public String toString()
    {
        StringBuilder str = new StringBuilder();
        
        switch(super.getSuit())
        {
            case 0:
                str.append("Spades ");
                break;
            case 1:
                str.append("Hearts ");
                break;
            case 2:
                str.append("Clubs ");
                break;
            case 3:
                str.append("Diamonds ");
                break;
            default: //anything else, do nothing
                break;
        }
        
        switch(super.getRank()){
            //since rank is int type, now match int 11 to String jack...14 to Ace
            case 11:
                str.append("Jack ");
                break;
            case 12:
                str.append("Queen ");
                break;
            case 13:
                str.append("King ");
                break;
            case 14:
                str.append("Ace ");
                break;
            default:
                str.append(super.getRank());
                break;
        }
        
        return str.toString();
    }
}
