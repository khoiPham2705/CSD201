/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slot1;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Homework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        System.out.println("enter question:");
        int no = scanner.nextInt();  
        if (no == 1){
            int[] arr = {9,7,0,5,12,3,11,8};
            System.out.println("find second max or min?: (1,2) ");
            int choice = scanner.nextInt();
            if (choice == 1){
                System.out.println("second max is:" + findSecondMax(arr));
            }
            if(choice == 2){
                System.out.println("second min is:" + findSecondMin(arr));
            }
            
            
        }
        if (no == 2){
            System.out.println("enter:");
            String test = scanner.nextLine();
            System.out.println(checkPalindrome(test));
        }
        if (no ==3 ){
            int[] arr = {8,4,0,2,0,1,0,3};
            moveAll0ToEnd(arr);
            
        }
        
        
    }
    public static int findSecondMax(int[] a){
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        
        
        for(int i = 0 ; i < a.length; i++){
            if ( a[i] > max1){
                max2 = max1;
                max1 = a[i];         
            }
            if (a[i] < max1 && a[i] > max2){
                max2 = a[i];
            }
            
        }
           return max2;
    }
    public static int findSecondMin(int[] a){
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        
        
        for(int i = 0 ; i < a.length; i++){
            if ( a[i] < min1){
                min2 = min1;
                min1 = a[i];         
            }
            if (a[i] > min1 && a[i] < min2){
                min2 = a[i];
            }
            
        }
           return min2;
    }
    public static boolean checkPalindrome(String str){
        StringBuilder result = new StringBuilder();
        String[] tmp = str.split("");
        boolean check = false;
        
        for(int i = tmp.length -1 ; i >= 0 ; i--){
            result.append(tmp[i]);
        }
        if (result.toString().equalsIgnoreCase(str.toString())){
            check = true;
        }
        return check;
        
    }
    public static void moveAll0ToEnd(int[] a){
        int count = 0;
        
        
        for (int x : a){
            count++;
        }
        int[] b = new int[count];
        int subcount = 0;
        
        for (int x : a){
            if (x != 0){
                b[subcount] = x;
                subcount++;
            }
        }
        for(int x : b){
            System.out.print(x +", ");
        }
    }
}
