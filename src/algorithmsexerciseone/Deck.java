package algorithmsexerciseone;

import algorithmsexerciseone.entities.Card;
import algorithmsexerciseone.entities.Ranks;
import algorithmsexerciseone.entities.Suits;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Assignment - Deck sort.
 * Explain how you would put a deck of cards in order by suit (in the
 * order spades, hearts, clubs, diamonds) and by rank within each suit, with the restriction
 * that the cards must be laid out face down in a row, and the only allowed operations are
 * to check the values of two cards and to exchange two cards (keeping them face down).
 */

/**
 *
 * @author philliphbrink
 */
public class Deck {
    ArrayList<Card> deck;
    
    public Deck() {
        this.deck = getCards();
    }
    
    private ArrayList<Card> getCards(){
        ArrayList<Card> cards = new ArrayList(52);
        for (Suits suit : Suits.values()) {
            for (Ranks rank : Ranks.values()) {
                Card c = new Card(suit,rank);
                cards.add(c);
            }
        }
        return cards; 
    }

    private void showDeck(){
        int i = 1;
        for (Card card : deck) {
            System.out.println(i + " : " + card.toString());
            i++;
        }
    }
    
    public void shuffleDeck() {
        Collections.shuffle(deck);
        System.out.println("-------------------Unsorted deck----------------------");
        showDeck();
    }
    
    public void shellSortDeck(){
        
        int n = deck.size();
        
        for (int gap = n/2; gap > 0; gap /= 2)
        {
            for (int i = gap; i < n; i += 1)
            {
                Card temp = deck.get(i);
                int j;
                for (j = i; j >= gap && deck.get(j - gap).compareTo(temp) > 0; j -= gap) {
                    deck.set(j, (deck.get(j - gap)));
                }

                deck.set(j, temp);
            }
        }
        System.out.println("-------------------Sorted deck---------------------");
        showDeck();
    }
    
}
