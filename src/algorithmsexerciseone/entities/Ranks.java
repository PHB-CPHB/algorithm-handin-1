/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithmsexerciseone.entities;

/**
 *
 * @author philliphbrink
 */
public enum Ranks{
        ACE(14),
        TWO(2),
        THREE(3),
        FOUR(4),
        FIVE(5),
        SIX(6),
        SEVEN(7),
        EIGHT(8),
        NINE(9),
        TEN(10),
        JACK(11),
        QUEEN(12),
        KING(13);
        
        private int value;
        
        private Ranks(int value){
            this.value = value;
        }

        public int getValue() {
            return value;
        }
        
        
        
};
