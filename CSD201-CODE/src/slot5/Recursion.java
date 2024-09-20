/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slot5;

import java.util.Arrays;

/**
 *
 * @author DELL
 */
public class Recursion {

    public static double power(double number, int pow) {

        double result = 1;
        if (pow > 0) {
            result = power(number, pow - 1) * number;
        } else if (pow < 0) {
            result = power(number, pow + 1) * 1 / number;
        }

        return result;
    }

    public static double pw(double number, int pow) {
        if (pow > 1) {
            double result = power(number, pow - 1) * number;
            return result;
        } else if (pow == 0) {
            return 1;
        }
        return 1 / power(number, pow * (-1));
    }

    public static int factorial(int n) {

        if (n == 0 ) {
            return 1;
        } else if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        } else {
            return factorial(n - 1) * (n);
        }
    }
    // tim sum cua chu so
    
    public static int sumDigit(int n){
        if(n > 0){
            return sumDigit(n / 10) + (n % 10);
        }
        return 0;
    }
    public static int findMaxInArray(int[] a, int n){
        
        if(n==1){
            return a[0];
        }
        int max = findMaxInArray(a,n-1);
        
        if(a[n-1] > max){
            return a[n-1];
        }
        else{
            return max;
        }
        
    }
    public static boolean checkPalindrome(String str){
        
        if(str.length() == 1 || str.length() == 0){
            return true;
        }
        if (str.charAt(0) == str.charAt(str.length() - 1)) {
            return checkPalindrome(str.substring(1,str.length()-1));
        }
        else{
            return false;
        }
                
        
    }
    public static int fibonacii(int n){
        if(n== 1){
            return 0;
        }
        else if(n==2){
            return 1;
        }
        else{
            return fibonacii(n-1) + fibonacii(n-2);
        }
    }
    //0 1 1 2 3 5 8 13 21
    //1 2 3 4 5 6 7 8  9

    public static void main(String[] agrs) {
        
            int[] a = {2,4,5,0,1};
            int n = a.length;

        System.out.println(fibonacii(6));

    }
}
