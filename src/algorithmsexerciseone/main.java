/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithmsexerciseone;


/**
 *
 * @author philliphbrink
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        switch (args[0]){
            case "Birthday":
                Birthday birthday = new Birthday();
                birthday.run(Integer.parseInt(args[1]), Integer.parseInt(args[2]));
                break;
            case "Cupon":
                Cupon cupon = new Cupon();
                cupon.generateCupons(Integer.parseInt(args[1]), Integer.parseInt(args[2]));
                break;
            case "Deck":
                Deck deck = new Deck();
                deck.shuffleDeck();
                deck.shellSortDeck();
                break;
                
        }
        
    }
    
    
}
