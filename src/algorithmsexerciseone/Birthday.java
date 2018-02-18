package algorithmsexerciseone;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

/**
 * Assignment - Birthday problem.
 * Write a program that takes an integer N from the commandline and uses 
 * StdRandom.uniform() to generate a random sequence of integers between 0 and N – 1.
 * Run experiments to validate the hypothesis that the number of
 * integers generated before the first repeated value is found is ~√N/2.
 */
/**
 *
 * @author philliphbrink
 */
public class Birthday {
    private Random rn;
    private boolean run;
    
    public Birthday(){
        this.rn = new Random();
        this.run = false;
    }
    
    public void run(int times, int year){
        float sum = 0;
        for (int i = 0; i < times; i++) {
           sum += CtrlNHash(year);
        }
        System.out.println(sum/times);
    }
    
    private int CtrlNHash(int year){
       HashMap hash = new HashMap();
       int count = 0;
       while(run){
        int n = rn.nextInt(year);
        count++;
        if (hash.containsKey(n)){
            run = false;
        } else {
            hash.put(n, true);
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
        if (list.contains(n)){
            run = false;
        } else {
            list.add(n);
        }
       } 
       return count;
    }
}
