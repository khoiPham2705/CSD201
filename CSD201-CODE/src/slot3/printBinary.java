/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slot3;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author DELL
 */
public class printBinary {
    public static String[] printBinary(int n){
        Queue<String> queue = new LinkedList<>();
        String[] result = new String[n];
        queue.offer("1");//enqueue
        for(int i = 0 ; i < n ; i++){
            result[i] = queue.poll();
            String left = result[i] +"0";
            String right = result[i] +"1";
            queue.offer(left);
            queue.offer(right);
        }
        return result;
    }
   
    
    
    
    public static void main(String[] agrs){
        
        String[] result = printBinary(9);
        for(String x : result){
            System.out.print(x + " ");
        }
        System.out.print("");
        
    }
}
