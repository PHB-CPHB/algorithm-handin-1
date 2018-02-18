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
public enum Suits{
        CLUBS(1),
        DIAMONDS(2),
        HEARTS(3),
        SPADES(4);
        
        private int value;
        
        private Suits(int value){
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    };
