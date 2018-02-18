/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithmsexerciseone.entities;

import java.util.ArrayList;

/**
 *
 * @author philliphbrink
 */
public class Card implements Comparable<Card> {
    
    private Suits suit;
    private Ranks rank;
    
    public Card(Suits suit, Ranks rank) {
        this.suit = suit;
        this.rank = rank;
    }
    
    public Suits getSuit() {
        return suit;
    }

    public Ranks getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return "Card {" + "suit : " + suit + ", rank : " + rank + "{ Value " + rank.getValue() + "}" +'}';
    }
    
    @Override
    public int compareTo(Card other) {
        if (this.suit.getValue() < other.getSuit().getValue()) {
            return -1;
        } else if (this.suit.getValue() > other.getSuit().getValue()) {
            return 1;
        } else {
            return Integer.compare(this.rank.getValue(), other.getRank().getValue());
        }
    }
    
}
