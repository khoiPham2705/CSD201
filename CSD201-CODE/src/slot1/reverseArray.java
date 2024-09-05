/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slot1;

/**
 *
 * @author DELL
 */
public class reverseArray {
    public static void main(String[] args) {
        int[] arr = {5,8,4,1,10,12,3,7,8};
        int tmp=0;
        
        for (int i = 0 ; i < arr.length / 2; i++){
            tmp = arr[i];
            arr[i] = arr[arr.length - i -1];
            arr[arr.length - i -1 ] = tmp;
        }
        for (int x : arr){
            System.out.print(x +",");
            
        }
        System.out.println("");
        System.out.println(findSecondMax(arr));
    }
    public static int findMin(int a[]){
        int min = a[0];
        int max = a[0];
        
        for (int x : a){
            if ( x < min){
                min = x;
            }
        }
        return min;
    }
    public static int findMax(int a[]){
        int min = a[0];
        int max = a[0];
        
        for (int x : a){
            if ( x > max){
                max = x;
            }
        }
        return max;
    }
    public static int findSecondMin(int a[]){
        int min = a[0];
        int min2 = Integer.MIN_VALUE;
        for (int x : a){
            if ( x < min){
                min = x;
            }
        }
        for (int x : a){
            if (x < min2 && x != min ){
                min2 = x;
            }
        }
        return min2;
    }
    public static int findSecondMax(int a[]){
        int max = a[0];
        int max2 = a[0];
        for (int x : a){
            if ( x > max){
                max = x;
            }
        }
        for (int x : a){
            if (x > max2 && x != max ){
                max2 = x;
            }
        }
        return max2;
    }
}
