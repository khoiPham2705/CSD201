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
public class oddArray {
    public static void main(String[] args) {
        int[] arr = {5,8,4,1,10};
        int oddCount = 0;
        for ( int x : arr){
            if (x % 2 == 1){
                oddCount++;
            }
            
        }
        int count = 0;
        int[] arr2 = new int[oddCount];
        for (int x : arr){
            if (x % 2 == 1){
                arr2[count] = x;
                count++;
            }
        }
        for (int i = 0 ; i < arr2.length; i++){
            System.out.println(arr2[i]);
        }
    }
}
