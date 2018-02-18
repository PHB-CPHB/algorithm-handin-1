package algorithmsexerciseone;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

/**
 * Assignment - Coupon collector problem.
 * Generating random integers as in the previous exercise,
 * run experiments to validate the hypothesis that the number of integers generated
 * before all possible values are generated is ~N HN.
 */

/**
 *
 * @author philliphbrink
 */
public class Cupon {
    private Random rn;
    private boolean run;
    
    public Cupon(){
        this.rn = new Random();
        this.run = true;
    }
    
    public void generateCupons(int times, int cupons){
        float sum = 0;
        for (int i = 0; i < times; i++) {
           sum += CtrlNHash(cupons);
        }
        System.out.println(sum/times);
    }
    
    private int CtrlNHash(int cupons){
       HashMap hash = new HashMap();
       int count = 0;
       while(run){
        int n = rn.nextInt(cupons);
        count++;
        if (!hash.containsKey(n)){
            hash.put(n, true);
        } else if (hash.size() == cupons){
            run = false;
        }
       }
       return count;
    }
    
    private int CtrlNList(int year){
       int count = 0;
        List list = new ArrayList();
       while(run){
        int n = rn.nextInt(year);
        count++;
        if (!list.contains(n)){
            list.add(n);
        } else if(list.size() == n) {
            run = false;
        }
       } 
       return count;
    }
}
