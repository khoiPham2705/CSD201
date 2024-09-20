/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slot3;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author DELL
 */
public class newStack {

    public static void main(String[] agrs) {
        Stack<String> myStack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("enter:");
        String test = sc.nextLine();
        String cleanedInput = test.replaceAll("\\s+", "");
        String[] tmp = cleanedInput.split("");
        boolean cont;
        
        for (String x : tmp) {
            if (!myStack.isEmpty() && isOpposite(myStack.peek(), x)) {
                myStack.pop();
            } else {
                myStack.push(x);
            }
        }
        System.out.println(myStack);
        
        if (myStack.isEmpty() == true) {
            System.out.println("true");
        } else if  ((myStack.isEmpty() == false)){
            System.out.println("false");
        }
    }

    public static boolean isOpposite(String open, String close) {
        return (open.equals("(") && close.equals(")"))
                || (open.equals("{") && close.equals("}"))
                || (open.equals("[") && close.equals("]"));
    }
}
